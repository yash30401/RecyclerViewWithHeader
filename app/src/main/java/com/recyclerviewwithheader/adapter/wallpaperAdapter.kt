package com.recyclerviewwithheader.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recyclerviewwithheader.R
import com.recyclerviewwithheader.databinding.WallpaperLayoutBinding

class wallpaperAdapter(val urls:List<Drawable>) : RecyclerView.Adapter<wallpaperAdapter.WallpaperViewHolder>() {

    inner class WallpaperViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var binding = WallpaperLayoutBinding.bind(itemView)

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperViewHolder {

        val viewHolder=WallpaperViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_layout,parent,false))


        return viewHolder
    }


    override fun onBindViewHolder(holder: WallpaperViewHolder, position: Int) {
        val url=urls[position]

        holder.binding.wallpaper.setImageDrawable(url.current)


    }

    override fun getItemCount(): Int {
        return urls.size
    }

}
