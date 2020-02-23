package com.laiyuanwen.android.fragmentfactory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val customFragmentFactory = CustomFragmentFactory()

    override fun onCreate(savedInstanceState: Bundle?) {
        // 设置fragmentFactory
        supportFragmentManager.fragmentFactory = customFragmentFactory
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }

        if (savedInstanceState === null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content, CustomFragment::class.java, savedInstanceState)
                .commit()
        }
    }
}
