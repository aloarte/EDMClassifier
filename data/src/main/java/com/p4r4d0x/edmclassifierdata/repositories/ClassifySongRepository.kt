package com.p4r4d0x.edmclassifierdata.repositories

import com.p4r4d0x.edmclassifierdomain.SongClassification
import com.p4r4d0x.edmclassifierdomain.SongData

class ClassifySongRepository(
    private val classifySongSource: ClassifySongSource
) {

    fun requestUserStats(songData: SongData): List<SongClassification> {
        return classifySongSource.classifySong(songData)
    }
}

interface ClassifySongSource {
    fun classifySong(songData: SongData): List<SongClassification>
}


