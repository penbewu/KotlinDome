package com.example.kotlindome.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseActivity
import com.example.kotlindome.bean.CityListBean
import com.example.kotlindome.util.PubMethodKOT
import com.liuguilin.okhelper.base.adapter.CommonAdapter
import com.liuguilin.okhelper.base.adapter.CommonViewHolder
import kotlinx.android.synthetic.main.city_elect_activity.*

/**
 * 开发者   biwu
 * 创建时间 2021/9/7
 * 描述
 */
class CitySelectActivity :BaseActivity(){

    private var adapter :CommonAdapter<CityListBean.ResultBean> ? =null
    private var list =ArrayList<CityListBean.ResultBean>()

    override val layoutId: Int
        get() = R.layout.city_elect_activity

    override fun initView(savedInstanceState: Bundle?) {

        supportActionBar?.title ="选择城市"

        adapter = CommonAdapter(list,object : CommonAdapter.OnBindDataListener<CityListBean.ResultBean>{
            override fun getLayoutId(type: Int): Int {
                return R.layout.city_item
            }

            override fun onBindViewHolder(
                model: CityListBean.ResultBean?,
                viewHolder: CommonViewHolder?,
                type: Int,
                position: Int
            ) {
                model?.let {
                    viewHolder?.let {
                        viewHolder.setText(R.id.text_tex,"${model.province}省${model.city}市${model.district}区")
                        viewHolder.setTextColor(R.id.text_tex,Color.BLACK)

                        it.itemView.setOnClickListener{
                            var intent = Intent()
                            intent.putExtra("city",model.city)
                            setResult(Activity.RESULT_OK,intent)
                            finish()
                        }
                    }
                }

            }
        })

        mRec.layoutManager=LinearLayoutManager(this)
        mRec.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        mRec.adapter=adapter

        mRec.addOnScrollListener(object :RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                val lm =recyclerView.layoutManager
                if (lm is LinearLayoutManager){
                    val firstindex=lm.findFirstVisibleItemPosition()
//                    val city =list[firstindex]
                    city_sel.setItemIndex(list[firstindex].city)
                }

            }
        })

        city_sel.setonMovelistener {
            key_tex.text=it
            finds(it)
        }

        var city = PubMethodKOT.getCity(this)

        city_sel.setitemV(key_tex)

       setv(city)
    }

    private fun finds(city: String) {
        var scrollindex =0

        list?.let {
            for ((k,v) in it.withIndex()){
                if (city==v.province){
                    scrollindex=k
                    return@let
                }
            }
        }

        mRec.scrollToPosition(scrollindex)
    }

    private var listCity =ArrayList<String>()

    private fun setv(city: CityListBean?) {
        city?.let {
            if (list.size>0)
                list.clear()

            city.result.forEach{
                list.add(it)
                buildCity(it.province)
            }

            city_sel.setCity(listCity)
            adapter?.notifyDataSetChanged()
        }
    }

    private fun buildCity(city: String) {
        if (!listCity.contains(city))
            listCity.add(city)
    }
}