package com.example.kotlindome.util

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.kotlindome.R
import java.io.File

/**
 * 开发者   biwu
 * 创建时间 2021/9/9
 * 描述
 */

object ImageLoadUtil {

    @SuppressLint("CheckResult")
    fun ImageLoadNoCaching(context: Context, url: String, imageView: ImageView, id: Int) {

        val options = RequestOptions()
        options
            //                .error(R.drawable.mr)
            .placeholder(id)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .skipMemoryCache(true) // 不使用内存缓存
            //                .diskCacheStrategy(DiskCacheStrategy.NONE) // 不使用磁盘缓存
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }


    @SuppressLint("CheckResult")
    fun ImageLoadNoCaching(url: String, context: Context, imageView: ImageView, img: Int) {

        val options = RequestOptions()
        options
            .placeholder(img)
            //                .placeholder(R.color.transparent1)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(false) // 不使用内存缓存
        //                .diskCacheStrategy(DiskCacheStrategy.NONE) // 不使用磁盘缓存
        //                .fallback(R.drawable.mr);

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }


    @SuppressLint("CheckResult")
    fun ImageLoad(context: Context, url: String, imageView: ImageView, id: Int) {

        val options = RequestOptions()
        options
            .error(R.drawable.mr)
            .placeholder(id)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoad1(context: Context, url: String, imageView: ImageView, id: Int) {

        val options = RequestOptions()
        options
            .error(R.drawable.mr)
            .placeholder(id)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }


    //加载本地
    @SuppressLint("CheckResult")
    fun ImageLoad(context: Context, url: Int, imageView: ImageView, id: Int) {

        val options = RequestOptions()
        options
            //                .error(R.drawable.mr)
            .placeholder(id)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }


    @SuppressLint("CheckResult")
    fun ImageLoad(context: Context, url: String, imageView: ImageView) {

        val options = RequestOptions()
        options
            .placeholder(R.drawable.mr)
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(R.drawable.mr)

        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }

    fun ImageLoad(context: Context, url: String, imageView: ImageView, defaultImg: Boolean) {

        val options = RequestOptions()
        options.skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)

        if (defaultImg) {
            options.placeholder(R.drawable.mr)
                .fallback(R.drawable.mr)
        }

        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoad(context: Context, url: String, imageView: ImageView, arrimg: Int, `is`: Boolean) {

        val options = RequestOptions()
        options
            .placeholder(arrimg)
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(arrimg)

        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoad1(context: Context, url: String, imageView: ImageView) {

        val options = RequestOptions()
        options
            .placeholder(R.drawable.mr)
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(R.drawable.mr)

        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGif(url: String, context: Context, imageView: ImageView) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        Glide.with(context).load(url).into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGif2(url: String, context: Context, imageView: ImageView) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        Glide.with(context).load(url).into(imageView)
    }

    /**
     * 加载动画，没有默认加载 resId
     * @param url
     * @param context
     * @param imageView
     * @param resId
     */
    @SuppressLint("CheckResult")
    fun ImageLoadGifAward(url: String, context: Context, imageView: ImageView, resId: Int) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        if (StringUtils.isEmpty(url)) {
            Glide.with(context).asGif().load(resId).into(imageView)
        } else {
            Glide.with(context).load(url).into(imageView)
        }
    }

    /**
     * 加载动画，没有默认加载 resId
     * @param url
     * @param context
     * @param imageView
     * @param resUrl
     */
    @SuppressLint("CheckResult")
    fun ImageLoadGifAward(url: String, context: Context, imageView: ImageView, resUrl: String) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        if (StringUtils.isEmpty(url)) {
            Glide.with(context).load(resUrl).into(imageView)
        } else {
            Glide.with(context).load(url).into(imageView)
        }
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGifRound(url: String, context: Context, imageView: ImageView) {
        val options = RequestOptions()
        options.fitCenter()
            //                .placeholder(R.drawable.mr)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(DensityUtil.dp2px(5f,context))))
        //                .fallback(R.drawable.mr);
        Glide.with(context).load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGif1(url: String?, context: Context, imageView: ImageView) {
        //        RequestOptions options = new RequestOptions();
        //        options
        //                .fitCenter()
        //                .placeholder(R.drawable.mr)
        //                .fallback(R.drawable.mr);
        if (url != null) {
            if (url.toLowerCase().startsWith("http")) {
                Glide.with(context)
                    .load(url)
                    .placeholder(R.drawable.mr)
                    .error(R.drawable.mr)
                    .into(imageView)
            } else {
                Glide.with(context)
                    .load(File(url))
                    .placeholder(R.drawable.mr)
                    .error(R.drawable.mr)
                    .into(imageView)
            }
        }
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGif(url: Int, context: Context, imageView: ImageView) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        Glide.with(context).load(url).into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadGif1(url: Int, context: Context, imageView: ImageView) {
        val options = RequestOptions()
        options
            .fitCenter()
            .placeholder(R.drawable.mr)
            .fallback(R.drawable.mr)
        Glide.with(context).load(url).into(imageView)
    }

    //    R.drawable.z1
    //无占位图图片
    @SuppressLint("CheckResult")
    fun ImageLoad(url: String, context: Context, imageView: ImageView, s: String) {

        val options = RequestOptions()
        options
            .placeholder(R.drawable.mr)
            .diskCacheStrategy(DiskCacheStrategy.ALL)

        Glide.with(context)
            .load(url)
            //                .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoad(context: Context, url: Int, imageView: ImageView) {

        val options = RequestOptions()
        options
            .error(R.drawable.mr)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fitCenter()
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoad1(context: Context, url: Int, imageView: ImageView) {

        val options = RequestOptions()
        options
            .error(R.drawable.mr)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fitCenter()
            .fallback(R.drawable.mr)

        Glide.with(context)
            .load(url)
            .apply(options)
            .into(imageView)
    }

    fun ImageLoad(context: Context, file: File, imageView: ImageView) {

        //        RoundedCorners roundedCorners= new RoundedCorners(90);
        //        RequestOptions options = RequestOptions.bitmapTransform(roundedCorners).override(300, 300);

        Glide.with(context)
            .load(file)
            .into(imageView)
    }

    fun loadRoundImage(view: ImageView, url: String, id: Int) {
        var roundedCorners: RoundedCorners? = null
        //通过RequestOptions扩展功能
        var options: RequestOptions? = null
        if (id == 0) {
            roundedCorners = RoundedCorners(30)
            options = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
                .fallback(R.drawable.mr).error(R.drawable.mr)
                .circleCrop()
        } else {
            roundedCorners = RoundedCorners(id)
            options =
                RequestOptions.bitmapTransform(roundedCorners).fallback(R.drawable.mr)
                    .error(R.drawable.mr)
                    .override(300, 300)
        }
        Glide.with(view.context)
            .load(url).apply(options!!).into(view)
    }

    fun loadRoundImage0(view: ImageView, url: String, id: Int) {
        var roundedCorners: RoundedCorners? = null
        //通过RequestOptions扩展功能
        var options: RequestOptions? = null
        if (id == 0) {
            roundedCorners = RoundedCorners(30)
            options = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
                .fallback(R.drawable.mr).error(R.drawable.mr).circleCrop()
        } else {
            roundedCorners = RoundedCorners(id)
            options = RequestOptions.bitmapTransform(roundedCorners).fallback(R.drawable.mr)
                .error(R.drawable.mr)
                .override(300, 300)
        }
        Glide.with(view.context)
            .load(url).apply(options!!).into(view)
    }


    fun loadRoundImage(view: ImageView, url: String, id: Int, img: Int) {
        var roundedCorners: RoundedCorners? = null
        //通过RequestOptions扩展功能
        var options: RequestOptions? = null
        if (id == 0) {
            roundedCorners = RoundedCorners(30)
            options = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
                .fallback(img).error(img).circleCrop()
        } else {
            roundedCorners = RoundedCorners(id)
            options = RequestOptions.bitmapTransform(roundedCorners).fallback(img).error(img)
                .override(300, 300)
        }
        Glide.with(view.context)
            .load(url).apply(options).into(view)
    }


    @SuppressLint("CheckResult")
    fun ImageLoad(img: Int, context: Context, url: String, imageView: ImageView) {

        val options = RequestOptions()
        options.placeholder(img)
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fallback(img)

        Glide.with(context)
            //                .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }


    //    圆角
    fun toRoundCorners(img: Int, context: Context, url: String, imageView: ImageView) {
        // 圆角处理
        //        RequestOptions options = new RequestOptions();
        //        options .placeholder(img)
        //                .skipMemoryCache(false)
        //                .diskCacheStrategy(DiskCacheStrategy.ALL)
        //                .placeholder(img)
        //                .fallback(img);
        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            //                .apply(options)
            .into(imageView)
    }


    //    圆角
    fun toRoundCorner2(img: Int, context: Context, url: String, imageView: ImageView) {
        // 圆角处理
        val options = RequestOptions()
        options.fitCenter()
            //                .placeholder(R.drawable.mr)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(DensityUtil.dp2px(5f,context))))
        //                .fallback(R.drawable.mr);
        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .apply(options)
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadCircleCrop(context: Context, url: String, imageView: ImageView) {

        Glide.with(context)
            .load(url)
            .apply(RequestOptions.bitmapTransform(CircleCrop()).error(R.drawable.mr))
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadAct(context: Context, url: String, imageView: ImageView) {
        val options = RequestOptions()
        options.error(R.drawable.mr)
        Glide.with(context)
            .load(url)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(1)))
            .into(imageView)
    }

    @SuppressLint("CheckResult")
    fun ImageLoadAct1(context: Context, url: String, imageView: ImageView) {
        val options = RequestOptions()
        options.error(R.drawable.mr)
        Glide.with(context)
            .load(url)
            .apply(RequestOptions.bitmapTransform(CircleCrop()).error(R.drawable.mr))
            .into(imageView)
    }


//    //右圆角
//    fun rightRoundCorners(img: Int, context: Context, url: String, imageView: ImageView) {
//        // 圆角处理
//
//        val myOptions = RequestOptions().optionalTransform(
//            GlideRoundedCornersTransform(
//                MeasureUtil.dip2px(
//                    context,
//                    40
//                ), GlideRoundedCornersTransform.CornerType.TOP_RIGHT
//            )
//        ).skipMemoryCache(true).diskCacheStrategy(
//            DiskCacheStrategy.NONE
//        ).placeholder(img).fallback(img)
//
//        Glide.with(context)
//            //                .asBitmap() //必须
//            .load(url)
//            .apply(myOptions)
//            .into(imageView)
//    }

    fun cacheRoundCorners(img: Int, context: Context, url: String, imageView: ImageView) {
        // 圆形处理
        //        RequestOptions myOptions = new RequestOptions().bitmapTransform(new CircleCrop()).skipMemoryCache(false)
        //                .diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(img).fallback(img);

        Glide.with(context)
            .asBitmap() //必须
            .load(url)
            .placeholder(img)
            .error(img)
            //                .apply(myOptions)
            .into(imageView)
    }

//    fun cacheRoundCorners(context: Context, img: Int, url: String, imageView: ImageView) {
//        // 圆形处理
//        val myOptions = RequestOptions().bitmapTransform(CircleCrop()).skipMemoryCache(false)
//            .diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(img).fallback(img)
//
//        Glide.with(context)
//            .asBitmap() //必须
//            .load(url)
//            .apply(myOptions)
//            .into(imageView)
//    }
}
