package singleton;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 11:04
 * @Description 懒汉式：类初始化时不会加载，当被第一次使用时创建，只创建一次，但在多线程环境下可能会创建多个对象
 */
public class Singleton02 {
    private Singleton02() {}

    private static Singleton02 singleton02;

    public static synchronized Singleton02 getInstance() {
        if (null == singleton02) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
}
