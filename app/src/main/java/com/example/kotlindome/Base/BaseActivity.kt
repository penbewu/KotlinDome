package com.example.kotlindome.Base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindome.R

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}