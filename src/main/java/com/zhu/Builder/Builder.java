package com.zhu.Builder;

/**
 * @author zhugu
 * 2018/11/28 21:49
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
