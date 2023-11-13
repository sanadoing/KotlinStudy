package com.sanadoing.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = "여기는 value입니다!"
        val value2 = "여기는 value2입니다!"


        // val로 선언된 변수는 값을 바꿀 수 없다. var은 가능
        value = "여기는 value가 아닙니다 ~!~!"

        val test = "여기는 테스트 값입니다 !!!!"
        Log.e("MainActivite", test) //오류
        Log.w("MainActivite", test) //경고
        Log.i("MainActivite", test) //정보
        Log.d("MainActivite", test) //디버그
        Log.v("MainActivite", test) //상세

        Toast.makeText(this, test, Toast.LENGTH_LONG).show()
    }
}