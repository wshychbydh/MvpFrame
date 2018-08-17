package com.cool.eye.mvp.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author ycb
 * @date 2018/8/17
 */
abstract class BaseMvpActivity<Presenter: IPresenter<*>> : AppCompatActivity() {

    abstract fun getPresenter(): Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getPresenter().onCreate()
    }

    override fun onStart() {
        super.onStart()
        getPresenter().onStart()
    }

    override fun onRestart() {
        super.onRestart()
        getPresenter().onRestart()
    }

    override fun onPause() {
        super.onPause()
        getPresenter().onPause()
    }

    override fun onResume() {
        super.onResume()
        getPresenter().onResume()
    }

    override fun onStop() {
        super.onStop()
        getPresenter().onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        getPresenter().onDestroy()
    }
}