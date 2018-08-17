package com.cool.eye.mvp.kotlin.test

import android.content.Context
import com.cool.eye.mvp.kotlin.BaseMvpActivity

/**
 * @author ycb
 * @date 2018/8/17
 */
class TestActivity : BaseMvpActivity<TestPresenter>(), ITestView {

    override fun getPresenter(): TestPresenter {
        return TestPresenter(this)
    }

    override fun setTest(testMsg: String) {

    }

    override fun withContext(): Context {
        return this
    }
}