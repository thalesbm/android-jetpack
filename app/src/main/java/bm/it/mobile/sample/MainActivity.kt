package bm.it.mobile.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.sample.courotines.view.CoroutinesActivity
import bm.it.mobile.sample.rest.view.RestActivity
import bm.it.mobile.sample.user.view.UserActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, RestActivity::class.java))
        }

        button3.setOnClickListener {

        }

        button4.setOnClickListener {
            startActivity(Intent(this, CoroutinesActivity::class.java))
        }
    }
}
