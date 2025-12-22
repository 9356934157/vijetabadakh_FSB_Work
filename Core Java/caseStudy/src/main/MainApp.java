package main;
import java.util.*;
import model.*;
import controller.*;
import view.*;
public class MainApp {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	House house=new House();
	HomeControllable home=new HomeController(house);
	View view=new ConsoleView();
	int choice;
	do {
		System.out.println("\n Home Automation menu:");
		System.out.println("1. Add Room to House:");
		System.out.println("2. Add Device to Room:");
		System.out.println("3. Turn On Device:");
		System.out.println("4. Turn Off Device:");
		System.out.println("5. Display Device Status:");
		System.out.println("6. Display Room Status:");
		System.out.println("7. Display House Status:");
		System.out.println("0. Exit");
		System.out.println("Enter the choice:");
		choice=sc.nextInt();
		sc.nextLine();
	    switch(choice)
	    {
	    case 1:{
	    	System.out.println("Enter room name:");
	    	String roomName=sc.nextLine();
	    	home.addRoom(new Room(roomName));
	    	view.showMessage("Room added Successfully.");
	    	break;
	    }
	    case 2:{
	    	System.out.println("Enter room name:");
	    	String roomName=sc.nextLine();
	    	Room room=findRoom(home.getHouse(),roomName);
	    	if(room==null)
	    	{
	    		view.showMessage("Room not found");
	    		break;
	    	}
	    	System.out.println("1.Light 2.Fan 3.AC 4.Television 5.Geyser 6.Shower 7.MusicPlayer");
	    	System.out.println("Select Device:");
	    	int dchoice=sc.nextInt();
	    	sc.nextLine();
	    	System.out.println("Enter device id:");
	    	String id=sc.nextLine();
	    	System.out.println("Enter device name:");
	    	String name=sc.nextLine();
	    	Device d=null;
	    	switch(dchoice)
	    	{
	    	case 1:d=new Light(id,name);break;
	    	case 2:d=new Fan(id,name);break;
	    	case 3:d=new Ac(id,name);break;
	    	case 4:d=new Television(id,name);break;
	    	case 5:d=new Geyser(id,name);break;
	    	case 6:d=new Shower(id,name);break;
	    	case 7:d=new MusicPlayer(id,name);break;
	    	default:view.showMessage("Invalid device choice");
	    	}
	    	if(d!=null)
	    	{
	    		home.addDevice(room, d);
	    		view.showMessage("Device added successfully");
	    	}
	    	break;
	    }
	    case 3:
	    {
	    	Device d=findDevice(home.getHouse(),sc);
	    	if(d!=null)
	    	{
	    		home.turnOnDevice(d);
	    		view.showMessage("Device turned On");
	    	}
	    	break;
	    }
	    case 4:
	    {
	    	Device d=findDevice(home.getHouse(), sc);
	    	if(d!=null)
	    	{
	    	home.turnOffDevice(d);
	    	view.showMessage("Device turned off");
	    	}
	    	break;
	    }
	    case 5:
	    {
	    	Device d=findDevice(home.getHouse(),sc);
	    	if(d!=null)
	    	{
	    		view.displayDeviceStatus(d);
	    	}
	    	break;
	    }
	    case 6:
	    {
	    	System.out.println("Enter room name:");
	    	String roomName=sc.nextLine();
	    	Room r=findRoom(home.getHouse(), roomName);
	    	if(r!=null)
	    	{
	    		view.displayRoomStatus(r);
	    	}
	    	else
	    	{
	    		view.showMessage("Room not found");
	    	}
	    	break;
	    }
	    case 7:
	    {
	    	view.displayHouseStatus(home.getHouse());
	    	break;
	    }
	    case 0:
	    {
	    	view.showMessage("Exiting system");
	    	break;
	    }
	    default: 
	    	view.showMessage("Invalid choice");
	    }
	}while(choice!=0);
}

private static Device findDevice(House house, Scanner sc) {
	System.out.print("Enter room name: ");
    String roomName = sc.nextLine();
    Room r = findRoom(house, roomName);

    if (r == null) {
        System.out.println("Room not found.");
        return null;
    }

    System.out.print("Enter device name: ");
    String deviceName = sc.nextLine();

    for (Device d : r.getDevices()) {
        if (d.deviceName.equalsIgnoreCase(deviceName)) {
            return d;
        }
    }

    System.out.println("Device not found.");
    return null;
}

private static Room findRoom(House house, String roomName) {
	// TODO Auto-generated method stub
	for(Room r:house.getRooms())
	{
		if(r.getRoomName().equalsIgnoreCase(roomName))
		{
			return r;
		}
	}
	return null;
}
}