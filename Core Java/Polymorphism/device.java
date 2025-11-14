package assingent0;

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
void specs() {
    System.out.println("General Device - No special specifications");
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
	 void specs() {
	        System.out.println("Mobile Specs → Camera Pixel: " + this.camerPixel);
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
	 void specs() {
	        System.out.println("Laptop Specs → RAM Size: " + this.ramSize + "GB");
	    }
 }
class test3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Device d1= new Device();
//		Device d2= new Device("wqe",123);
//		
//		d1.dispaly();
//		d2.dispaly();
//		
//		 Mobile m1= new  Mobile();
//		 Mobile m2= new  Mobile("bcff",324,45);
//		 
//		 m1.dispaly();
//		 m2.dispaly();
//			
//		 Laptop l1= new Laptop();
//		 Laptop l2 = new Laptop();
//		 
//		 l1.dispaly();
//		 l2.dispaly();
		Device d1;
		d1= new  Mobile();
		d1=new  Mobile("bcff",324,45);
		d1.dispaly();
		d1.specs();
		
		d1= new Laptop();
		d1= new Laptop("rgterg",234,34);
		d1.dispaly();
		d1.specs();
		 
	}

}
