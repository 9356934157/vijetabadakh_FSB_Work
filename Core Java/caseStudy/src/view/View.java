package view;

import model.Device;
import model.House;
import model.Room;

public interface View {
	void showMessage(String message);
	void displayDeviceStatus(Device d);
	void displayRoomStatus(Room r);
	void displayHouseStatus(House h);
	
}
