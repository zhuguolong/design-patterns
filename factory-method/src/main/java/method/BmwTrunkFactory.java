package method;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 13:46
 */
public class BmwTrunkFactory implements TrunkFactory {
    public Trunk produceTrunk() {
        return new BmwTrunk();
    }
}
