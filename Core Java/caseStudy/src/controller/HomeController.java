package controller;

import model.*;


public class HomeController implements HomeControllable {

	House house;
	public HomeController(House house)
	{
		this.house=house;
	}
	
	public void addRoom(Room r)
	{
		house.addRoom(r);
	}
	
	public void addDevice(Room r,Device d)
	{
		r.addDevice(d);
	}
	
	public void turnOnDevice(Device d)
	{
		d.turnOn();
	}
	public void turnOffDevice(Device d)
	{
		d.turnOff();
	}
	public boolean getDeviceStatus(Device d)
	{
		return d.getStatus();
		
	}
	public House getHouse()
	{
		return house;
	}

	
}
