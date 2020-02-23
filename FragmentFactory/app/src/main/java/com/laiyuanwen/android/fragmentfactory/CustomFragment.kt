package com.laiyuanwen.android.fragmentfactory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_custom.view.*


class CustomFragment(val args: Int) : Fragment() {

    constructor():this(-1){
        Log.d("laiyuanwenDebug","调用无参构造函数")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_custom, container, false)
        rootView.text.text = "${rootView.text.text} + ${this.args}"
        return rootView
    }
}
