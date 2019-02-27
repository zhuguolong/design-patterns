package simplefactory;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 9:10
 * @Description 消费者
 */
public class Customer {
    public static void main(String[] args) {
        TrunkFactory factory = new TrunkFactory();
        factory.produceTrunk("宝马").run();
        factory.produceTrunk("奥迪").run();
        factory.produceTrunk("五菱宏光").run();
    }
}
