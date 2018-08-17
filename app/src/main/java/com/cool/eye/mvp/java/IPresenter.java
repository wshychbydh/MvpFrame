package com.cool.eye.mvp.java;

/**
 * @author ycb
 * @date 2018/8/17
 */
public interface IPresenter<V extends IView> {

    V getView();

    void onCreate();

    void onStart();

    void onPause();

    void onResume();

    void onStop();

    void onDestroy();

    void onRefresh();

    void onLoadMore();

    void onRestart();
}
