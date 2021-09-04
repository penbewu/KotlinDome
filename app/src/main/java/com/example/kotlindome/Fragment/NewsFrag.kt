package com.example.kotlindome.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kotlindome.R
import kotlinx.android.synthetic.main.news_frag.*

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class NewsFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(activity, R.layout.news_frag, null)
    }

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initTab()
    }

    private fun initTab() {
        activity?.let {
            tabAdapter = TabPagerAdapter(it.supportFragmentManager)
            mViewPager.adapter = tabAdapter
            mTab.setupWithViewPager(mViewPager)
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