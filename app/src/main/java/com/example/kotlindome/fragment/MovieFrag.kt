package com.example.kotlindome.fragment

import android.net.Uri
import android.util.Log
import android.view.View
import android.widget.MediaController
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseFragment
import com.example.kotlindome.bean.MovieBean
import com.example.kotlindome.event.EventBusUtils
import com.example.kotlindome.event.EventCode
import com.example.kotlindome.event.EventMessage
import com.example.kotlindome.http.RetrofitManger
import com.example.kotlindome.util.PubMethodKOT
import com.example.kotlindome.util.X5Manager
import kotlinx.android.synthetic.main.movie_frag.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class MovieFrag : BaseFragment(), View.OnClickListener {
    override val layoutId: Int
        get() = R.layout.movie_frag

    override fun initView(view: View) {
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
            if (null != movieBean?.result && movieBean?.result.size > 0) {
                var url: String? = movieBean?.result?.get(0)?.share_url
                X5Manager.loadX5(url!!, web_view, activity!!)
            }
        }

        uri = "android.resource://" + activity?.getPackageName() + "/" + R.raw.hoshi
        video.setVideoURI(Uri.parse(uri))
        var mMediaController: MediaController? = MediaController(activity)
        mMediaController?.setMediaPlayer(video)
        video.setMediaController(mMediaController)

        playbutton.setOnClickListener(this)
        stopbutton.setOnClickListener(this)
        fa_but.setOnClickListener(this)
    }

    var uri = ""

    override fun onClick(v: View?) {
        v.let {
            when (v?.id) {
                R.id.playbutton -> video.start()
                R.id.stopbutton -> video.stopPlayback()
                R.id.fa_but -> {
                   EventBusUtils.post(EventMessage(EventCode.goto))
                }

            }
        }
    }

    fun isCanBack(): Boolean {
        return web_view.canGoBack()
    }

    fun back() {
        if (web_view.canGoBack())
            web_view.goBack()
    }
}