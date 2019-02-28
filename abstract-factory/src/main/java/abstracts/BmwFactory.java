package abstracts;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:17
 */
public class BmwFactory implements CarFactory {
    public Truck produceTruck() {
        return new BmwTruck();
    }

    public Sedan produceSedan() {
        return new BmwSedan();
    }
}
