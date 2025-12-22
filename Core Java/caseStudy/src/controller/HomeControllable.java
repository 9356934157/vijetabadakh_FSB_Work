package controller;

import model.*;

public interface HomeControllable {
	void addRoom(Room r);

    void addDevice(Room r, Device d);

    void turnOnDevice(Device d);

    void turnOffDevice(Device d);

    boolean getDeviceStatus(Device d);
    House getHouse();
}