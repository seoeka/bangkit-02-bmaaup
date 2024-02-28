package com.seoeka.kamaikomiu.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.seoeka.kamaikomiu.data.LocationData
import com.seoeka.kamaikomiu.R
import com.seoeka.kamaikomiu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionbar = supportActionBar
        actionbar!!.title = "KamaiKomiu"

        val locAdapter = ListLocAdapter(LocationData.getLocationData())
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        binding.rvTouristAttraction.layoutManager = layoutManager
        with(binding){
            rvTouristAttraction.adapter = locAdapter
            rvTouristAttraction.setHasFixedSize(true)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_main, menu)
        return true
    }
}