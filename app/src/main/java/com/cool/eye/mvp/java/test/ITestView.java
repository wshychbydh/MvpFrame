package com.cool.eye.mvp.java.test;

import com.cool.eye.mvp.java.ILoadView;

/**
 * @author ycb
 * @date 2018/8/17
 */
public interface ITestView extends ILoadView {

    void setTest(String testMsg);

    void toAnotherPage();
}
