package com.laiyuanwen.android.saveinstancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            text.text = "${text.text} + ${savedInstanceState.getString("name")}"
        }else{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,CustomFragment())
                .commit()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("laiyuanwen_debug", "Activity onSaveInstanceState ${outState.hashCode()}")
        // 保存相关数据
        outState.putString("name", "Activity onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }
}
