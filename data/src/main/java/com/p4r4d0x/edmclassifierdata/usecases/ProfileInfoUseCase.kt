package com.p4r4d0x.edmclassifierdata.usecases

import com.p4r4d0x.edmclassifierdata.BaseUseCase
import com.p4r4d0x.edmclassifierdata.bo.UserStatsBO
import com.p4r4d0x.edmclassifierdata.repositories.ProfileInfoRepository

class ProfileInfoUseCase(private val repository: ProfileInfoRepository) :
    BaseUseCase<ProfileInfoUseCase.Params, UserStatsBO>() {

    data class Params(val userId: String)

    override suspend fun run(params: Params): UserStatsBO {
        repository.requestUserStats(params.userId)
        return UserStatsBO()
    }

}