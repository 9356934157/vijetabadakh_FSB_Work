 class Student {
 int FBid;
 String name;
 int distance;
 static int count =0;
 
 Student(){
	 System.out.println("default construtor called...");
	 this.name="vijeta";
	 this.distance=23;
	 this.FBid=101;
	 count++;
 }
 
 Student(int id,String nm,int dis){
	 System.out.println("paramter construtor called...");
	 this.name=nm;
	 this.distance=id;
	 this.FBid=dis;
	 count++;
 }
 int getFBid() {
	return FBid;
}
void setFBid(int fBid) {
	FBid = fBid;
}
 String getName() {
	return name;
}
 void setName(String name) {
	this.name = name;
}
 int getDistance() {
	return distance;
}
 void setDistance(int distance) {
	this.distance = distance;
}
 static int getCount() {
	return count;
}

void display() {
	System.out.println("Name is :"+this.name);
	System.out.println("FId is :"+this.FBid);
	System.out.println("Distance is :"+this.distance);
	
}
 
}// student ends hear
 class PlacedStudent extends Student{
	 // step2 remove state and behavior in super class
	int Fid;
	String name;
	int distance;
	String cName;
	String des;

	PlacedStudent(){
		super();
		 this.cName="fbit";
		 this.des="hr";	
	
	 }
	 
	PlacedStudent(String nm,String d,int fid,int dis,String na){
		super();
		 this.cName=nm;
		 this.des=d;
		
	 }
	
	 String getCName() {
		return cName;
	}
	 void setcName(String cName) {
		this.cName = cName;
	}
	 String getDes() {
		return des;
	}
	 void setDes(String des) {
		this.des = des;
	}
	void display(){
		super.display();
		System.out.println("Desgnation is :"+this.des);
		System.out.println("Company Name is :"+this.cName);
		
	}
	
}// placedstudent end hear
 class Test{
	public static void main(String[] args) {
		
		 Student s1= new  Student();
		 Student s2= new  Student(101,"kalayani",213);
	
		 System.out.println("total count :"+Student. getCount());
		 
	}
 }
