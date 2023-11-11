package com.sanadoing.mykittyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.kitty_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, mykitty1Activity::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.kitty_2)
        val image3 = findViewById<ImageView>(R.id.kitty_3)
        val image4 = findViewById<ImageView>(R.id.kitty_4)
        val image5 = findViewById<ImageView>(R.id.kitty_5)
        val image6 = findViewById<ImageView>(R.id.kitty_6)
        val image7 = findViewById<ImageView>(R.id.kitty_7)
        val image8 = findViewById<ImageView>(R.id.kitty_8)
        val image9 = findViewById<ImageView>(R.id.kitty_9)

        image2.setOnClickListener {
            val intent = Intent(this, mykitty2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, mykitty3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, mykitty4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, mykitty5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, mykitty6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, mykitty7Activity::class.java)
            startActivity(intent)
        }
        image8.setOnClickListener {
            val intent = Intent(this, mykitty8Activity::class.java)
            startActivity(intent)
        }
        image9.setOnClickListener {
            val intent = Intent(this, mykitty9Activity::class.java)
            startActivity(intent)
        }
    }

}