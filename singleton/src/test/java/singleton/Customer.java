package singleton;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:49
 */
public class Customer {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(Singleton02.getInstance());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println(Singleton02.getInstance());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println(Singleton02.getInstance());
            }
        }.start();
    }
}
