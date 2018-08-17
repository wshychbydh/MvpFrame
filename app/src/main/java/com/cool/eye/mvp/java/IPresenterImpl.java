package com.cool.eye.mvp.java;

/**
 * @author ycb
 * @date 2018/8/17
 */
public class IPresenterImpl<V extends IView> implements IPresenter<V> {

    private V mView;

    @Override
    public V getView() {
        return mView;
    }

    public IPresenterImpl(V view) {
        this.mView = view;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }

    @Override
    public void onRestart() {

    }
}
