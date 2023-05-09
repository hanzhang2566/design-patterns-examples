package structural.bridge.impl.remote;

import structural.bridge.Device;
import structural.bridge.Remote;

/**
 * Usage: 基础遥控器 <br/>
 * Date: 2023/5/9 9:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class BasicRemote implements Remote {
    protected final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 5);
    }
}
