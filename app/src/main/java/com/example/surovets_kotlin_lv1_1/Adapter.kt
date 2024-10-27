package com.example.surovets_kotlin_lv1_1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<MyViewHolder>() {

    private var items = ArrayList<Int>()

    fun setItems(list: ArrayList<Int>) {
        items.clear()
        items.addAll(list)
    }

    fun AddItem(item: Int) {
        items.add(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item1_view, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun getItems() : ArrayList<Int> {
        return items
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }
}