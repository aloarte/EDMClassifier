package com.p4r4d0x.edmclassifier

import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoSource

class ProfileInfoDataSource : ProfileInfoSource {
    override fun getUserStats(userId: Long): List<UserStatsBO> {
        return listOf(UserStatsBO())
    }
}