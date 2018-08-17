package com.cool.eye.mvp.kotlin.test


import android.content.Context
import com.cool.eye.mvp.kotlin.BaseMvpFragment

/**
 * @author ycb
 * @date 2018/8/17
 */
class TestFragment : BaseMvpFragment<TestPresenter>(), ITestView {

    override fun getPresenter(): TestPresenter {
        return TestPresenter(this)
    }

    override fun setTest(testMsg: String) {

    }

    override fun toAnotherPage() {

    }

    override fun withContext(): Context {
        return context
    }
}
