package bm.it.mobile.sample.features.koin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import bm.it.mobile.sample.commons.BaseActivity
import bm.it.mobile.sample.R

class UserActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        addFragmentTo(R.id.content_frame, createFragment())
    }

    private fun createFragment(): UserFragment {
        return UserFragment()
    }

    private fun addFragmentTo(
        containerId: Int,
        fragment: Fragment,
        tag: String = ""
    ) {
        supportFragmentManager.beginTransaction().add(containerId, fragment, tag).commit()
    }
}
