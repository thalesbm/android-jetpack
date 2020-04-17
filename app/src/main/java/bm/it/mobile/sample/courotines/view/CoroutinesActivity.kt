package bm.it.mobile.sample.courotines.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.sample.R
import bm.it.mobile.sample.courotines.repository.CoroutinesRepository
import bm.it.mobile.sample.courotines.viewModel.CoroutinesViewModel

class CoroutinesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)

        val viewModel = CoroutinesViewModel(CoroutinesRepository())
        viewModel.count()
    }
}