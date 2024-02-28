package com.seoeka.kamaikomiu.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.seoeka.kamaikomiu.data.LocationData
import com.seoeka.kamaikomiu.R
import com.seoeka.kamaikomiu.data.Location
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page){
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}