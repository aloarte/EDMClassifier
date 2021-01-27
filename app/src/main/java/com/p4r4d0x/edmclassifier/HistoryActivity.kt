package com.p4r4d0x.edmclassifier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

class HistoryActivity : AppCompatActivity() {

    private val historyViewModel: HistoryViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        historyViewModel.getHistoryForProfile("")
    }
}