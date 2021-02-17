package com.example.list_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.list_kotlin.ExampleItem
import com.example.list_kotlin.R

class ExampleAdapter(private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
      val imageView = LayoutInflater.from(parent.context).inflate(R.layout.example_item ,
      parent, false)

        return ExampleViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
      val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2

    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imageView = itemView.findViewById<ImageView>(R.id.image_view)
        val textView1 = itemView.findViewById<TextView>(R.id.text_view_1)
        val textView2 = itemView.findViewById<TextView>(R.id.text_view_2)


    }
}