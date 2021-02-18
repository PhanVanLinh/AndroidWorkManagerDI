package com.example.androidworkmanagerdi;

import android.content.Context;
import android.util.Log

import androidx.hilt.work.HiltWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class ExampleWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val myApi: MyApi
) : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        Log.d("WORKER", "I am the worker")
        myApi.callForFun()
        return Result.success()
    }
}