package com.example.ima15

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    var listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(
            PortofolioData(
                R.drawable.web, "Link Github",
                "List Project di Github", "https://github.com/imaazka19"
            ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "LKS Web",
            "Project STS", "https://github.com/imaazka19/PROJEK-STS"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android, "LKS Andoid",
            "Project Latish LKS bidang Android", "https://github.com/imaazka19/PROFILGURU"
        ))

        portofolioView = findViewById(R.id.rvportofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter


    }
}