package com.example.kotlindome.util

import android.content.Context
import android.content.res.AssetManager
import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.bean.NewsBean
import com.example.kotlindome.bean.WeatherBean
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * 开发者   biwu
 * 创建时间 2021/9/4
 * 描述
 */
object PubMethodKOT {

    /**
     * 从asset目录下读取fileName文件内容
     * @param fileName 待读取asset下的文件名
     */
    private fun getJson(fileName: String,context: Context): String {
        val stringBuilder = StringBuilder()
        try {
            val assetManager: AssetManager = context.getAssets()
            val bf = BufferedReader(InputStreamReader(
                assetManager.open(fileName)))
            var line: String?
            while (bf.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }

     fun getAreaData(context: Context) : NewsBean.ResultBean ?{
        //解析数据
        //获取assets目录下的json文件数据
        val JsonData: String = getJson("news.json",context)
        if (!StringUtils.isEmpty(JsonData)) {
           var cityBeans = GsonUtil.fromJson(JsonData, NewsBean.ResultBean::class.java)
            return cityBeans
        }
        return null
    }


    fun getMovieData(context: Context) : MovieBean ?{
        //解析数据
        //获取assets目录下的json文件数据
        val JsonData: String = getJson("movie.json",context)
        if (!StringUtils.isEmpty(JsonData)) {
            var cityBeans = GsonUtil.fromJson(JsonData, MovieBean::class.java)
            return cityBeans
        }
        return null
    }

    fun getWeather(context: Context) : WeatherBean ?{
        //解析数据
        //获取assets目录下的json文件数据
        val JsonData: String = getJson("weather.json",context)
        if (!StringUtils.isEmpty(JsonData)) {
            var cityBeans = GsonUtil.fromJson(JsonData, WeatherBean::class.java)
            return cityBeans
        }
        return null
    }
}