package com.example.kotlindome.Base

import android.app.Application
import android.util.Log
import com.liuguilin.okhelper.BuildConfig
import com.liuguilin.okhelper.OkHelper
import com.tencent.smtt.sdk.QbSdk


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

        //init x5
        QbSdk.initX5Environment(this,object : QbSdk.PreInitCallback{
            override fun onCoreInitFinished() {
                Log.e("x5 加载成功","x5 加载成功")
            }

            override fun onViewInitFinished(p0: Boolean) {
                Log.e("x5 加载成功$p0","x5 加载成功$p0")
            }
        })
    }
}