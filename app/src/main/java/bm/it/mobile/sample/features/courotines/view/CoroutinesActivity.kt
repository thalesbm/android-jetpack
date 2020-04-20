package bm.it.mobile.sample.features.courotines.view

import android.os.Bundle
import androidx.lifecycle.Observer
import bm.it.mobile.sample.commons.BaseActivity
import bm.it.mobile.sample.R
import bm.it.mobile.sample.features.courotines.repository.CoroutinesRepository
import bm.it.mobile.sample.features.courotines.viewModel.CoroutinesViewModel
import kotlinx.android.synthetic.main.activity_coroutine.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.launch

class CoroutinesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)

        val viewModel = CoroutinesViewModel(CoroutinesRepository())

        viewModel.getCustomObservable().observe(this, Observer { item ->
            count.text = item.toString()
        })

        CoroutineScope(Default).launch {
            println(Thread.currentThread().name)
            viewModel.count()
        }
    }
}