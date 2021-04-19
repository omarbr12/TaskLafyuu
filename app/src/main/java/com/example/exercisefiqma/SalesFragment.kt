package com.example.exercisefiqma

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.exercisefiqma.adapterfile.ItemPagerAdapter
import com.example.exercisefiqma.adapterfile.MyRecyclerAdapter
import com.example.exercisefiqma.model.RecycleModel
import com.example.exercisefiqma.model.SalesModel
import com.google.android.material.tabs.TabLayout


class SalesFragment : Fragment(R.layout.fragment_empty) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list: MutableList<SalesModel> = arrayListOf()

        list.add(SalesModel(
                "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/3bc90ce0-e360-475c-9045-4460ddeb8a92/air-max-zephyr-mens-shoe-Sq8M9P.png",
                "Nike Sales",
                "08", "16", "56"

        ))

        list.add(SalesModel(
                "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/3bc90ce0-e360-475c-9045-4460ddeb8a92/air-max-zephyr-mens-shoe-Sq8M9P.png",
                "Super Flash Sale 50% Off ",
                "08", "16", "56"

        ))
        list.add(SalesModel(
                "https://wallpaperaccess.com/full/2043541.jpg",
                "Super Flash Sale 50% Off ",
                "08", "16", "56"

        ))

        val listRecycler: MutableList<RecycleModel> = arrayListOf()

        listRecycler.add(RecycleModel(
                R.drawable.ic_manwear,
                "Man Shirt"
        ))

        listRecycler.add(RecycleModel(
                R.drawable.ic_dress,
                "Dress"
        ))

        listRecycler.add(RecycleModel(
                R.drawable.ic_manwork,
                "Man Work Equipment"
        ))

        listRecycler.add(RecycleModel(
                R.drawable.ic_womanbag,
                "Woman Bag"
        ))
        listRecycler.add(RecycleModel(
                R.drawable.ic_manshoes2,
                "Man Shoes"
        ))







        val viewPager = view.findViewById<ViewPager>(R.id.viewpager)
        val indicator = view.findViewById<TabLayout>(R.id.indicator)
        val recycler = view.findViewById<RecyclerView>(R.id.recycler_category)
        val adapter = MyRecyclerAdapter(listRecycler)
        indicator.setupWithViewPager(viewPager)

        val itempagerAdapter = ItemPagerAdapter(list)

        viewPager.adapter = itempagerAdapter


        recycler.adapter = adapter


    }

}