package com.recyclerviewwithheader

import android.R
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.recyclerviewwithheader.adapter.headerAdapter
import com.recyclerviewwithheader.adapter.wallpaperAdapter
import com.recyclerviewwithheader.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecylerView()

    }

    private fun setupRecylerView() {

        val headerUrls = mutableListOf<Drawable>()
        val wallpaperUrls = mutableListOf<Drawable>()


        headerUrls.add(resources.getDrawable(R.drawable.ic_btn_speak_now))
        headerUrls.add(resources.getDrawable(R.drawable.ic_btn_speak_now))
        headerUrls.add(resources.getDrawable(R.drawable.ic_btn_speak_now))


        for (i in 1..100) {
            wallpaperUrls.add(resources.getDrawable(R.drawable.ic_delete))
        }


        var headerAdapter = headerAdapter(headerUrls)
        var wallpaperAdapter = wallpaperAdapter(wallpaperUrls)




        binding.wallpaperRecylerView.apply {
            val concatAdapter = ConcatAdapter(headerAdapter, wallpaperAdapter)
            adapter = concatAdapter


            layoutManager = GridLayoutManager(this@MainActivity, 3)


        }


    }
}