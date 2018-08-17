package com.cool.eye.mvp.java;


/**
 * @author ycb
 * @date 2018/8/17
 */
public interface ILoadView<V extends LoadView> extends IView{

    V getLoadView();

}
