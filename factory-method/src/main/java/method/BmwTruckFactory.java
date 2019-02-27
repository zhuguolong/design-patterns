package method;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 13:46
 */
public class BmwTruckFactory implements TruckFactory {
    public Truck produceTrunk() {
        return new BmwTruck();
    }
}
