package simple;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/2/27 9:18
 * @Description 生产卡车的工厂类
 */
public class TrunkFactory {
    // 生产宝马、奥迪卡车
    public Trunk produceTrunk(String msg) {
        if ("宝马".equals(msg)) {
            return new BmwTrunk();
        } else if ("奥迪".equals(msg)) {
            return new AudoTrunk();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
