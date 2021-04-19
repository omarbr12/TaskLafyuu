package com.example.exercisefiqma.adapterfile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import coil.load
import com.example.exercisefiqma.R
import com.example.exercisefiqma.model.SalesModel


class ItemPagerAdapter(val list: List<SalesModel>) : PagerAdapter() {
    override fun getCount(): Int = list.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater =
                container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val slideLayout: View = layoutInflater.inflate(R.layout.sales_item_layout, container, false)

        val slideImg: ImageView = slideLayout.findViewById(R.id.sales_imageView)
        val slideTitle: TextView = slideLayout.findViewById(R.id.sales_textView)
        val hour: TextView = slideLayout.findViewById(R.id.hour_tv)
        val minute: TextView = slideLayout.findViewById(R.id.minute_tv)
        val seconds: TextView = slideLayout.findViewById(R.id.second_tv)

        container.addView(slideLayout)

        slideImg.load(list[position].image) {
            crossfade(true)

        }

        slideTitle.text = list[position].title

        hour.text = list[position].hour
        minute.text = list[position].minute
        seconds.text = list[position].seconds

        return slideLayout

    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}


