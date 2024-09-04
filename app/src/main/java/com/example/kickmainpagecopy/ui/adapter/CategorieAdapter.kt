package com.example.kickmainpagecopy.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kickmainpagecopy.data.entity.Categorie
import com.example.kickmainpagecopy.databinding.CategorieDesignBinding


class CategorieAdapter (var mContext : Context, var categorieList: List<Categorie>)
    : RecyclerView.Adapter<CategorieAdapter.CategorieDesignHolder>(){

    inner class CategorieDesignHolder(var design: CategorieDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategorieDesignHolder {
        val binding = CategorieDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CategorieDesignHolder(binding)
    }

        override fun onBindViewHolder(holder: CategorieDesignHolder, position: Int) {
        val department = categorieList.get(position)
        val h = holder.design

        h.imageViewCategorie.setImageResource(mContext.resources.getIdentifier(department.image,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return categorieList.size
    }


}