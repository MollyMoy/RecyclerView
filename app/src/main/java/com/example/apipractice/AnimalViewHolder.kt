package com.example.apipractice

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_movie_layout.view.*


class AnimalViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val animalName = view.animal_name

    fun bindModel(animals : String) {
        animalName.text = animals
    }

}
