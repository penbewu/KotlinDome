package com.example.kotlindome.event

import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
class EventMessage {
    var code :Int =0

    var bundle = Bundle()

    constructor(code: Int){
        this.code=code
    }

    val KEY_SERIALIZABLE = "key_serializable"
    val KEY_PARCELABLE = "key_parcelable"

    fun put(value: Serializable): EventMessage {
        bundle.putSerializable(KEY_SERIALIZABLE, value)
        return this
    }

    fun put(value: Parcelable): EventMessage {
        bundle.putParcelable(KEY_PARCELABLE, value)
        return this
    }

    fun <T : java.io.Serializable> getSerializable(): Serializable {
        return bundle.getSerializable(KEY_SERIALIZABLE) as T
    }

    fun <T : Parcelable> getParcelable(): T? {
        return bundle.getParcelable<T>(KEY_PARCELABLE)
    }
}
