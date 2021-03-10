package com.p4r4d0x.edmclassifier.ui.history.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO
import com.p4r4d0x.edmclassifierdata.usecases.ProfileInfoUseCase

class HistoryViewModel(private val getProfileInfoUseCase: ProfileInfoUseCase) : ViewModel() {

    private val _savedProfile: MutableLiveData<UserStatsBO> by lazy { MutableLiveData<UserStatsBO>() }
    val savedProfile: UserStatsBO?
        get() = _savedProfile.value


    fun getHistoryForProfile(profileId: String) {
        val params = ProfileInfoUseCase.Params(profileId)
        getProfileInfoUseCase.invoke(viewModelScope, params = params) {
            _savedProfile.value = it
        }
    }
}