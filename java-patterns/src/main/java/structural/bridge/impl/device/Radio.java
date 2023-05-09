package structural.bridge.impl.device;

import structural.bridge.Device;

/**
 * Usage: 收音机设备 <br/>
 * Date: 2023/5/9 9:07 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Radio implements Device {
    private int volume = 80;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
            return;
        }
        if (volume < 0) {
            this.volume = 0;
            return;
        }
        this.volume = volume;
    }
}
