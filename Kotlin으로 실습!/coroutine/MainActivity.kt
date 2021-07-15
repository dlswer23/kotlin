package com.example.coroutine

import android.provider.Settings
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity{

    val scope = CoroutineScope(Dispatchers.IO) //CoroutineScope 생성
    val job = scope.launch { // 이 함수를 이제 위 scope 에서 사용
        delay(1000)
        println("Work is done")
    }


}