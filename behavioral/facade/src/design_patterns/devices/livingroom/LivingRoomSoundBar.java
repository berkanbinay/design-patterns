package design_patterns.devices.livingroom;

import design_patterns.devices.SoundBar;
import design_patterns.devices.TV;

public class LivingRoomSoundBar extends SoundBar {

    protected TV tv;

    public LivingRoomSoundBar(TV tv) {
        super("LivingRoomSoundBar");
        this.tv = tv;
    }

    public TV tv() {
        return tv;
    }

}

