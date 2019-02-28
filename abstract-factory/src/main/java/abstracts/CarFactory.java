package abstracts;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/28 10:15
 */
public interface CarFactory {
    public Truck produceTruck();
    public Sedan produceSedan();
}
