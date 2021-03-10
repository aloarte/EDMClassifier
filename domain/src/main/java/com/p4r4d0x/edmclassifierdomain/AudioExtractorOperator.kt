package com.p4r4d0x.edmclassifierdomain

import facade.AudioFeaturesManager
import model.AudioFeatures
import model.ModuleParams
import model.enums.StatisticalMeasureType
import model.exceptions.AudioAnalysisException

class AudioExtractorOperator {

    fun processAudioSource(path: String): String {
        val mgr = AudioFeaturesManager()
        val moduleParams = ModuleParams(44100, 0.01, 0.01, 1.0, 1.0)
        val measureTypes: MutableList<StatisticalMeasureType> = ArrayList()
        measureTypes.add(StatisticalMeasureType.Mean)
        measureTypes.add(StatisticalMeasureType.StandardDeviation)
        moduleParams.statisticalMeasures = measureTypes

        return try {
            println("VALUES")
            stringifyAudioFeatures(mgr.processAudioSource(path, moduleParams))

        } catch (e: AudioAnalysisException) {
            println("exception ${e.message}")
            ""
        }

    }

    fun stringifyAudioFeatures(audioFeatures: AudioFeatures) =
        "${audioFeatures.audioShortFeaturesList[0]}"
}