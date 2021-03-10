package com.p4r4d0x.edmclassifier.ui.history.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.p4r4d0x.edmclassifier.R
import com.p4r4d0x.edmclassifier.ui.history.viewmodel.HistoryViewModel
import org.koin.android.ext.android.inject

class HistoryActivity : AppCompatActivity() {

    private val historyViewModel: HistoryViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        historyViewModel.getHistoryForProfile("")
    }
}