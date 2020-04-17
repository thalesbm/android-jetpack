package bm.it.mobile.sample.rest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.sample.R
import bm.it.mobile.sample.rest.repository.RestRepository
import bm.it.mobile.sample.rest.viewModel.RestViewModel
import kotlinx.android.synthetic.main.activity_rest.*

class RestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest)

        button3.setOnClickListener {
            callRest()
        }
    }

    private fun callRest() {
        val viewModel = RestViewModel(RestRepository())
        viewModel.callRepository()
    }
}
