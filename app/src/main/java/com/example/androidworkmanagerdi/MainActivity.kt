package com.example.androidworkmanagerdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        enqueueWorker()
    }

    private fun enqueueWorker() {
        val request =
            OneTimeWorkRequestBuilder<ExampleWorker>()
                .build()
        WorkManager.getInstance(this).enqueue(request)
    }
}