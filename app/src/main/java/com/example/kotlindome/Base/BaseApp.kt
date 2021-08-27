package com.example.kotlindome.Base

import android.app.Application
import com.liuguilin.okhelper.BuildConfig
import com.liuguilin.okhelper.OkHelper

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        OkHelper.getInstance().initHelper(this).setLogConfig("KotlinDome", BuildConfig.DEBUG)
    }
}