package singleton;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:48
 * @Description 饿汉式Singleton：类初始化完成就创建好了对象，该对象不会改变，线程安全
 */
public class Singleton {
    // 私有无参构造方法，目的：只能在本类中创建该对象，防止其他类创建该对象
    private Singleton() {}

    private static Singleton singleton = new Singleton();

    // 静态工厂方法
    public static Singleton getInstance() {
        return singleton;
    }
}
