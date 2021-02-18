package com.example.androidworkmanagerdi

import android.util.Log
import javax.inject.Inject

class MyApi @Inject constructor(){

    fun callForFun() {
        Log.i("TAG", "start call")
        Thread.sleep(2000)
        Log.i("TAG", "end call")
    }
}