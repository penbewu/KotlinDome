package com.example.kotlindome.util

import android.content.Context
import android.util.TypedValue

/**
 * 开发者   biwu
 * 创建时间 2021/9/9
 * 描述
 */
object DensityUtil {

    /**
     * dp转px
     *
     * @param dpVal
     * @return
     */
    fun dp2px(dpVal: Float,context: Context): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpVal, context.getResources().getDisplayMetrics()
        ).toInt()
    }

    /**
     * sp转px
     * 關於文字大小，都使用dp吧，不要讓APP的文字大小受到系統影響。
     *
     * @param spVal
     * @return
     */
    fun sp2px(spVal: Float,context: Context): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            spVal,context.getResources().getDisplayMetrics()
        ).toInt()
    }

    /**
     * px转dp
     *
     * @param pxVal
     * @return
     */
    fun px2dp(pxVal: Float,context: Context): Float {
        return pxVal / context.getResources().getDisplayMetrics().density
    }

    /**
     * px转sp
     *
     * @param pxVal
     * @return
     */
    fun px2sp(pxVal: Float,context: Context): Float {
        return pxVal / context.getResources()
            .getDisplayMetrics().scaledDensity
    }

}
