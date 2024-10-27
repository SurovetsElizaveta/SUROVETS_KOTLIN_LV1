package com.example.surovets_kotlin_lv1_1

import android.graphics.Color
import android.provider.CalendarContract.Colors
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
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

//class MyViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
//    val it_image = R.id.item1_image
//    val it_text = view.findViewById<TextView>(R.id.item1_text)
//
//    fun bind(num : Int) {
//        Log.d("ADD", "bind1")
//        it_text.text = "$num"
//    }
//
//    fun getItemView() : Int {
//        return 0
//    }
//}

//class MyViewHolder2(view: View) : MyViewHolder(view) {
//    val it_image = view.findViewById<ImageView>(R.id.item2_image)
//    val it_text = view.findViewById<TextView>(R.id.item2_text)
//
//    override fun bind(num : Int) {
//        Log.d("ADD", "bind2")
//        it_text.text = "$num"
//    }
//
//    override fun getItemView(): Int {
//        return 1
//    }
//}