package com.p4r4d0x.edmclassifierdata.sources

import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO

interface ProfileInfoSource {
    fun getUserStats(userId: String): UserStatsBO
}