package model;

public class Shower extends Device implements WashroomDevice {
    public Shower(String id, String name) {
        super(id, name);
    }

    public String getDeviceType() {
        return "Shower";
    }
}