package com.p4r4d0x.edmclassifier.datasource

import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO
import com.p4r4d0x.edmclassifierdata.sources.ProfileInfoSource

class ProfileInfoDataSource : ProfileInfoSource {
    override fun getUserStats(userId: String): UserStatsBO {
        return UserStatsBO()
    }
}