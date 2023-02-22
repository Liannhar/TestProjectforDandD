package com.example.testprojectfordandd.mainScreenDnD5.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojectfordandd.R
import com.example.testprojectfordandd.mainScreenDnD5.main.data.Party
import com.example.testprojectfordandd.mainScreenDnD5.main.data.Character

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val recyclerViewParty: RecyclerView? = activity?.findViewById(R.id.rv_1)
        recyclerViewParty?.layoutManager = LinearLayoutManager(context)
        val lParty = listOf(Party.mock())
        val adapterParty = RecyclerAdapterParties(lParty, this)
        recyclerViewParty?.adapter = adapterParty

        val recyclerViewCharacters: RecyclerView? = activity?.findViewById(R.id.rv_2)
        recyclerViewCharacters?.layoutManager = LinearLayoutManager(context)
        val lCharacter = listOf(Character.mock())
        val adapterCharacters = RecyclerAdapterCharacters(lCharacter, this)
        recyclerViewCharacters?.adapter = adapterCharacters

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}
