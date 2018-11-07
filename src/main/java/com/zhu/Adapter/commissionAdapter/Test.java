package com.zhu.Adapter.commissionAdapter;

/**
 * 使用委托的适配器方式
 */
public class Test {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
