package com.example.kotlindome.http

import com.example.kotlindome.bean.JokeBean
import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.bean.NewsBean
import com.example.kotlindome.bean.WeatherBean
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
    @GET(RetrofitManger.NEWS_URL)
    fun getNews(@Query("type")type:String,
                @Query("page")page:Int,
                @Query("page_size")page_size:Int,
                @Query("is_filter")is_filter:Int,
                @Query("key")key:String) :Call<NewsBean>

    //电影  //key=&type=hot_video
    @GET(RetrofitManger.MOVIES_URL)
    fun getMovie(@Query("key")key:String,
                 @Query("type")type:String,
                 @Query("size")size:Int) :Call<MovieBean>

    //天气  //key=&type=hot_video
    @GET(RetrofitManger.WEATHER_URL)
    fun getWeather(@Query("key")key:String,
                 @Query("city")type:String) :Call<WeatherBean>

    //笑话  //sort=desc&page=1&pagesize=10&time=4212132131&key=21278605c60341940a1a2c453402f528
    @GET(RetrofitManger.JOKE_URL)
    fun getJoke(@Query("key")key:String) :Call<JokeBean>
}