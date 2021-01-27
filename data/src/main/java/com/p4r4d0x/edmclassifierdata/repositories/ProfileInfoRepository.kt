package com.p4r4d0x.edmclassifierdata.repositories

import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO
import com.p4r4d0x.edmclassifierdata.sources.ProfileInfoSource

class ProfileInfoRepository(
    private val profileInfoSource: ProfileInfoSource
) {

    fun requestUserStats(userId: String): UserStatsBO {
        return profileInfoSource.getUserStats(userId)
    }
}


