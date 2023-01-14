package com.example.a5210411054_responsi_recyclerview

import android.annotation.SuppressLint
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter
    lateinit var adapter2: Adapter2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init2()
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter

        init()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter2


    }

    private fun init(){
        recyclerView = findViewById(R.id.rv_itemlisthorizontal)

        var data2 = ArrayList<Movie>()
//HORIZONTAL
        data2.add(Movie(R.drawable.avengers1, "Avengers Endgame", "10"))
        data2.add(Movie(R.drawable.avengers2, "Avengers Infinity War", "9.5"))
        data2.add(Movie(R.drawable.avengers3, "Spiderman: No Way Home", "9"))
        data2.add(Movie(R.drawable.avengers4, "Spiderman: Spiderverse", "8"))
        data2.add(Movie(R.drawable.avengers5, "Spiderman: Home Coming", "9"))

        adapter2 = Adapter2(data2)
    }

    private fun init2() {
        recyclerView = findViewById(R.id.rv_itemlistvertical)

        var data = ArrayList<Movie>()
//VERTICAL
        data.add(Movie(R.drawable.film1, "Miracle in Cell No.7", "9"))
        data.add(Movie(R.drawable.film2, "Wiro Sableng", "9.5"))
        data.add(Movie(R.drawable.film3, "Gundala", "8.6"))
        data.add(Movie(R.drawable.film4, "Dilan1990", "9"))
        data.add(Movie(R.drawable.film5, "Guru-Guru Gokil", "9.8"))

        adapter = Adapter(data)
    }
}
