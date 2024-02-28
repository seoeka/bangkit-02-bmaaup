package com.seoeka.kamaikomiu.activities

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.seoeka.kamaikomiu.data.Location
import com.seoeka.kamaikomiu.databinding.ListLocBinding

class ListLocAdapter(private val listLoc: List<Location>) : RecyclerView.Adapter<ListLocAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ListLocBinding.inflate(LayoutInflater.from(parent.context), parent, false) // Menggunakan ViewBinding
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listLoc.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listLoc[position])
    }

    inner class ListViewHolder(private val binding: ListLocBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(location: Location) {
            Glide.with(binding.root.context)
                .load(location.photo)
                .into(binding.imgLoc)
            binding.tvLocName.text = location.name
            binding.tvLocAdr.text = location.address

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_LOCATION, listLoc[adapterPosition])
                binding.root.context.startActivity(intent)
            }
        }
    }

}
