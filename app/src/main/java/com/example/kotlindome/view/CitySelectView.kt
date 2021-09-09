package com.example.kotlindome.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.TextView

/**
 * 开发者   biwu
 * 创建时间 2021/9/7
 * 描述 城市选择
 */
class CitySelectView : View {

    private var viewW = 0
    private var viewH = 0

    var itemH = 0
    var checkIndex = 0
    var textSize = 40f
    var untextSize = 30f

    val mPaint by lazy { Paint() }

    private var listC: ArrayList<String>? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        viewH = h
        viewW = w
    }

    fun init() {
        mPaint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        listC?.let {
            itemH = viewH / it.size
//            itemH =70
            for ((index: Int, text: String) in it.withIndex()) {
                if (index == checkIndex) {
                    mPaint.color = Color.RED
                    mPaint.textSize = textSize
                } else {
                    mPaint.color = Color.BLACK
                    mPaint.textSize = untextSize
                }

                var x: Float = (viewW - mPaint.measureText(text)) / 2
                var y: Float = (itemH * index + itemH).toFloat()
                canvas?.drawText(text, x, y, mPaint)


            }

        }

    }

    fun setCity(list: ArrayList<String>) {
        Log.e("list==",list.toString())
        listC = list
    }

    fun setItemIndex(city:String){
        checkIndex=listC?.indexOf(city)!!
        invalidate()
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_HOVER_MOVE->{
                this.showV?.visibility=View.VISIBLE
            }
            MotionEvent.ACTION_DOWN->{
                listC?.let {
                    val oldin=checkIndex
                    val c =(event.y/viewH*it.size)

                    if (oldin!=c.toInt()){
                        if (c>0&&c<it.size){
                            listener!!(it[c.toInt()])
                        }
                    }
                    Log.e("checkIndex==","$checkIndex")
                    checkIndex=c.toInt()
                    invalidate()
                }
                this.showV?.visibility=View.VISIBLE
            }
            MotionEvent.ACTION_UP->{
                this.showV?.visibility=View.GONE
            }
        }


        return true
    }


    var listener:((text:String)->Unit)?=null

    fun setonMovelistener(listener:((text:String)->Unit)?){
        this.listener=listener
    }

    var showV:TextView?=null

    fun setitemV(textView: TextView){
        this.showV=textView
        this.showV?.visibility=GONE
    }
}