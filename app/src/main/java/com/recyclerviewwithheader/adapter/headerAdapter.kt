package com.recyclerviewwithheader.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recyclerviewwithheader.R
import com.recyclerviewwithheader.databinding.HeaderLayoutBinding
import com.recyclerviewwithheader.databinding.WallpaperLayoutBinding

class headerAdapter(val urls:List<Drawable>):RecyclerView.Adapter<headerAdapter.HeaderViewHolder>() {

    inner class HeaderViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var binding = HeaderLayoutBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {

        val viewHolder=HeaderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.header_layout,parent,false))

        return viewHolder
    }

    override fun getItemCount(): Int {
        return urls.size
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        val url=urls[position]

        holder.binding.headerImages.setImageDrawable(url.current)
    }
}