package com.zhu.Singleton;

/**
 * @author zhugu
 * 2018/11/26 21:57
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++) {
            new Thread(() -> {
                Singleton_NotSerious instance = Singleton_NotSerious.getInstance();
                int count = instance.getCount();
                System.out.println("A-剩余票数：" + count);
            }).start();
            new Thread(() -> {
                Singleton_NotSerious instance = Singleton_NotSerious.getInstance();
                int count = instance.getCount();
                System.out.println("B-剩余票数：" + count);
            }).start();
            new Thread(() -> {
                Singleton_NotSerious instance = Singleton_NotSerious.getInstance();
                int count = instance.getCount();
                System.out.println("C-剩余票数：" + count);
            }).start();
            new Thread(() -> {
                Singleton_NotSerious instance = Singleton_NotSerious.getInstance();
                int count = instance.getCount();
                System.out.println("D-剩余票数：" + count);
            }).start();
            new Thread(() -> {
                Singleton_NotSerious instance = Singleton_NotSerious.getInstance();
                int count = instance.getCount();
                System.out.println("E-剩余票数：" + count);
            }).start();
        }
    }
}
