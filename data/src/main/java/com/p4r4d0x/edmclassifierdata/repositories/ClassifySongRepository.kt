package com.p4r4d0x.edmclassifierdata.repositories

import com.p4r4d0x.edmclassifierdata.bo.SongClassificationBO
import com.p4r4d0x.edmclassifierdata.bo.SongDataBO

class ClassifySongRepository(
    private val classifySongSource: ClassifySongSource
) {

    fun requestUserStats(songData: SongDataBO): List<SongClassificationBO> {
        return classifySongSource.classifySong(songData)
    }
}

interface ClassifySongSource {
    fun classifySong(songData: SongDataBO): List<SongClassificationBO>
}


