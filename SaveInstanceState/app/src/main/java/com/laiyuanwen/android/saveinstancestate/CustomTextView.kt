package com.laiyuanwen.android.saveinstancestate

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

/**
 * Created by laiyuanwen on 2020/2/23.
 *
 * TODO Kotlin自定义View要怎么写构造器
 */
class CustomTextView : AppCompatTextView {

    constructor(mContext: Context) : super(mContext)
    constructor(mContext: Context, attrs: AttributeSet) : super(mContext, attrs)
    constructor(mContext: Context, attrs: AttributeSet, defStyleArrt: Int) : super(
        mContext,
        attrs,
        defStyleArrt
    )

    override fun onSaveInstanceState(): Parcelable? {
        Log.d("laiyuanwen_debug", "CustomTextView onSaveInstanceState")
        return super.onSaveInstanceState()
    }
}