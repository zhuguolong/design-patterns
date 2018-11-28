package com.zhu.Singleton;

/**
 * @author zhugu
 * 2018/11/26 21:29
 * 该单例在多线程环境下可能会出现问题
 */
public class Singleton_NotSerious {
    private static Singleton_NotSerious singleton_NotSerious = null;

    /**
     * 私有构造方法，防止外部有new操作
     */
    private Singleton_NotSerious() {
        System.out.println("Singleton_NotSerious生成了一个实例！");
    }

    private int ticket = 100000;
    public synchronized int getCount() {
        return --ticket;
    }

    public static Singleton_NotSerious getInstance() {
        if (singleton_NotSerious == null) {
            singleton_NotSerious = new Singleton_NotSerious();
        }
        return singleton_NotSerious;
    }
}
