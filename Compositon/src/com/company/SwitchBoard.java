package com.company;

public class SwitchBoard {
    public Fan fan;
    public Lights lights;

    public SwitchBoard(Fan fan, Lights lights) {
        this.fan = fan;
        this.lights = lights;
    }

    public Fan getFan() {
        return fan;
    }

    public Lights getLights() {
        return lights;
    }

    public void fanon(){
        fan.fanswitch(true);
    }
    public void fanoff(){
        fan.fanswitch(false);
    }
    public void lightson(){
        lights.lightsswitch(true);
    }
    public void lightsoff(){
        lights.lightsswitch(false);
    }

}
