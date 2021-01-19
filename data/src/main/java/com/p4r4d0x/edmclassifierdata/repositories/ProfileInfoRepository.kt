package com.p4r4d0x.edmclassifierdata.repositories

import com.p4r4d0x.edmclassifierdomain.UserStats

class ProfileInfoRepository(
    private val profileInfoSource: ProfileInfoSource
) {

    fun requestUserStats(userId: Long): List<UserStats> {
        return profileInfoSource.getUserStats(userId)
    }

}

interface ProfileInfoSource {
    fun getUserStats(userId: Long): List<UserStats>
}
