package structural.bridge.impl.remote;

import structural.bridge.Device;

/**
 * Usage: 高级遥控器 <br/>
 * Date: 2023/5/9 9:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        super.device.setVolume(0);
    }
}
