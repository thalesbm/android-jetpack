package bm.it.mobile.sample.features.retrofit.view

import android.os.Bundle
import androidx.lifecycle.Observer
import bm.it.mobile.sample.commons.BaseActivity
import bm.it.mobile.sample.R
import bm.it.mobile.sample.features.retrofit.repository.RestRepository
import bm.it.mobile.sample.features.retrofit.viewModel.RestViewModel
import kotlinx.android.synthetic.main.activity_retrofit.*

class RestActivity : BaseActivity() {

    private val viewModel = RestViewModel(RestRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        button3.setOnClickListener {
            callRest()
        }

        viewModel.getCustomObservable().observe(this, Observer { item ->
            response.text = item.userModel.firstName
        })

        viewModel.getCustomStringObservable().observe(this, Observer { item ->
            response.text = item
        })
    }

    private fun callRest() {
        viewModel.callRepository()
    }
}
