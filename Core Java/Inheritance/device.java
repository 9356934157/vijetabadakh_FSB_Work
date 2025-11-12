
 class Device {
	 String brand;
double price;

Device(){
	this.brand="scsd";
	this.price=2144;
}
Device(String b,double pri){
	this.brand=b;
	this.price=pri;
}

 public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
double getPrice() {
	return price;
}
 void setPrice(double price) {
	this.price = price;
}
void dispaly() {
	System.out.println("Brand is :"+this.brand);
	System.out.println("Price is :"+this.price);
}
}
 class Mobile extends Device{
	 int camerPixel;
	 
	 Mobile(){
		 super();
		 this.camerPixel=50;
	 }
	 Mobile(String b,double pri,int pixel){
		 super(b,pri);
		 this.camerPixel=pixel;
	 }
	int getCamerPixel() {
		return camerPixel;
	}
	 void setCamerPixel(int camerPixel) {
		this.camerPixel = camerPixel;
	}
	 void dispaly() {
			super.dispaly();
			System.out.println("CamerPixel is :"+this.camerPixel);
		} 
	 
 }
 class Laptop extends Device{
	 int ramSize;
	 
	 Laptop(){
		 super();
		 this.ramSize=446;
	 }
	 Laptop(String b,double pri,int ram){
		 super(b,pri);
	    this.ramSize=ram;
	 }
	 void dispaly() {
			super.dispaly();
			System.out.println("Ram Size is :"+this.ramSize);
		} 
 }
class test3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d1= new Device();
		Device d2= new Device("wqe",123);
		
		d1.dispaly();
		d2.dispaly();
		
		 Mobile m1= new  Mobile();
		 Mobile m2= new  Mobile("bcff",324,45);
		 
		 m1.dispaly();
		 m2.dispaly();
			
		 Laptop l1= new Laptop();
		 Laptop l2 = new Laptop();
		 
		 l1.dispaly();
		 l2.dispaly();
		 
	}

}
