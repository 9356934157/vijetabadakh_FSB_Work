package model;

public abstract class Device implements ControllableDevice {
    public String deviceId;
    public String deviceName;
    private boolean isOn;
    private long lastOnTime;
    private long totalActiveTime;

    public Device(String id, String name) {
		// TODO Auto-generated constructor stub
    	this.deviceId=id;
    	this.deviceName=name;
    	this.isOn=false;
    	this.lastOnTime=0;
	}

	public abstract String getDeviceType();

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            lastOnTime = System.currentTimeMillis();
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            long now = System.currentTimeMillis();
            totalActiveTime += (now - lastOnTime);
        }
    }

    public boolean getStatus() {
        return isOn;
    }

    public long getTotalActiveTime() {
        return totalActiveTime;
    }
}