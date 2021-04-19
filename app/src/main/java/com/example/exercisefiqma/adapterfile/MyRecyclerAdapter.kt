package com.example.exercisefiqma.adapterfile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercisefiqma.R
import com.example.exercisefiqma.model.RecycleModel


class MyRecyclerAdapter(private val list: MutableList<RecycleModel>) : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.category_icon)
        val title: TextView = itemView.findViewById(R.id.title_man)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.category_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.image.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int = list.size
}



