package com.zhu.Singleton;

/**
 * @author zhugu
 * 2018/11/26 21:32
 */
public class Test01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        for (int i = 0; i < 50000; i++) {
            new Thread(() -> {
                int count = instance.getCount();
                System.out.println("剩余票数：" + count);
            }).start();
        }
    }
}
