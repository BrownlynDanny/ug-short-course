package io.codelabs.firstproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tap_me.setOnClickListener {
            Toast.makeText(applicationContext, "Tapped me!", Toast.LENGTH_SHORT).show()
        }
    }

}
