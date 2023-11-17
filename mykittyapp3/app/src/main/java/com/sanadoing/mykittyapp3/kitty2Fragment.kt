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


class kitty2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_kitty2, container, false)


        val items = mutableListOf<String>()
        items.add("밥 주면 안먹음")
        items.add("간식만 먹음")
        items.add("너무 촐싹거림")
        items.add("나만 따라다님")
        items.add("밥 주면 안먹음")
        items.add("간식만 먹음")
        items.add("너무 촐싹거림")
        items.add("나만 따라다님")
        items.add("밥 주면 안먹음")
        items.add("간식만 먹음")
        items.add("너무 촐싹거림")
        items.add("나만 따라다님")
        items.add("밥 주면 안먹음")
        items.add("간식만 먹음")
        items.add("너무 촐싹거림")
        items.add("나만 따라다님")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val image1 = view.findViewById<ImageView>(R.id.kitty1)
        image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_kitty2Fragment_to_kitty1Fragment)
        }
        val image3 = view.findViewById<ImageView>(R.id.kitty3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_kitty2Fragment_to_kitty3Fragment)

        }
        return view
    }


}