package com.example.kotlindome.fragment

import android.view.View
import android.widget.TextView
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseFragment
import com.example.kotlindome.bean.WeatherBean
import com.example.kotlindome.http.RetrofitManger
import com.example.kotlindome.util.PubMethodKOT
import kotlinx.android.synthetic.main.weather_frag.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class WeatherFrag : BaseFragment() {

    override val layoutId: Int =  R.layout.weather_frag

    var degrees_tex :TextView? =null


    override fun initView(view: View) {
        degrees_tex =view.findViewById(R.id.degrees_tex)

        getWeather("上海")
    }

    fun getWeather(city:String){
        RetrofitManger.getWeath(city).equals(object :Callback<WeatherBean>{
            override fun onFailure(call: Call<WeatherBean>, t: Throwable) {
            }

            override fun onResponse(call: Call<WeatherBean>, response: Response<WeatherBean>) {
            }
        })

        var weatherBean = PubMethodKOT.getWeather(activity!!)

        if (null!=weatherBean)setv(weatherBean)
    }

    fun setv(weatherBean: WeatherBean){
        weatherBean.let {
            it.result.let {
                it.realtime.let {
                    weather_tex?.text =it.info
                    degrees_tex?.text =it.temperature
                    temperature_tex?.text ="湿度\n"+it.humidity
                    wind_direction_tex?.text ="风向\n"+it.direct
                    wind_power_tex?.text ="风力\n"+it.power
                    quality_tex?.text ="空气质量\n"+it.aqi
                }
            }
        }

        //EventBusUtils.post(EventMessage(EventCode.test).put(weatherBean))//调试用
    }


}