package com.example.kotlindome.util

import android.app.Activity
import android.util.Log
import com.tencent.smtt.sdk.WebView

/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
object X5Manager {

     fun loadX5(url : String,webView :WebView,activity :Activity){
         Log.e("url","url=$url")
         val webSettings: com.tencent.smtt.sdk.WebSettings = webView.settings
         webSettings.allowContentAccess = true
         webSettings.layoutAlgorithm = com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm.NARROW_COLUMNS
         webSettings.setSupportZoom(true)
         webSettings.builtInZoomControls = true
         webSettings.useWideViewPort = true
         webSettings.setSupportMultipleWindows(false)
         webSettings.setAppCacheEnabled(true)
         webSettings.domStorageEnabled = true
         webSettings.setGeolocationEnabled(true)
         webSettings.setAppCacheMaxSize(Long.MAX_VALUE)
         webSettings.setAppCachePath(activity?.getDir("appcache", 0)?.path)
         webSettings.databasePath = activity?.getDir("databases", 0)?.path
         webSettings.setGeolocationDatabasePath(activity?.getDir("geolocation", 0)?.path)
//        webSettings.pluginState(com.tencent.smtt.sdk.WebSettings.PluginState.ON_DEMAND)

         webView.webViewClient= MyWebviewClient()

         webView.loadUrl(url)
//        web_view.loadUrl("https://www.baidu.com/")
     }

    class MyWebviewClient : com.tencent.smtt.sdk.WebViewClient(){
        override fun shouldOverrideUrlLoading(p0: WebView?, p1: String?): Boolean {
            return false
        }

        override fun onPageFinished(p0: WebView?, p1: String?) {
            super.onPageFinished(p0, p1)
            Log.e("加载成功","加载成功")
        }
    }





}