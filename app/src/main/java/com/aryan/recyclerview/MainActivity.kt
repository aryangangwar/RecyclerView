package com.aryan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)
        recycler_view.adapter = MyAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size : Int) : List<DemoItem> {
        val list = ArrayList<DemoItem>()

        for (i in 0 until size) {

            val drawable = when (i % 3) {
                0 -> R.drawable.ic_alarm
                1 -> R.drawable.ic_child
                else -> R.drawable.ic_user
            }
            val item = DemoItem(drawable,"Item $i","Line $i")
            list += item
        }
        return list
    }
}