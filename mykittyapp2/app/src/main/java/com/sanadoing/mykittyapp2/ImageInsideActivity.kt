package com.sanadoing.mykittyapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)
        var getData = intent.getStringExtra("data")
//        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()
        val imageNumber = findViewById<ImageView>(R.id.kitty1ImageArea)
        if (getData == "1"){
            imageNumber.setImageResource(R.drawable.kitty_1)
        }
        if (getData == "2"){
            imageNumber.setImageResource(R.drawable.kitty_2)
        }
        if (getData == "3"){
            imageNumber.setImageResource(R.drawable.kitty_3)
        }
        if (getData == "4"){
            imageNumber.setImageResource(R.drawable.kitty_4)
        }
        if (getData == "5"){
            imageNumber.setImageResource(R.drawable.kitty_5)
        }
        if (getData == "6"){
            imageNumber.setImageResource(R.drawable.kitty_6)
        }
        if (getData == "7"){
            imageNumber.setImageResource(R.drawable.kitty_7)
        }
        if (getData == "8"){
            imageNumber.setImageResource(R.drawable.kitty_8)
        }
        if (getData == "9"){
            imageNumber.setImageResource(R.drawable.kitty_9)
        }
    }
}