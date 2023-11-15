package com.sanadoing.good_words_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("큰 목표를 이루고 싶으면 허락을 구하지 마라.")
        sentenceList.add("일반적인 것을 잃을 위험을 감수하지 않으면 평범한 것에 만족해야 한다.")
        sentenceList.add("늘 하던 대로 하면 늘 얻던 것을 얻는다.")
        sentenceList.add("기회는 일어나는 것이 아니라 만들어내는 것이다.")
        sentenceList.add("지옥을 겪고 있다면 계속 겪어 나가라")
        sentenceList.add("게으른 예술가가 만든 명작은 없다.")
        sentenceList.add("나는 내가 더 노력할수록 운이 더 좋아진다는 걸 발견했다.")
        sentenceList.add("위대한 일들을 이루기 전에 스스로에게 위대한 일들을 기대해야 한다.")

        val sentenceadapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter
    }
}