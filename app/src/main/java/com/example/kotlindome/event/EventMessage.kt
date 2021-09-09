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
    val KEY_BOOL = "key_bool"
    val KEY_INT ="key_int"
    val KEY_STRING ="key_string"
    val KEY_SERIALIZABLE = "key_serializable"
    val KEY_PARCELABLE = "key_parcelable"

    fun putBool(value: Boolean):EventMessage{
        bundle.putBoolean(KEY_BOOL,value)
        return this
    }

    fun putInt(value: Int):EventMessage{
        bundle.putInt(KEY_INT,value)
        return this
    }

    fun putString(value: String): EventMessage {
        bundle.putString(KEY_STRING, value)
        return this
    }

    fun put(value: Serializable): EventMessage {
        bundle.putSerializable(KEY_SERIALIZABLE, value)
        return this
    }

    fun put(value: Parcelable): EventMessage {
        bundle.putParcelable(KEY_PARCELABLE, value)
        return this
    }

    fun getInt():Int{
        return bundle.getInt(KEY_INT)
    }

    fun getBool():Boolean{
        return bundle.getBoolean(KEY_BOOL)
    }

    fun getString():String{
        return bundle.getString(KEY_STRING,null)
    }

    fun <T : java.io.Serializable> getSerializable(): Serializable {
        return bundle.getSerializable(KEY_SERIALIZABLE) as T
    }

    fun <T : Parcelable> getParcelable(): T? {
        return bundle.getParcelable<T>(KEY_PARCELABLE)
    }
}
