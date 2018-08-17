package com.cool.eye.mvp.kotlin

/**
 * @author ycb
 * @date 2018/8/17
 */
interface IPresenter<V : IView> {

    val view: V

    fun onCreate() {}

    fun onStart() {}

    fun onPause() {}

    fun onResume() {}

    fun onStop() {}

    fun onDestroy() {}

    fun onRefresh() {}

    fun onLoadMore() {}

    fun onRestart() {}
}
