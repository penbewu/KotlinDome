package com.example.kotlindome.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseActivity
import com.liuguilin.okhelper.base.adapter.BasePageAdapter
import kotlinx.android.synthetic.main.guide_activity.*

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class GuideActivity : BaseActivity(), ViewPager.OnPageChangeListener{

    private val list = ArrayList<View>()
    private var adapter:BasePageAdapter? = null

    override val layoutId: Int
        get() = R.layout.guide_activity

    override fun initView(savedInstanceState: Bundle?) {
        mButton.text = "跳转主页"

        for (i in 0..2) {
            val tv = TextView(this)
            tv.layoutParams =RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT)

            tv.gravity=Gravity.CENTER
            tv.textSize=20f
            tv.setTextColor(Color.WHITE)

            when(i){
                0->tv.setBackgroundColor(Color.YELLOW)
                1->tv.setBackgroundColor(Color.RED)
                2->tv.setBackgroundColor(Color.GREEN)
            }
            tv.text = "i$i"
            list.add(tv)
        }
        adapter =BasePageAdapter(list)
        mViewPager.adapter=adapter

        mViewPager.addOnPageChangeListener(this)

        mButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java ))
            finish()
        }

    }

    override fun onPageScrollStateChanged(state: Int) {
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        if (position==list.size-1) mButton.visibility=View.VISIBLE else mButton.visibility=View.GONE
    }
}