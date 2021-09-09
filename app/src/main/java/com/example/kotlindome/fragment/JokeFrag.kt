package com.example.kotlindome.fragment

import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome.R
import com.example.kotlindome.base.BaseFragment
import com.example.kotlindome.bean.JokeBean
import com.example.kotlindome.http.RetrofitManger
import com.example.kotlindome.util.PubMethodKOT
import com.liuguilin.okhelper.base.adapter.CommonAdapter
import com.liuguilin.okhelper.base.adapter.CommonViewHolder
import kotlinx.android.synthetic.main.joke_frag.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class JokeFrag :BaseFragment() {

    var adapter : CommonAdapter<JokeBean.ResultBean>?=null
    var list =ArrayList<JokeBean.ResultBean>()

    override val layoutId: Int
        get() = R.layout.joke_frag

    override fun initView(view: View) {
        adapter = CommonAdapter(list,object :CommonAdapter.OnBindDataListener<JokeBean.ResultBean>{
            override fun getLayoutId(type: Int): Int {
                return R.layout.joke_item
            }

            override fun onBindViewHolder(
                model: JokeBean.ResultBean?,
                viewHolder: CommonViewHolder?,
                type: Int,
                position: Int
            ) {
                model?.let {
                    viewHolder?.let {view->
                        view.setText(R.id.joke_text,it.content)
                    }
                }
            }
        })

        mRec.layoutManager= LinearLayoutManager(activity!!)
//        mRec.addItemDecoration(DividerItemDecoration(activity!!,10))
        mRec.addItemDecoration(DividerItemDecoration(activity!!,DividerItemDecoration.VERTICAL))
        mRec.adapter=adapter
        getData()
    }

    var jokeBean:JokeBean?=null
    private fun getData() {
       RetrofitManger.getJoke().equals(object : Callback<JokeBean>{
           override fun onFailure(call: Call<JokeBean>, t: Throwable) {
           }

           override fun onResponse(call: Call<JokeBean>, response: Response<JokeBean>) {
           }
       })

        jokeBean= PubMethodKOT.getJoke(activity!!)

        jokeBean?.let {
            if (null!=it.result&&it.result.size>0){
                if (list.size>0) list.clear()

                list.addAll(it.result)
                adapter?.let {
                    it.notifyDataSetChanged()
                }
            }
        }
    }


}