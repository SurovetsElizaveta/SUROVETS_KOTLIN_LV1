package com.example.surovets_kotlin_lv1_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var faBtn:FloatingActionButton

    val adapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        faBtn = findViewById(R.id.fab)

        recyclerView.adapter = adapter

        faBtn.setOnClickListener {
            adapter.AddItem(adapter.itemCount + 1)
        }

        if (savedInstanceState == null) {
            adapter.setItems(ArrayList<Int>(listOf<Int>(1, 2, 3, 4, 5, 6, 7)))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putIntegerArrayList("KEY", adapter.getItems())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        savedInstanceState.getIntegerArrayList("KEY")?.let { adapter.setItems(it) }
    }

}