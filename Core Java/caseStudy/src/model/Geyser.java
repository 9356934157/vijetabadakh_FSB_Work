package model;

public class Geyser extends Device implements TemperatureDevice, WashroomDevice {
    private int waterTemp;

    public Geyser(String id, String name) {
        super(id, name);
        this.waterTemp = 40;
    }

    public String getDeviceType() {
        return "Geyser";
    }

    public void increaseTemp() {
        if (waterTemp < 60) waterTemp++;
    }

    public void decreaseTemp() {
        if (waterTemp > 20) waterTemp--;
    }

    public int getWaterTemp() {
        return waterTemp;
    }
}
