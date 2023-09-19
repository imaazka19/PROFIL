package com.example.ima15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class skillAdapter(private val list: ArrayList<skilldata>):
RecyclerView.Adapter<skillAdapter.skillViewHolder>(){

    class skillViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaskill)
        private val desc = itemView.findViewById<TextView>(R.id.descskill)

        fun bind(get: skilldata) {
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): skillViewHolder {
        return skillViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.skill_list,parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: skillViewHolder, position: Int) {
        holder.bind((list[position]))
    }
}