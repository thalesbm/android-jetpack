package bm.it.mobile.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.sample.features.courotines.view.CoroutinesActivity
import bm.it.mobile.sample.features.koin.view.UserActivity
import bm.it.mobile.sample.features.retrofit.view.RestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainListAdapter.MainAdapterCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.adapter = MainListAdapter(createItems(), this)
    }

    private fun createItems(): List<Features> {
        val list = mutableListOf<Features>()
        list.add(Features(getString(R.string.button1), getString(R.string.text1), FeaturesEnum.LIVEDATA_KOIN.code))
        list.add(Features(getString(R.string.button2), getString(R.string.text2), FeaturesEnum.LIVEDATA_COROUTINES.code))
        list.add(Features(getString(R.string.button3), getString(R.string.text3), FeaturesEnum.LIVEDATA_COROUTINES_ROOM.code))
        list.add(Features(getString(R.string.button4), getString(R.string.text4), FeaturesEnum.LIVEDATA_COROUTINES_RETROFIT.code))
        return list
    }

    override fun onPressed(item: Int) {
        when (item) {
            FeaturesEnum.LIVEDATA_KOIN.code -> startActivity(Intent(this, UserActivity::class.java))
            FeaturesEnum.LIVEDATA_COROUTINES.code -> startActivity(Intent(this, CoroutinesActivity::class.java))
            FeaturesEnum.LIVEDATA_COROUTINES_RETROFIT.code -> startActivity(Intent(this, RestActivity::class.java))
        }
    }
}
