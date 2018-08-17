package com.cool.eye.mvp.kotlin

import android.os.Bundle
import android.support.v4.app.Fragment


/**
 * @author ycb
 * @date 2018/8/17
 */
abstract class BaseMvpFragment<Presenter : IPresenter<*>> : Fragment() {

    abstract fun getPresenter(): Presenter


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getPresenter().onCreate()
    }

    override fun onStart() {
        super.onStart()
        getPresenter().onStart()
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
