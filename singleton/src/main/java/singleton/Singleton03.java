package singleton;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/3/18 17:56
 * @Description 双重过滤
 */
public class Singleton03 {
    private Singleton03() {}

    private static Singleton03 singleton03;

    public static Singleton03 getInstance() {
        if (null == singleton03) {
            synchronized (Singleton03.class) {
                if (null == singleton03) {
                    return new Singleton03();
                }
            }
        }
        return singleton03;
    }
}
