package model;
import java.util.*;

public class Room {
    private String roomName;
    private List<Device> devices;

    public Room(String roomName) {
        this.roomName = roomName;
        this.devices = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void addDevice(Device d) {
        devices.add(d);
    }
}
 interface ControllableDevice {
    void turnOn();
    void turnOff();
    boolean getStatus();
}

 interface TemperatureDevice {
    void increaseTemp();
    void decreaseTemp();
}

 interface EntertainmentDevice {
    void increaseVolume();
    void decreaseVolume();
}
  interface KitchenDevice {}
 interface BedroomDevice {}
  interface HallDevice {}
  interface WashroomDevice {}
  interface CorridorDevice {}




