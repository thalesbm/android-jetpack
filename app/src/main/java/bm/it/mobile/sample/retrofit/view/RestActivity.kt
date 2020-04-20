package bm.it.mobile.sample.retrofit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import bm.it.mobile.sample.R
import bm.it.mobile.sample.retrofit.repository.RestRepository
import bm.it.mobile.sample.retrofit.viewModel.RestViewModel
import kotlinx.android.synthetic.main.activity_retrofit.*

class RestActivity : AppCompatActivity() {

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

        initToolbar()
    }

    private fun callRest() {
        viewModel.callRepository()
    }

    private fun initToolbar() {
        val actionbar = supportActionBar
        actionbar?.let{
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
