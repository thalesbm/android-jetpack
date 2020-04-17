package bm.it.mobile.sample.retrofit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import bm.it.mobile.sample.R
import bm.it.mobile.sample.retrofit.repository.RestRepository
import bm.it.mobile.sample.retrofit.viewModel.RestViewModel
import kotlinx.android.synthetic.main.activity_rest.*

class RestActivity : AppCompatActivity() {

    private val viewModel = RestViewModel(RestRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest)

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
