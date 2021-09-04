package com.example.kotlindome.http

import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.bean.NewsBean
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

    private const val Base_url = "http://v.juhe.cn/"
     const val news_url ="toutiao/index"
     private const val news_key ="3c16f6e0a13a33dccbc84179e0a0f695"

    private const val BaseMovies_url = "http://apis.juhe.cn/"
    const val movies_url ="fapig/douyin/billboard"
    private const val movies_key ="479d0e11b4afa31b286fc8fd9923fb06"

    private val retrofit :Retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

            Retrofit.Builder()
            .baseUrl(Base_url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
            .build()
    }

    private val apiService :ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    private val retrofitMovie :Retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        Retrofit.Builder()
            .baseUrl(BaseMovies_url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    private val apiServiceMovie :ApiService by lazy {
        retrofitMovie.create(ApiService::class.java)
    }

    fun getNews(type: String, page: Int, page_size: Int, is_filter: Int) : Call<NewsBean> {
        return apiService.getNews(type,page,page_size,is_filter,news_key )
    }

    fun getMovie():Call<MovieBean>{
        return apiServiceMovie.getMovie(movies_key,"hot_video",10 )
    }

}