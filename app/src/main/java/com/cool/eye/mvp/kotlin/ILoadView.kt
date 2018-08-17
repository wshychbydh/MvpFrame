package com.cool.eye.mvp.kotlin

import android.content.Context
import android.support.annotation.UiThread

/**
 * @author ycb
 * @date 2018/8/17
 */
interface ILoadView {


    @UiThread
    fun showLoading(msg: String = "loading") {
        if (withContext() != null) {
            //TODO
        }
    }

    fun cancelLoading() {
        //TODO
    }

    @UiThread
    fun showToast(msg: String) {
        if (withContext() != null) {
            //TODO
        }
    }

    @UiThread
    fun showError(throwable: Throwable) {
        if (withContext() != null) {
            //TODO
        }
    }

    @UiThread
    fun showDialog(throwable: Throwable) {
        val context = withContext()
        //TODO
        if (context != null) {

        }
    }

    /**
     * override this if you want unify handling dialog and toast
     * if show dialog , do not return application's context
     */
    fun withContext(): Context

}