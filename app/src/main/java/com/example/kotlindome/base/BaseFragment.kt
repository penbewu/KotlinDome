package com.example.kotlindome.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
abstract class BaseFragment : Fragment() {

    //获取布局
    internal abstract val layoutId: Int

    //初始化View
    internal abstract fun initView(view: View)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(layoutId, null)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
    }
}