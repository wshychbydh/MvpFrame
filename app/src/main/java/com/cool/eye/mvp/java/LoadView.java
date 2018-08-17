package com.cool.eye.mvp.java;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

import java.lang.ref.WeakReference;

/**
 * @author ycb
 * @date 2018/8/17
 */
public class LoadView {

    private WeakReference<Context> mReference;
    private static LoadView mInstance;

    @UiThread
    public static LoadView get(Context context) {
        if (mInstance == null) {
            mInstance = new LoadView(context);
        } else {
            if (mInstance.mReference == null || mInstance.mReference.get() == null) {
                mInstance.mReference = new WeakReference<>(context);
            }
        }
        return mInstance;
    }

    private LoadView(Context context) {
        mReference = new WeakReference<>(context);
    }

    @UiThread
    public void showLoading(String msg) {
        if (getContext() != null) {
            //TODO
        }
    }

    public void cancelLoading() {
        //TODO
    }

    @UiThread
    public void showToast(String msg) {
        if (getContext() != null) {
            //TODO
        }
    }

    @UiThread
    public void showError(Throwable throwable) {
        if (getContext() != null) {
            //TODO
        }
    }

    @UiThread
    public void showDialog(Throwable throwable) {
        if (getActivity() != null) {
            //TODO
        }
    }

    @Nullable
    protected final Context getContext() {
        return mReference.get();
    }

    @Nullable
    protected final Activity getActivity() {
        if (mReference.get() != null && mReference.get() instanceof Activity) {
            return (Activity) mReference.get();
        }
        return null;
    }
}
