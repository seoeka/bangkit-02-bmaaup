package com.seoeka.kamaikomiu.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.seoeka.kamaikomiu.data.LocationData
import com.seoeka.kamaikomiu.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvLocation: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvLocation = findViewById(R.id.rv_tourist_attraction)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        val locData = LocationData.getLocationData()
        val locAdapter = ListLocAdapter(locData)

        rvLocation.adapter = locAdapter
        rvLocation.layoutManager = GridLayoutManager(this, 2)
        rvLocation.setHasFixedSize(true)
    }
}