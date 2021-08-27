package com.example.kotlindome

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.liuguilin.okhelper.utils.SpUtils
import kotlinx.android.synthetic.main.index_activity.*

/**
 * 开发者   biwu
 * 创建时间 2021/8/27
 * 描述
 */
class IndexActivity : AppCompatActivity (),ViewPropertyAnimatorListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.index_activity)

        initView()
    }

    private fun initView() {
        text.text ="KotlinDome"

        ViewCompat.animate(text)
            .scaleX(1.2f)
            .scaleX(1.2f)
            .setDuration(2000)
            .setListener(this)
            .start()

    }

    override fun onAnimationEnd(view: View?) {
        startForMain()
    }


    override fun onAnimationCancel(view: View?) {

    }

    override fun onAnimationStart(view: View?) {

    }

    private val isFirstApp = "isFrastApp"
    private fun startForMain() {
       val isFirst : Boolean =SpUtils.getInstance().getBoolean(isFirstApp,true)

        if (!isFirst){
            startActivity(Intent(this,GuideActivity::class.java))
            SpUtils.getInstance().putBoolean(isFirstApp,false)
        }else{
            startActivity(Intent(this,MainActivity::class.java))
        }
        finish()
    }

}