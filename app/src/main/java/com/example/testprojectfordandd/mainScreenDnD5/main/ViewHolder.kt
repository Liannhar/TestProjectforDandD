package com.example.testprojectfordandd.mainScreenDnD5.main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojectfordandd.R

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val textViewFirst: TextView = view.findViewById(R.id.tv_1)
    val textViewSecond: TextView = view.findViewById(R.id.tv_2)
    val imageView:ImageView = view.findViewById(R.id.iv_1)
}