package com.example.herbalternatif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHerbals: RecyclerView
    private var list: ArrayList<Herbal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "Herbal Alternatif"

        rvHerbals = findViewById(R.id.rv_herbals)
        rvHerbals.setHasFixedSize(true)

        list.addAll(HerbalData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        return when(item.itemId) {
            R.id.action_user -> {
                moveAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun moveAbout() {
        val aboutMove = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutMove)
    }

    private fun showRecyclerList() {
        rvHerbals.layoutManager = LinearLayoutManager(this)
        val listHerbalAdapter = ListHerbalAdapter(list)
        rvHerbals.adapter = listHerbalAdapter

        listHerbalAdapter.setOnItemClickCallback(object : ListHerbalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Herbal) {
                showSelectedHerbal(data)
            }
        })

    }

    private fun showSelectedHerbal(herbal: Herbal) {
        val moveWithDataHerbalIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataHerbalIntent.putExtra(DetailActivity.EXTRA_NAME, herbal.name)
        moveWithDataHerbalIntent.putExtra(DetailActivity.EXTRA_DETAIL, herbal.detail)
        moveWithDataHerbalIntent.putExtra(DetailActivity.EXTRA_MEDS, herbal.meds)
        moveWithDataHerbalIntent.putExtra(DetailActivity.EXTRA_USES, herbal.uses)
        moveWithDataHerbalIntent.putExtra(DetailActivity.EXTRA_IMG, herbal.photo)
        startActivity(moveWithDataHerbalIntent)
    }
}
