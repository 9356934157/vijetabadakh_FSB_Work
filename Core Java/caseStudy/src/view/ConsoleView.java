package view;

import model.Device;
import model.House;
import model.Room;

public class ConsoleView implements View {

	public void showMessage(String message)
	{
		System.out.println(message);
	}
	public void displayDeviceStatus(Device d)
	{
		System.out.println(d.getDeviceType()+"|Status:"+(d.getStatus()?"ON":"OFF")+"|Active Time"+d.getTotalActiveTime());
	}
	
	public void displayRoomStatus(Room r)
	{
		System.out.println("Room:"+ r.getRoomName());
		for(Device d:r.getDevices())
		{
			displayDeviceStatus(d);
		}
	}
	
	public void displayHouseStatus(House h)
	{
		for(Room r:h.getRooms())
		{
			displayRoomStatus(r);
		}
	}
	
}