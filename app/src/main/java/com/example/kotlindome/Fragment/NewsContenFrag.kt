package com.example.kotlindome.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindome.R
import com.example.kotlindome.Util.PubMethodKOT
import com.example.kotlindome.bean.NewsBean
import com.example.kotlindome.http.RetrofitManger
import com.liuguilin.okhelper.base.adapter.CommonAdapter
import com.liuguilin.okhelper.base.adapter.CommonViewHolder
import kotlinx.android.synthetic.main.news_conten_frag.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * 开发者   biwu
 * 创建时间 2021/9/4
 * 描述
 */

class NewsContenFrag :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(activity, R.layout.news_conten_frag,null)
    }

    private var  newsAdapter : CommonAdapter<NewsBean.ResultBean.DataBean> ?=null
    private var mList:ArrayList<NewsBean.ResultBean.DataBean>?=ArrayList<NewsBean.ResultBean.DataBean>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ininView()

        var bundle  =arguments
        var title :Any ?= bundle?.getString("title")
        title?.let { getNews(it as  String) }
    }

    private fun ininView() {
        newsAdapter= CommonAdapter(mList,object : CommonAdapter.OnBindDataListener<NewsBean.ResultBean.DataBean>{
            override fun getLayoutId(type: Int): Int {
                return R.layout.news_conten_item
            }

            override fun onBindViewHolder(
                model: NewsBean.ResultBean.DataBean?,
                viewHolder: CommonViewHolder?,
                type: Int,
                position: Int
            ) {
                viewHolder.let {
                    it?.setText(R.id.title_tex,model?.title)
                    it?.setText(R.id.name_tex,model?.author_name)
                    it?.setText(R.id.date_tex,model?.date)
                }
            }
        })
        mRec.layoutManager=LinearLayoutManager(activity)
        mRec.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        mRec.adapter =newsAdapter
    }

    fun getNews(type :String){
        RetrofitManger.getNews(type,1,20,1).equals(object : Callback<NewsBean> {
            override fun onFailure(call: Call<NewsBean>?, t: Throwable?) {
                Log.e("t",t.toString())
            }
            override fun onResponse(call: Call<NewsBean>?, response: Response<NewsBean>?) {
                Log.e("response",response.toString())
            }
        })

        var  json:NewsBean.ResultBean? = PubMethodKOT.getAreaData(activity!!)

        json.let {
            if (null!=mList&&mList?.size!!>0)mList?.clear()

            mList?.addAll(it?.data!!)

            newsAdapter?.notifyDataSetChanged()
        }
    }
}