package com.example.kickmainpagecopy.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kickmainpagecopy.R
import com.example.kickmainpagecopy.data.entity.Categorie
import com.example.kickmainpagecopy.data.entity.Department
import com.example.kickmainpagecopy.data.entity.Stream
import com.example.kickmainpagecopy.databinding.FragmentMainPageBinding
import com.example.kickmainpagecopy.ui.adapter.CategorieAdapter
import com.example.kickmainpagecopy.ui.adapter.DepartmentAdapter
import com.example.kickmainpagecopy.ui.adapter.StreamAdapter


class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        //Department rV icin binding
        binding.rVDepartment.layoutManager = StaggeredGridLayoutManager(1 , StaggeredGridLayoutManager.HORIZONTAL)

        val departmentList = ArrayList<Department>()
        val d1 = Department(1 , "department_image_1")
        val d2 = Department(2 , "department_image_2")
        val d3 = Department(3 , "department_image_3")
        val d4 = Department(4 , "department_image_4")
        val d5 = Department(5 , "department_image_5")

        departmentList.add(d1)
        departmentList.add(d2)
        departmentList.add(d3)
        departmentList.add(d4)
        departmentList.add(d5)

        val departmentAdapter = DepartmentAdapter(requireContext(),departmentList)
        binding.rVDepartment.adapter = departmentAdapter


        //Stream rV icin binding
        binding.rVStream.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val streamList = ArrayList<Stream>()
        val s1 = Stream(1,"stream_image_1")
        val s2 = Stream(2,"stream_image_2")
        val s3 = Stream(3,"stream_image_3")

        streamList.add(s1)
        streamList.add(s2)
        streamList.add(s3)
        val streamAdapter = StreamAdapter(requireContext(),streamList)
        binding.rVStream.adapter = streamAdapter


        //Categorie rV icin binding
        binding.rVCategorie.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val categorieList = ArrayList<Categorie>()
        val c1 = Categorie(1,"categories_image_1")
        val c2 = Categorie(2,"categories_image_2")
        val c3 = Categorie(3,"categories_image_3")
        val c4 = Categorie(4,"categories_image_4")
        val c5 = Categorie(5,"categories_image_5")
        val c6 = Categorie(6,"categories_image_6")

        categorieList.add(c1)
        categorieList.add(c2)
        categorieList.add(c3)
        categorieList.add(c4)
        categorieList.add(c5)
        categorieList.add(c6)
        val categorieAdapter = CategorieAdapter(requireContext(),categorieList)
        binding.rVCategorie.adapter = categorieAdapter


        return binding.root
    }
}