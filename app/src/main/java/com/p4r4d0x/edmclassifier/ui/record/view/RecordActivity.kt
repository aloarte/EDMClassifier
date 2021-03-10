package com.p4r4d0x.edmclassifier.ui.record.view

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import com.p4r4d0x.edmclassifier.R
import com.p4r4d0x.edmclassifier.databinding.ActivityRecorderBinding
import com.p4r4d0x.edmclassifier.ui.base.BaseActivity
import com.p4r4d0x.edmclassifier.ui.record.WavRecorder
import com.p4r4d0x.edmclassifier.ui.record.viewmodel.AudioFeaturesViewModel

private const val REQUEST_RECORD_AUDIO_PERMISSION = 200

class RecordActivity : BaseActivity<ActivityRecorderBinding, AudioFeaturesViewModel>(
    R.layout.activity_recorder,
    AudioFeaturesViewModel::class
) {
    private var fileName: String = ""
    private lateinit var wavRecorder: WavRecorder
    private var permissionToRecordAccepted = false
    private var permissions: Array<String> = arrayOf(Manifest.permission.RECORD_AUDIO)

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        permissionToRecordAccepted = if (requestCode == REQUEST_RECORD_AUDIO_PERMISSION) {
            grantResults[0] == PackageManager.PERMISSION_GRANTED
        } else {
            false
        }
        if (!permissionToRecordAccepted) finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fileName = "${applicationContext.externalCacheDir?.absolutePath}/Wavfile2.wav"
        wavRecorder = WavRecorder(fileName, this) {
            mBinding.btnExtract.animate().scaleX(1 + it).scaleY(1 + it).setDuration(10).start()
        }
        ActivityCompat.requestPermissions(this, permissions, REQUEST_RECORD_AUDIO_PERMISSION)
    }

    override fun onStop() {
        super.onStop()
        wavRecorder.release()
    }

    override fun setUpDataBinding(
        binding: ActivityRecorderBinding,
        viewModel: AudioFeaturesViewModel
    ) {
        with(binding) {
            btnRecord.setOnClickListener {
                startRecording()
            }
            btnStop.setOnClickListener {
                stopRecording()
            }
            btnExtract.setOnClickListener {
                extractAudioFeatures()
            }
        }
    }

    override fun observeViewModel(viewModel: AudioFeaturesViewModel) {
        viewModel.audioFeatures.observe(this) { newName ->
            Log.d("ALRALR", "FEATURES: $newName")

            mBinding.tvFeatures.text = newName
        }
    }

    private fun extractAudioFeatures() {
        mViewModel.processRecordedAudio(fileName)
    }

    private fun startRecording() {
        wavRecorder.startRecording()
    }

    private fun stopRecording() {
        wavRecorder.stopRecording()
    }
}
