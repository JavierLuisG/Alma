package com.example.alma.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alma.R
import com.example.alma.view.adapter.StoreAdapter

class StoreFragment : Fragment() {

    lateinit var recyclerStore: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_store, container, false)
        recyclerStore = view.findViewById(R.id.recyclerViewStore)
        val adapter = StoreAdapter() // esto llama al adaptador donde se creo la funcionalidad de la Store
        recyclerStore.layoutManager = LinearLayoutManager(context)
        recyclerStore.adapter = adapter
        return view
    }
}