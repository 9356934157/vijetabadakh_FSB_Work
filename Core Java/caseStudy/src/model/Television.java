package model;

public class Television extends Device implements EntertainmentDevice, HallDevice {
    private int volume;

    public Television(String id, String name) {
        super(id, name);
        volume = 10;
    }

    public String getDeviceType() {
        return "Television";
    }

    public void increaseVolume() {
        if (volume < 20) volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) volume--;
    }

    public int getVolume() {
        return volume;
    }
}
