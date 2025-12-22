package model;

public class MusicPlayer extends Device implements EntertainmentDevice, BedroomDevice {
    private int volume;

    public MusicPlayer(String id, String name) {
        super(id, name);
        volume = 5;
    }

    public String getDeviceType() {
        return "Music Player";
    }

    public void increaseVolume() {
        if (volume < 10) volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) volume--;
    }

    public int getVolume() {
        return volume;
    }
}