package com.cool.eye.mvp.java.test;


import com.cool.eye.mvp.java.BaseMvpFragment;
import com.cool.eye.mvp.java.LoadView;

/**
 * @author ycb
 * @date 2018/8/17
 */
public class TestFragment extends BaseMvpFragment<TestPresenter> implements  ITestView{

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

    @Override
    public LoadView getLoadView() {
        return LoadView.get(getContext());
    }
}
