package org.tensorflow.lite.examples.posenet

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class index : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstpage)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, swipecard::class.java)
            startActivity(intent)
        }
    }
}
