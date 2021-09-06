package com.example.kotlindome.event

import android.app.Activity
import org.greenrobot.eventbus.EventBus

/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
object EventBusUtils {

    fun register (activity: Activity){
        var eventBus =EventBus.getDefault()
        if (!eventBus.isRegistered(activity))
            EventBus.getDefault().register(activity)

    }

    fun unregister(activity: Activity){
        var eventBus =EventBus.getDefault()
        if (eventBus.isRegistered(activity))
            eventBus.unregister(activity)
    }

    fun post (eventMessage: EventMessage){
        EventBus.getDefault().post(eventMessage)
    }

    fun postSticky(eventMessage: EventMessage){
        EventBus.getDefault().postSticky(eventMessage)
    }
}