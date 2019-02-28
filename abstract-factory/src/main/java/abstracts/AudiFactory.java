package abstracts;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:18
 */
public class AudiFactory implements CarFactory {
    public Truck produceTruck() {
        return new AudiTruck();
    }

    public Sedan produceSedan() {
        return new AudiSedan();
    }
}
