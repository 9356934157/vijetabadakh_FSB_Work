package model;

public class Fan extends Device implements ControllableDevice, BedroomDevice, HallDevice, KitchenDevice {

    int speed;

    public Fan(String id, String name) {
        super(id, name);
        this.speed = 0;
    }

    public String getDeviceType() {
        return "Fan";
    }

    void increaseSpeed() {
        if (speed < 5) {
            speed++;
        }
    }

    void decreaseSpeed() {
        if (speed > 0) {
            speed--;
        }
    }

    int getSpeed() {
        return speed;
    }
}
