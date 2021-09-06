package com.example.kotlindome.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindome.event.EventBusUtils
import com.example.kotlindome.event.EventMessage
import com.liuguilin.okhelper.helper.ActivityHelper
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
abstract class BaseActivity : AppCompatActivity() {

    //获取布局
    abstract val layoutId: Int

    //初始化View
    abstract fun initView(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        BaseApplication.instance?.addActivity(this)

        EventBusUtils.register(this)
        ActivityHelper.getInstance().addActivity(this)

        initView(savedInstanceState)
    }

    override fun onDestroy() {
        EventBusUtils.unregister(this)
        BaseApplication.instance?.removeActivity(this)
        super.onDestroy()
    }

    /**
     * 接收到分发的事件
     *
     * @param event 事件
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onReceiveEvent(event: EventMessage) {
        handleEvent(event)
    }

    open fun handleEvent(event: EventMessage) {}

    open fun handleStickyEvent(event: EventMessage) {}

    /**
     * 接受到分发的粘性事件
     *
     * @param event 粘性事件
     */
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    fun onReceiveStickyEvent(event: EventMessage) {
        handleStickyEvent(event)
    }
}