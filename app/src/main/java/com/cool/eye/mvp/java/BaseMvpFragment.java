package com.cool.eye.mvp.java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * @author ycb
 * @date 2018/8/17
 */
public abstract class BaseMvpFragment<P extends IPresenter> extends Fragment {

    public abstract P getPresenter();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getPresenter().onCreate();
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenter().onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
        getPresenter().onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onDestroy();
    }
}
