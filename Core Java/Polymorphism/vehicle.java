package assingent0;
 class Vehicle {
String brand;
int speed;

 Vehicle(){
	 this.brand="unkown";
	 this.speed=213;
 }
	 
 Vehicle(String str,int s){
	 this.brand=str;
	 this.speed=s;
 }

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}
 void display() {
	 System.out.println("Brand is :"+this.brand);
	 System.out.println("speed is :"+this.speed);
 }
 void brake() {
	 System.out.println("brake applied :");
 }
 }
 
 class Car extends Vehicle{
	 int noOfDoors;
 
 Car(){
	 super();
	 this.noOfDoors=4;
 }
 
 Car(String str,int s ,int door){
	 super(str,s);
	 this.noOfDoors=door;
 }
 
  int getNoOfDoors() {
	return noOfDoors;
}
void setNoOfDoors(int noOfDoors) {
	this.noOfDoors = noOfDoors;
}

void display() {
	super.display();
	System.out.println("Number of door :"+this.noOfDoors);
}
void brake() {
	 System.out.println(" deun brake applied :");
}
}
 
 class Bike extends Vehicle{
	 boolean hasGear;
	 
	 Bike(){
		 super();
		 this.hasGear=false;
	 }
	 Bike(String str,int s,boolean g){
		 super(str,s);
		 this.hasGear=g;
	 }
		
boolean isHasGear() {
		return hasGear;
	}
 void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}
 void display() {
		super.display();
		System.out.println("HasGear :"+this.hasGear);
	}
 void brake() {
	 System.out.println(" dis brake applied :");
 }
 }
class test1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Vehicle v1= new  Vehicle();
//		 Vehicle v2= new  Vehicle("wewr",124);
//		 v1.display();
//		 v2.display();
//		 
//		 Car c1= new Car();
//		 Car c2= new Car("fchg",213,5);
//		 c1.display();
//		 c2.display();
//		 
//		 Bike b1= new Bike();
//		 Bike b2= new Bike("yuy",677,true);
//		 b1.display();
//		 b2.display();/
		 Vehicle v1;
		 v1= new  Vehicle("wewr",124);
		v1.brake();
		 
		 v1=new Car();
		 v1.brake();
		 
		 v1=new Bike();
		 v1.brake();
		 
		
	}

}
