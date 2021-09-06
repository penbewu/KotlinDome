package com.example.kotlindome.activity

import android.os.Bundle
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseActivity
import com.example.kotlindome.util.X5Manager
import com.tencent.smtt.sdk.WebView

/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
class WebViewActivity :BaseActivity() {

    override val layoutId: Int
        get() = R.layout.web_view_activity

    override fun initView(savedInstanceState: Bundle?) {
        var url :String ?= intent.getStringExtra("url")

        var web_view_act :WebView =findViewById(R.id.web_view_act)
        url?.let {
            X5Manager.loadX5(it ,web_view_act,this)
        }
    }
}