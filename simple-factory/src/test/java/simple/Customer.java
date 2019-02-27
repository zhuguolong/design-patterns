package simple;

import org.junit.Test;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 9:10
 * @Description 消费者
 */
public class Customer {
    @Test
    public void Test() {
        TruckFactory factory = new TruckFactory();
        factory.produceTrunk("宝马").run();
        factory.produceTrunk("奥迪").run();
//        factory.produceTrunk("五菱宏光").run();
    }
}
