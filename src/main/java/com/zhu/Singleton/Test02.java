package com.zhu.Singleton;

/**
 * @author zhugu
 * 2018/11/26 21:57
 */
public class Test02 {
    public static void main(String[] args) {
        Singleton_NotSerious instance = Singleton_NotSerious.getInstance();

        for (int i = 0; i < 5000; i++) {
            new Thread(() -> {
                int count = instance.getCount();
                System.out.println("剩余票数：" + count);
            }).start();
        }
    }
}
