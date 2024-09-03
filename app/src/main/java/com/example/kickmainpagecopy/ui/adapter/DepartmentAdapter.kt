package com.example.kickmainpagecopy.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kickmainpagecopy.data.entity.Department
import com.example.kickmainpagecopy.databinding.DepartmentDesignBinding

class DepartmentAdapter(var mContext :Context, var departmenList: List<Department>)
    : RecyclerView.Adapter<DepartmentAdapter.DepartmentDesignHolder>(){

    inner class DepartmentDesignHolder(var design:DepartmentDesignBinding):RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentDesignHolder {
        val binding = DepartmentDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return DepartmentDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return departmenList.size
    }

    override fun onBindViewHolder(holder: DepartmentDesignHolder, position: Int) {
        val department = departmenList.get(position)
        val h = holder.design

        h.imageViewDepartment.setImageResource(mContext.resources.getIdentifier(department.image,"drawable",mContext.packageName))


    }


}