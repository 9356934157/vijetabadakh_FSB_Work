package model;


public class Light extends Device implements HallDevice, BedroomDevice, KitchenDevice {
    public Light(String id, String name) {
        super(id, name);
    }

    public String getDeviceType() {
        return "Light";
    }
}