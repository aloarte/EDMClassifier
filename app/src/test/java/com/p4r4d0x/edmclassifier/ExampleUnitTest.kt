package com.p4r4d0x.edmclassifier

import android.os.Build
import androidx.test.runner.AndroidJUnit4
import com.p4r4d0x.edmclassifier.di.viewModelModule
import com.p4r4d0x.edmclassifierdata.usecases.ProfileInfoUseCase
import io.mockk.MockKAnnotations
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.inject
import org.robolectric.annotation.Config


@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@Config(application = KoinTestApplication::class, sdk = [Build.VERSION_CODES.P])
class ExampleUnitTest : BaseKoinTest(viewModelModule) {


    private val profileInfoUseCase: ProfileInfoUseCase by inject()

    private lateinit var viewModelSUT: HistoryViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        viewModelSUT = HistoryViewModel(profileInfoUseCase)
    }

    @Test
    fun `dfdfsdf`() {
        viewModelSUT.getHistoryForProfile("")
        verify { viewModelSUT.getHistoryForProfile("") }

    }
}