package structural.bridge;

import org.junit.Assert;
import org.junit.Test;
import structural.bridge.impl.device.Phone;
import structural.bridge.impl.device.Radio;
import structural.bridge.impl.remote.AdvancedRemote;
import structural.bridge.impl.remote.BasicRemote;

/**
 * Usage: 桥接模式测试 <br/>
 * Date: 2023/5/9 9:16 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void testBasicRemote() {
        Device device = new Phone();
        Remote remote = new BasicRemote(device);
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();
        Assert.assertEquals(35, device.getVolume());
    }

    @Test
    public void testAdvancedRemote01() {
        Device device = new Radio();
        Remote remote = new AdvancedRemote(device);
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();
        Assert.assertEquals(85, device.getVolume());
    }

    @Test
    public void testAdvancedRemote02() {
        Device device = new Radio();
        AdvancedRemote remote = new AdvancedRemote(device);
        remote.mute();
        Assert.assertEquals(0, device.getVolume());
    }
}
