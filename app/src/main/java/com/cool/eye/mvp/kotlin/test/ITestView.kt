package com.cool.eye.mvp.kotlin.test

import com.cool.eye.mvp.kotlin.ILoadView
import com.cool.eye.mvp.kotlin.IView

/**
 * @author ycb
 * @date 2018/8/17
 */
interface ITestView : IView, ILoadView {

    fun setTest(testMsg: String)

    fun toAnotherPage(){}
}