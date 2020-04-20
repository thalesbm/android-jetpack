package bm.it.mobile.sample.courotines.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import bm.it.mobile.sample.R
import bm.it.mobile.sample.courotines.repository.CoroutinesRepository
import bm.it.mobile.sample.courotines.viewModel.CoroutinesViewModel
import kotlinx.android.synthetic.main.activity_coroutine.*

class CoroutinesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)

        val viewModel = CoroutinesViewModel(CoroutinesRepository())

        viewModel.getCustomObservable().observe(this, Observer { item ->
            count.text = item.toString()
        })

        viewModel.count()

        this.initToolbar()
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