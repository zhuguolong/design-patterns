package singleton;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:57
 * @Description 饿汉式Singleton01：类初始化完成就创建好了对象，该对象不会改变，线程安全
 */
public class Singleton01 {
    private Singleton01() {}

    private static Singleton01 singleton01;

    // 静态代码块
    static {
        singleton01 = new Singleton01();
    }

    public static Singleton01 getInstance() {
        return singleton01;
    }
}
