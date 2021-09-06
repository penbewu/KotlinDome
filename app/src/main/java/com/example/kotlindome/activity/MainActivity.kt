package com.example.kotlindome.activity

import android.graphics.Color
import android.graphics.PixelFormat
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseActivity
import com.example.kotlindome.event.EventCode
import com.example.kotlindome.event.EventMessage
import com.example.kotlindome.fragment.JokeFrag
import com.example.kotlindome.fragment.MovieFrag
import com.example.kotlindome.fragment.NewsFrag
import com.example.kotlindome.fragment.WeatherFrag
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(),View.OnClickListener {
    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
        window.setFormat(PixelFormat.TRANSLUCENT)
        mTextNews.text ="新闻"
        mTextMovie.text ="电影"
        mTextWeather.text ="天气"
        mTextJoke.text ="笑话"

        mTextNews.setOnClickListener(this)
        mTextMovie.setOnClickListener(this)
        mTextWeather.setOnClickListener(this)
        mTextJoke.setOnClickListener(this)

        cleckText(0)
    }

    private var jokeFrag :Fragment? =null
    private var movieFrag :MovieFrag? =null
    private var newsFrag :Fragment? =null
    private var weatherFrag :Fragment? =null
    private var tr : FragmentTransaction? = null

    private fun initFreg(index: Int) {
        supportActionBar?.hide()
        bottom_lin.visibility  =View.VISIBLE
        hin()
        tr = supportFragmentManager.beginTransaction()
        when (index) {
           0 -> {
               if (newsFrag == null) {
                   newsFrag = NewsFrag()
                   tr?.add(R.id.mContextView, newsFrag!!)
               } else {
                   tr?.show(newsFrag!!)
               }
           }
            1 -> {
                if (movieFrag == null) {
                    movieFrag = MovieFrag()
                    tr?.add(R.id.mContextView, movieFrag!!)
                } else {
                    tr?.show(movieFrag!!)
                }
                bottom_lin.visibility  =View.GONE
            }
            2 -> {
                if (weatherFrag == null) {
                    weatherFrag = WeatherFrag()
                    tr?.add(R.id.mContextView, weatherFrag!!)
                } else {
                    tr?.show(weatherFrag!!)
                }
            }
            3 -> {
                if (jokeFrag == null) {
                    jokeFrag = JokeFrag()
                    tr?.add(R.id.mContextView, jokeFrag!!)
                } else {
                    tr?.show(jokeFrag!!)
                }
            }
        }
        tr?.commitAllowingStateLoss()
    }

    private fun hin() {
        tr = supportFragmentManager.beginTransaction()
        if (null!=newsFrag)tr?.hide(newsFrag!!)
        if (null!=movieFrag)tr?.hide(movieFrag!!)
        if (null!=weatherFrag)tr?.hide(weatherFrag!!)
        if (null!=jokeFrag)tr?.hide(jokeFrag!!)
        tr?.commit()
    }

    private fun cleckText(index :Int){
        initFreg(index)
        mTextNews.setTextColor(Color.BLACK)
        mTextMovie.setTextColor(Color.BLACK)
        mTextWeather.setTextColor(Color.BLACK)
        mTextJoke.setTextColor(Color.BLACK)

        when(index){
            0->mTextNews.setTextColor(Color.RED)
            1->mTextMovie.setTextColor(Color.RED)
            2->mTextWeather.setTextColor(Color.RED)
            3->mTextJoke.setTextColor(Color.RED)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.mTextNews ->cleckText(0)
            R.id.mTextMovie ->cleckText(1)
            R.id.mTextWeather ->cleckText(2)
            R.id.mTextJoke ->cleckText(3)
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            if (movieFrag?.isCanBack()!!){
                movieFrag?.back()
                return false
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun handleEvent(event: EventMessage) {
        when(event.code){
            EventCode.goto->cleckText(0)
        }
    }

}
