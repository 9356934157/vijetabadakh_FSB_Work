package model;

public class Ac extends Device implements TemperatureDevice, BedroomDevice, HallDevice {
    private int temp;

    public Ac(String id, String name) {
        super(id, name);
        temp = 24;
    }

    public String getDeviceType() {
        return "AC";
    }

    public void increaseTemp() {
        if (temp < 30) temp++;
    }

    public void decreaseTemp() {
        if (temp > 16) temp--;
    }

    public int getTemp() {
        return temp;
    }
}
