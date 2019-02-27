package method;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 13:47
 */
public class AudiTrunkFactory implements TrunkFactory {
    public Trunk produceTrunk() {
        return new AudiTrunk();
    }
}
