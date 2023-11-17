package com.sanadoing.mykittyapp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class kitty3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_kitty3, container, false)


        val items = mutableListOf<String>()
        items.add("자기 주장이 강함")
        items.add("나만 보면 울음")
        items.add("똥을 잘쌈")
        items.add("자기 주장이 강함")
        items.add("나만 보면 울음")
        items.add("똥을 잘쌈")
        items.add("자기 주장이 강함")
        items.add("나만 보면 울음")
        items.add("똥을 잘쌈")
        items.add("자기 주장이 강함")
        items.add("나만 보면 울음")
        items.add("똥을 잘쌈")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val image1 = view.findViewById<ImageView>(R.id.kitty1)
        image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_kitty3Fragment_to_kitty1Fragment)
        }
        val image2 = view.findViewById<ImageView>(R.id.kitty2)
        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_kitty3Fragment_to_kitty2Fragment)

        }
        return view
    }


}