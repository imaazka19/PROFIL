package com.example.ima15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: hobbyAdapter
    var list = ArrayList<hobbydata>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvhobby)
        hobbyView.layoutManager = LinearLayoutManager(this )

        list.add(hobbydata("renang", "berenang"))
        list.add(hobbydata("___", "___"))

        hobbyAdapter = hobbyAdapter(list)
        hobbyView.adapter = hobbyAdapter
    }
}