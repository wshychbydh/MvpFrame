package com.cool.eye.mvp.java.test;


import com.cool.eye.mvp.java.IPresenterImpl;

/**
 * @author ycb
 * @date 2018/8/17
 */
public class TestPresenter extends IPresenterImpl<ITestView> {

    public TestPresenter(ITestView view) {
        super(view);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        loadDataFromDb();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadDataFromNet();
    }

    private void loadDataFromDb() {
        //TODO
        getView().setTest("data");

    }

    private void loadDataFromNet() {
        //TODO
        getView().getLoadView().showLoading("loadDataFromNet");
        getView().setTest("data");
        getView().getLoadView().cancelLoading();
    }
}
