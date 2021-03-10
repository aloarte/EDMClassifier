package com.p4r4d0x.edmclassifier.ui.record.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.p4r4d0x.edmclassifierdomain.AudioExtractorOperator
import kotlinx.coroutines.launch

class AudioFeaturesViewModel : ViewModel() {

    private val _audioFeatures: MutableLiveData<String> by lazy { MutableLiveData() }
    val audioFeatures: MutableLiveData<String>
        get() = _audioFeatures


    fun processRecordedAudio(fileName: String) {
        viewModelScope.launch {
            val audioFeatures = AudioExtractorOperator().processAudioSource(fileName)
            _audioFeatures.value = audioFeatures
//            updateAudioFeatures(audioFeatures)
        }
    }

//    fun updateAudioFeatures(audioFeatures: String) {
//        _audioFeatures.value = audioFeatures
//    }
}