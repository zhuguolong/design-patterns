package com.zhu.Singleton;

/**
 * @author zhugu
 * 2018/11/26 21:26
 * 该类非常严谨，在多线程环境下也会保持单列
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * 私有构造方法，防止外部有new操作
     */
    private Singleton() {
        System.out.println("Singleton构造方法，生成了一个实例！");
    }

    private int ticket = 50000;
    public synchronized int getCount() {
        return --ticket;
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
