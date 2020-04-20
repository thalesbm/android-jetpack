package bm.it.mobile.sample.courotines.repository

import kotlinx.coroutines.*

class CoroutinesRepository {

    private val parentJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + parentJob)

    fun getNumber(number: Int): Int {
        coroutineScope.launch {
            delay(4_000)
        }
        return number
    }
}