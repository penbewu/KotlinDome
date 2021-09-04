package com.example.kotlindome.http

import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.bean.NewsBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 开发者   biwu
 * 创建时间 2021/8/28
 * 描述
 */
interface ApiService  {

    //新闻  //type=&page=&page_size=&is_filter=&key=3c16f6e0a13a33dccbc84179e0a0f695
    @GET(RetrofitManger.news_url)
    fun getNews(@Query("type")type:String,
                @Query("page")page:Int,
                @Query("page_size")page_size:Int,
                @Query("is_filter")is_filter:Int,
                @Query("key")key:String) :Call<NewsBean>

    //电影  //key=&type=hot_video
    @GET(RetrofitManger.movies_url)
    fun getMovie(@Query("key")key:String,
                @Query("type")type:String,
                @Query("size")size:Int) :Call<MovieBean>
}