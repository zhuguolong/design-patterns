package method;

import org.junit.Test;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 13:49
 */
public class Custmoer {
    @Test
    public void customer() {
        TrunkFactory bmw = new BmwTrunkFactory();
        bmw.produceTrunk().run();

        TrunkFactory audi = new AudiTrunkFactory();
        audi.produceTrunk().run();
    }
}
