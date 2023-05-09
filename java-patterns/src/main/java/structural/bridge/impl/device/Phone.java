package structural.bridge.impl.device;

import structural.bridge.Device;

/**
 * Usage: 手机设备 <br/>
 * Date: 2023/5/9 9:09 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Phone implements Device {
    private int volume = 30;

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
