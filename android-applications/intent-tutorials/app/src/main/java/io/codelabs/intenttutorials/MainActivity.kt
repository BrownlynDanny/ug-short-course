package io.codelabs.intenttutorials

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_button.setOnClickListener {
            moveToSecondActivity()
        }
    }

    fun moveToSecondActivity() {

        val intent = Intent(this,SecondActivity::class.java)
        println(456)
        startActivity(intent)
    }
}
