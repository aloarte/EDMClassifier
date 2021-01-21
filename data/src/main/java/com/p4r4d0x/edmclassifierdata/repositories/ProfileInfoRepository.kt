package com.p4r4d0x.edmclassifierdata.repositories

import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO

class ProfileInfoRepository(
    private val profileInfoSource: ProfileInfoSource
) {

    fun requestUserStats(userId: Long): List<UserStatsBO> {
        return profileInfoSource.getUserStats(userId)
    }

}

interface ProfileInfoSource {
    fun getUserStats(userId: Long): List<UserStatsBO>
}
