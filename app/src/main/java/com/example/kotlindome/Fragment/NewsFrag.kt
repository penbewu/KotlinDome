package com.example.kotlindome.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlindome.R
import com.example.kotlindome.bean.NewsBean
import com.example.kotlindome.http.RetrofitManger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class NewsFrag :Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(activity, R.layout.news_frag,null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        RetrofitManger.getNews("top",1,20,1).equals(object : Callback<NewsBean>{
            override fun onFailure(call: Call<NewsBean>?, t: Throwable?) {
            }

            override fun onResponse(call: Call<NewsBean>?, response: Response<NewsBean>?) {
            }

        })



    }
}