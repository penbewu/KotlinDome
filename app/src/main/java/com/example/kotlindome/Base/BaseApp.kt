package com.example.kotlindome.Base

import android.app.Application
import com.liuguilin.okhelper.BuildConfig
import com.liuguilin.okhelper.OkHelper
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        OkHelper.getInstance().initHelper(this).setLogConfig("KotlinDome", BuildConfig.DEBUG)

//        OkHttpClient.Builder()
//            .connectTimeout(15, TimeUnit.SECONDS)
//            .readTimeout(15, TimeUnit.SECONDS)
//            .writeTimeout(15, TimeUnit.SECONDS)
//            .addInterceptor(HttpLoggingInterceptor())// 在此处添加拦截器即可，默认日志级别为BASIC
//            .build()
    }
}