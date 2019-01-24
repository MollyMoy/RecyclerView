package com.example.apipractice

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.apipractice.R.id.parent

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<AnimalViewHolder>() {
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bindModel(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): AnimalViewHolder {
        return AnimalViewHolder(LayoutInflater.from(context).inflate(R.layout.item_movie_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size

    }
}
