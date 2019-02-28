package abstracts;

import org.junit.Test;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:21
 */
public class Customer {
    @Test
    public void customer() {
        CarFactory bmwFactory = new BmwFactory();
        bmwFactory.produceSedan().run();
        bmwFactory.produceTruck().run();

        CarFactory audiFactory = new AudiFactory();
        audiFactory.produceTruck().run();
        audiFactory.produceSedan().run();
    }
}
