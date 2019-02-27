package method;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 13:47
 */
public class AudiTruckFactory implements TruckFactory {
    public Truck produceTrunk() {
        return new AudiTruck();
    }
}
