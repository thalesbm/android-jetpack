package bm.it.mobile.sample.rest.viewModel

import bm.it.mobile.sample.rest.repository.RestRepository

class RestViewModel(private val repository: RestRepository) {

    fun callRepository() {
        repository.callRest()
    }
}