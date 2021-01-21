package com.p4r4d0x.edmclassifier

import androidx.lifecycle.ViewModel
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoRepository

class HistoryViewModel(private val profileInfoRepository: ProfileInfoRepository) : ViewModel() {
    fun getHistoryForProfile(profileId: Long) {
        profileInfoRepository.requestUserStats(profileId)
    }
}