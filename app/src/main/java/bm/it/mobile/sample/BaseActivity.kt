package bm.it.mobile.sample

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        initToolbar()
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