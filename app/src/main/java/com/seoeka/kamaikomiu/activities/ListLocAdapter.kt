package com.seoeka.kamaikomiu.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.seoeka.kamaikomiu.data.Location
import com.seoeka.kamaikomiu.R


class ListLocAdapter(private val listLoc: List<Location>) : RecyclerView.Adapter<ListLocAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_loc, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listLoc.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, address, photo, openingHours, rating, desc) = listLoc[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvAddress.text = address
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_loc)
        val tvName: TextView = itemView.findViewById(R.id.tv_loc_name)
        val tvAddress: TextView = itemView.findViewById(R.id.tv_loc_adr)
    }

}
