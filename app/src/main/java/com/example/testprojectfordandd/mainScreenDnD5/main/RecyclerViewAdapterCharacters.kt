package com.example.testprojectfordandd.mainScreenDnD5.main


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testprojectfordandd.R
import com.example.testprojectfordandd.mainScreenDnD5.main.data.Character

class RecyclerViewAdapterCharacters(private val mas:List<Character>, private val context:MainFragment):
    RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_characters_and_groups, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewFirst.text = mas[position].name
        holder.textViewSecond.text = mas[position].classCharacter

        val url:String= mas[position].img
        Glide
            .with(context)
            .load(url)
            .centerCrop()
            .placeholder(R.drawable.baseline_360_24)
            .into(holder.imageView)
    }
}