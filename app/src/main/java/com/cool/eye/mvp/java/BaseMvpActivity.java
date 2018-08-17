package com.cool.eye.mvp.java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * @author ycb
 * @date 2018/8/17
 */
public abstract class BaseMvpActivity<P extends IPresenter> extends AppCompatActivity {

    public abstract P getPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        getPresenter().onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPresenter().onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        getPresenter().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().onDestroy();
    }
}
