package com.ringle.behaviortracedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import com.ringle.behaviortracedemo.aop.Trace

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     *点击按钮
     */
    fun onClick(view: View) {
        //调用
        behavior()
    }

    @Trace("性能统计")
    fun behavior() {
        SystemClock.sleep(1000)//模拟耗时
    }

}
