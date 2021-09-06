package com.example.kotlindome.base

import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import com.liuguilin.okhelper.BuildConfig
import com.liuguilin.okhelper.OkHelper
import com.tencent.smtt.sdk.QbSdk
import java.util.*


/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class BaseApplication : Application() {


    private var appContext: Context? = null
    private val mActivities = LinkedList<Activity>()

    companion object {
        public var instance: BaseApplication? = null
        @Synchronized
        fun get(): BaseApplication{
            return instance!!
        }
    }

    fun getAppContext(): Context {
        return appContext!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appContext = instance?.getApplicationContext()

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

    /**
     * 添加activity
     */
    fun addActivity(act: Activity) {
        mActivities?.add(act)
        Log.e("addActivity==", "aa${mActivities.size}")
    }

    /**
     * 移除activity
     */
    fun removeActivity(act: Activity) {
        mActivities?.remove(act)
    }

    /**
     * 退出app
     */
    fun exitApp() {
        if (mActivities != null) {
            synchronized(mActivities) {
                for (act in mActivities) {
                    act.finish()
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid())
        System.exit(0)
    }

}