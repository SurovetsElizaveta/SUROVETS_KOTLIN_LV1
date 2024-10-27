package com.example.surovets_kotlin_lv1_1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val it_image = view.findViewById<ImageView>(R.id.item1_image)
    val it_text = view.findViewById<TextView>(R.id.item1_text)

    fun bind(num : Int) {
        if (num % 2 == 0) {
            it_image.setBackgroundResource(R.color.red)
        }
        else {
            it_image.setBackgroundResource(R.color.blue)
        }
        it_text.text = "$num"
    }
}
