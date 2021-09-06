package com.example.kotlindome.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseFragment
import kotlinx.android.synthetic.main.news_frag.*

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class NewsFrag : BaseFragment() {


    private val listTitle =
        listOf<String>("头条", "社会", "国内", "国际", "娱乐", "体育", "军事", "科技", "财经", "时尚")
    private val listName = listOf<String>(
        "top",
        "shehui",
        "guonei",
        "gouji",
        "yule",
        "tiyu",
        "junshi",
        "keji",
        "caijing",
        "shishang"
    )

    private var tabAdapter: TabPagerAdapter? = null

    override val layoutId: Int
        get() = R.layout.news_frag

    override fun initView(view: View) {
        activity?.let {
            tabAdapter = TabPagerAdapter(it.supportFragmentManager)
            mViewPager.adapter = tabAdapter
            mTab.setupWithViewPager(mViewPager,false)
            mViewPager.offscreenPageLimit = listName.size
        }

    }

    inner class TabPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            var newsContenFrag = NewsContenFrag()
            var bundle = Bundle()
            bundle.putString("title", listName[position])
            newsContenFrag.arguments = bundle
            return newsContenFrag
        }

        override fun getCount(): Int {
            return listTitle.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return listTitle[position]
        }
    }
}