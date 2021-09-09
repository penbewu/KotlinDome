package com.example.kotlindome.http

import com.example.kotlindome.bean.JokeBean
import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.bean.NewsBean
import com.example.kotlindome.bean.WeatherBean
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 开发者   biwu
 * 创建时间 2021/8/28
 * 描述
 */

object RetrofitManger {

    //新闻
    private const val BASE_URL = "http://v.juhe.cn/"
    const val NEWS_URL = "toutiao/index"
    private const val NEWS_KEY = "3c16f6e0a13a33dccbc84179e0a0f695"

    //电影
    private const val BASEMOVIES_URL = "http://apis.juhe.cn/"
    const val MOVIES_URL = "fapig/douyin/billboard"
    private const val MOVIES_KEY = "479d0e11b4afa31b286fc8fd9923fb06"

    //天气
    const val WEATHER_URL = "fapig/douyin/billboard"
    private const val WEATHER_KEY = "6284e91c5ed9e930af8f1d9978effce9"

    //
   //笑话
    const val JOKE_URL = "joke/randJoke.php"
    private const val JOKE_KEY = "21278605c60341940a1a2c453402f528"

    private val retrofit: Retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        Retrofit.Builder()
            .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    private val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    private val retrofitMovie: Retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        Retrofit.Builder()
            .baseUrl(BASEMOVIES_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    private val apiServiceMovie: ApiService by lazy {
        retrofitMovie.create(ApiService::class.java)
    }

    fun getNews(type: String, page: Int, page_size: Int, is_filter: Int): Call<NewsBean> {
        return apiService.getNews(type, page, page_size, is_filter, NEWS_KEY)
    }

    fun getMovie(): Call<MovieBean> {
        return apiServiceMovie.getMovie(MOVIES_KEY, "hot_video", 10)
    }

    fun getWeath(city: String): Call<WeatherBean> {
        return apiServiceMovie.getWeather(WEATHER_KEY, city)
    }
    //sort=desc&page=1&pagesize=10&time=4212132131&key=21278605c60341940a1a2c453402f528
    fun  getJoke():Call<JokeBean>{
        return apiService.getJoke( JOKE_KEY)
    }

}