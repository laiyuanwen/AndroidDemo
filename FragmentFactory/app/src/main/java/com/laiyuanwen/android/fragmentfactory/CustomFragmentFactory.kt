package com.laiyuanwen.android.fragmentfactory

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

/**
 * Created by laiyuanwen on 2020/2/21.
 */
class CustomFragmentFactory : FragmentFactory() {

    var args = 100
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        // FIXME 两个等号是判断内容是否相等
        // FIXME 三个等号是引用是否相同
        if(className == CustomFragment::class.java.name){
            Log.d("laiyuanwenDebug","实例化CustomFragment")
            return CustomFragment(args++)
        }
        return super.instantiate(classLoader, className)
    }
}