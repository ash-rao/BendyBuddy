package org.tensorflow.lite.examples.posenet

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class swipecard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.swipe)
        val button = findViewById<Button>(R.id.cam_button1)
        button.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            intent.putExtra("imageName", 0)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.cam_button2)
        button2.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            intent.putExtra("imageName", 1)
            startActivity(intent)
        }
    }
}