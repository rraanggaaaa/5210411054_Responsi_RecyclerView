package com.example.a5210411054_responsi_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder2(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.view_item, parent, false))
{
    private lateinit var imageView: ImageView
    private lateinit var tv_title: TextView
    private lateinit var tv_rating: TextView

    init {
        imageView = itemView.findViewById(R.id.iv_list_horizontal)
        tv_title = itemView.findViewById(R.id.tv_title)
        tv_rating= itemView.findViewById(R.id.tv_rating)
    }

    fun bind(data: Movie){
        imageView.setImageResource(data.ImageView)
        tv_title.text = data.tv_title
        tv_rating.text = data.tv_rating
    }
}
class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.view_item2, parent, false))
{
    private lateinit var imageView: ImageView
    private lateinit var tv_title: TextView
    private lateinit var tv_rating: TextView

    init {
        imageView = itemView.findViewById(R.id.iv_list_vertical)
        tv_title = itemView.findViewById(R.id.tv_title)
        tv_rating= itemView.findViewById(R.id.tv_rating)
    }

    fun bind(data: Movie){
        imageView.setImageResource(data.ImageView)
        tv_title.text = data.tv_title
        tv_rating.text = data.tv_rating
    }
}