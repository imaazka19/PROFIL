package com.example.ima15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {


    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: educationAdapter
    val list = ArrayList<educationdata>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rveducation)
        educationView.layoutManager = LinearLayoutManager(this )

        list.add(educationdata("SD GebangSari 01", "Genuk, kec.genuk kab.semarang"))
        list.add(educationdata("SMP Hasanuddin 10 semarang", "genuk, kec.genuk kab.semarang"))
        list.add(educationdata("SMKN 1 Sayung", "JL.Raya Sayung Demak"))

        educationAdapter = educationAdapter(list)
        educationView.adapter = educationAdapter
    }
}