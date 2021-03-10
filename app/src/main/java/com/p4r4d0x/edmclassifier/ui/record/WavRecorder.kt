package com.p4r4d0x.edmclassifier.ui.record

import android.content.Context
import android.media.AudioFormat
import android.media.MediaRecorder
import android.util.Log
import omrecorder.*
import java.io.File


class WavRecorder(
    private val pathValue: String,
    private val context: Context,
    private val peakCallback: (result: Float) -> Unit
) {

    init {
        //setupNoiseRecorder()
        setupRecorder()
    }

    private var recorder: Recorder? = null

    fun startRecording() {
        recorder!!.startRecording()
    }

    fun stopRecording() {
        recorder!!.stopRecording()
    }


    private fun setupRecorder() {
        recorder = OmRecorder.wav(
            PullTransport.Default(mic()) { audioChunk -> animateVoice((audioChunk.maxAmplitude() / 200.0).toFloat()) },
            file()
        )
    }

    private fun setupNoiseRecorder() {
        recorder = OmRecorder.wav(
            PullTransport.Noise(
                mic(),
                { audioChunk -> animateVoice((audioChunk.maxAmplitude() / 200.0).toFloat()) },
                WriteAction.Default(),
                { silenceTime ->
                    Log.e("silenceTime", silenceTime.toString())

                }, 200
            ), file()
        )
    }

    private fun animateVoice(maxPeak: Float) {
        peakCallback.invoke(maxPeak)
    }

    private fun mic(): PullableSource {
        return PullableSource.Default(
            AudioRecordConfig.Default(
                MediaRecorder.AudioSource.MIC, AudioFormat.ENCODING_PCM_16BIT,
                AudioFormat.CHANNEL_IN_MONO, 44100
            )
        )
    }

    private fun file() = File(pathValue)
    fun release() {}
}