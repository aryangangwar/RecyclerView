package com.aryan.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_view.view.*

class MyAdapter(private val exampleList : List<DemoItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_view,
        parent,false)  // REUSABLE

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)  // FROM DATA CLASS
        holder.textView1.text = currentItem.text1                      // FROM DATA CLASS
        holder.textView2.text = currentItem.text2                       // FROM DATA CLASS

    }

    override fun getItemCount() = exampleList.size

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val imageView : ImageView = itemView.img_1
        val textView1 : TextView = itemView.text_view_1
        val textView2 : TextView = itemView.tv_2

    }

}