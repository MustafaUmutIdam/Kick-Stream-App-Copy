package com.example.kickmainpagecopy.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kickmainpagecopy.data.entity.Stream
import com.example.kickmainpagecopy.databinding.StreamDesignBinding

class StreamAdapter(var mContext : Context, var streamList: List<Stream>)
    :RecyclerView.Adapter<StreamAdapter.StreamDesignHolder>() {


    inner class StreamDesignHolder(var design:StreamDesignBinding):RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StreamDesignHolder {
        val binding = StreamDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return StreamDesignHolder(binding)
    }


    override fun onBindViewHolder(holder: StreamDesignHolder, position: Int) {
        val stream = streamList.get(position)
        val h = holder.design

        h.imageViewStream.setImageResource(mContext.resources.getIdentifier(stream.image,"drawable",mContext.packageName))
        }

    override fun getItemCount(): Int {
        return streamList.size
    }

}