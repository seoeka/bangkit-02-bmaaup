package com.seoeka.kamaikomiu.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.seoeka.kamaikomiu.R
import com.seoeka.kamaikomiu.databinding.ActivityDetailBinding
import com.seoeka.kamaikomiu.data.Location

@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    companion object {
        const val EXTRA_LOCATION = "extra_location"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topAppBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val locations = intent.getParcelableExtra<Location>(EXTRA_LOCATION)
        if (locations != null){
            with(binding){
                Glide
                    .with(this@DetailActivity)
                    .load(locations.photo)
                    .into(imgLoc)
                tvLocName.text = locations.name
                tvLocAdr.text= locations.address
                tvLocOpen.text = locations.openingHours
                tvLocRate.text = locations.rating
                tvLocDesc.text = locations.desc
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_detail, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            R.id.action_share -> {
                val locations = intent.getParcelableExtra<Location>(EXTRA_LOCATION)
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Ayo jangan lupa berkunjung ke ${locations!!.name} kalo ko pigi berkunjung ke ${locations.address}. ${locations.gMaps}")
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(sendIntent, "Bagikan"))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}