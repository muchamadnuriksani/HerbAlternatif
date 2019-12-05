package com.example.herbalternatif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_MEDS = "extra_meds"
        const val EXTRA_USES = "extra_uses"
        const val EXTRA_IMG = "extra_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = intent.getStringExtra(EXTRA_NAME)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvMeds: TextView = findViewById(R.id.tv_meds)
        val tvUses: TextView = findViewById(R.id.tv_uses)
        val imgHerbal: ImageView = findViewById(R.id.img_item_photo_detail)

        tvName.text = intent.getStringExtra(EXTRA_NAME)
        tvDetail.text = intent.getStringExtra(EXTRA_DETAIL)
        tvMeds.text = intent.getStringExtra(EXTRA_MEDS)
        tvUses.text = intent.getStringExtra(EXTRA_USES)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_IMG, 0))
            .apply(RequestOptions().override(200))
            .into(imgHerbal)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val backMove = Intent(this@DetailActivity, MainActivity::class.java)
        startActivity(backMove)
        return true
    }
}
