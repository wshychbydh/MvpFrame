package com.cool.eye.mvp.kotlin.test

import com.cool.eye.mvp.kotlin.IPresenter

/**
 * @author ycb
 * @date 2018/8/17
 */
class TestPresenter(override val view: ITestView) : IPresenter<ITestView> {

    override fun onCreate() {
        super.onCreate()
        loadDataFromDb()
    }

    override fun onResume() {
        super.onResume()
        loadDataFromNet()
    }

    private fun loadDataFromDb() {
        //TODO
        view.setTest("data")

    }

    private fun loadDataFromNet() {
        //TODO
        view.showLoading("loadDataFromNet")
        view.setTest("data")
        view.cancelLoading()
    }
}