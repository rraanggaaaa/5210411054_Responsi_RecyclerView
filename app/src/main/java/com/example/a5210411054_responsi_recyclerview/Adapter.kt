package com.example.a5210411054_responsi_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val data : ArrayList<Movie>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
class Adapter2 (private val data2 : ArrayList<Movie>) :
    RecyclerView.Adapter<ViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder2 {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder2(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        holder.bind(data2[position])
    }

    override fun getItemCount(): Int {
        return data2.size
    }

}
