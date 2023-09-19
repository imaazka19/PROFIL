package com.example.ima15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class educationAdapter(private val list: ArrayList<educationdata>):
RecyclerView.Adapter<educationAdapter.educatiomViewHolder>(){

    class educatiomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val nama = itemView.findViewById<TextView>(R.id.namaeducation)
        private val alamat = itemView.findViewById<TextView>(R.id.alamateducation)

        fun bind(get: educationdata) {
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): educatiomViewHolder {
        return educatiomViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.education_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: educatiomViewHolder, position: Int) {
        holder.bind(list[position])
    }
}