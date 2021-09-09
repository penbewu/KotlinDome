package com.example.kotlindome.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseFragment
import com.example.kotlindome.bean.WeatherBean
import com.example.kotlindome.http.RetrofitManger
import com.example.kotlindome.util.PubMethodKOT
import com.liuguilin.okhelper.base.adapter.CommonAdapter
import com.liuguilin.okhelper.base.adapter.CommonViewHolder
import kotlinx.android.synthetic.main.weather_frag.*
import kotlinx.android.synthetic.main.weather_item.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class WeatherFrag : BaseFragment() {

    private var adapter :CommonAdapter<WeatherBean.ResultBean.FutureBean>? =null
    var list = ArrayList<WeatherBean.ResultBean.FutureBean>()

    override val layoutId: Int =  R.layout.weather_frag


    var city ="上海"

    override fun initView(view: View) {
        adapter = CommonAdapter(list,object :CommonAdapter.OnBindDataListener<
                WeatherBean.ResultBean.FutureBean>{
            override fun getLayoutId(type: Int): Int {
              return R.layout.weather_item
            }

            override fun onBindViewHolder(
                model: WeatherBean.ResultBean.FutureBean?,
                viewHolder: CommonViewHolder?,
                type: Int,
                position: Int
            ) {
                viewHolder?.let {
                    model?.let { m ->
                        it.itemView.data_tex.text=m.date
                        it.itemView.temperature_tex.text=m.temperature
                        it.itemView.weather_tex.text=m.weather
                        it.itemView.direct_tex.text=m.direct
                    }
                }
            }
        })

        val ll= LinearLayoutManager(activity)
        ll.orientation = LinearLayoutManager.HORIZONTAL
        rec_view.layoutManager=ll
        rec_view.adapter=adapter

        getWeather(city)
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
//        EventBusUtils.post(EventMessage(EventCode.TYPE_WEATHER_TITLE).putString(city))

        weatherBean?.let {
            it.result.let {
                it.realtime.let {
                    weather_tex.text =it.info
                    degrees_tex.text =it.temperature
                    temperature_tex.text ="湿度\n"+it.humidity
                    wind_direction_tex.text ="风向\n"+it.direct
                    wind_power_tex.text ="风力\n"+it.power
                    quality_tex.text ="空气质量\n"+it.aqi
                }
                it.future.let {
                    if (list.size>0)list.clear()

                    list.addAll(it)
                    adapter?.notifyDataSetChanged()
                }
            }
        }

        //EventBusUtils.post(EventMessage(EventCode.test).put(weatherBean))//调试用
    }



}