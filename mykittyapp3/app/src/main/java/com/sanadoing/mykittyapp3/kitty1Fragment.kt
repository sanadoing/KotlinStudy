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


class kitty1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_kitty1, container, false)

        val items = mutableListOf<String>()
        items.add("밥을 잘먹음")
        items.add("나를 따라다님")
        items.add("눈 색이 예쁨")
        items.add("밥을 잘먹음")
        items.add("나를 따라다님")
        items.add("눈 색이 예쁨")
        items.add("밥을 잘먹음")
        items.add("나를 따라다님")
        items.add("눈 색이 예쁨")
        items.add("밥을 잘먹음")
        items.add("나를 따라다님")
        items.add("눈 색이 예쁨")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val image2 = view.findViewById<ImageView>(R.id.kitty2)
        image2.setOnClickListener {
it.findNavController().navigate(R.id.action_kitty1Fragment_to_kitty2Fragment)
        }
        val image3 = view.findViewById<ImageView>(R.id.kitty3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_kitty1Fragment_to_kitty3Fragment)

        }

        return view
    }


}