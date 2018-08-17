package com.cool.eye.mvp.java.test;


import com.cool.eye.mvp.java.BaseMvpActivity;
import com.cool.eye.mvp.java.LoadView;

/**
 * @author ycb
 * @date 2018/8/17
 */
public class TestActivity extends BaseMvpActivity<TestPresenter> implements ITestView {


    @Override
    public LoadView getLoadView() {
        return LoadView.get(this);
    }

    @Override
    public TestPresenter getPresenter() {
        return new TestPresenter(this);
    }

    @Override
    public void setTest(String testMsg) {

    }

    @Override
    public void toAnotherPage() {

    }
}
