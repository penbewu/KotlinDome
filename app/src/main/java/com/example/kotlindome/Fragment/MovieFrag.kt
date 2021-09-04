package com.example.kotlindome.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlindome.R
import com.example.kotlindome.Util.PubMethodKOT
import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.http.RetrofitManger
import com.tencent.smtt.sdk.WebView
import kotlinx.android.synthetic.main.movie_frag.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class MovieFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(activity, R.layout.movie_frag, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initview()
//        loadUrl("")
    }

    private fun initview() {

        RetrofitManger.getMovie().equals(object : Callback<MovieBean> {
            override fun onFailure(call: Call<MovieBean>, t: Throwable) {
                Log.e("t", t.toString())
            }

            override fun onResponse(call: Call<MovieBean>, response: Response<MovieBean>) {
                Log.e("response", response.toString())
            }
        })

        var movieBean = PubMethodKOT.getMovieData(activity!!)

        movieBean.let {
            if (null!=movieBean?.result&&movieBean?.result.size>0)
            loadUrl(movieBean?.result?.get(0)?.share_url)
        }
    }

    private fun loadUrl(url: String?) {
        Log.e("url","url=$url")
        val webSettings: com.tencent.smtt.sdk.WebSettings = web_view.settings
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

        web_view.webViewClient=MyWebviewClient()

        web_view.loadUrl(url)
//        web_view.loadUrl("https://www.baidu.com/")

    }

    inner  class MyWebviewClient : com.tencent.smtt.sdk.WebViewClient(){
        override fun shouldOverrideUrlLoading(p0: WebView?, p1: String?): Boolean {
            return false
        }

        override fun onPageFinished(p0: WebView?, p1: String?) {
            super.onPageFinished(p0, p1)
            Log.e("加载成功","加载成功")
        }
    }
}