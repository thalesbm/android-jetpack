package bm.it.mobile.sample.koin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import bm.it.mobile.sample.R

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        addFragmentTo(R.id.content_frame, createFragment())

        initToolbar()
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
