package bm.it.mobile.sample.features.courotines.repository

import kotlinx.coroutines.delay

class CoroutinesRepository {

    suspend fun getNumber(number: Int): Int {
        delay(1500)
        return number
    }
}