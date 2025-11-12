package assingent0;



public class Defence {
	String nameOfHead;
	int ofMission;
	int noVehicle;
	double budget;
	String contry;
	int manPowerCount;
	
	Defence(){
		this.nameOfHead="vijeta";
		this.ofMission=34;
		this.noVehicle=44;
		this.budget=435;
		this.contry="xyz";
		this.manPowerCount=24;
	}
	
	Defence(String str,int mis,int veh,double bug,String con,int pow){
		this.nameOfHead=str;
		this.ofMission=mis;
		this.noVehicle=veh;
		this.budget=bug;
		this.contry=con;
		this.manPowerCount=pow;
	}

	public String getNameOfHead() {
		return nameOfHead;
	}

	public void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}

	public int getOfMission() {
		return ofMission;
	}

	public void setOfMission(int ofMission) {
		this.ofMission = ofMission;
	}

	public int getNoVehicle() {
		return noVehicle;
	}

	public void setNoVehicle(int noVehicle) {
		this.noVehicle = noVehicle;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public int getManPowerCount() {
		return manPowerCount;
	}

	public void setManPowerCount(int manPowerCount) {
		this.manPowerCount = manPowerCount;
	}
	void display() {
		System.out.println("Name of head :"+this.nameOfHead);
		System.out.println("Number of Mission :"+this.ofMission);
		System.out.println("Number of Vehical :"+this.noVehicle);
		System.out.println("Budget is :"+this.budget);
		System.out.println("Country is :"+this.contry);
		System.out.println("man POWER COUNT :"+ this.manPowerCount);
	}
}
class Navy extends Defence{
	int noOFShips;
	int noOfSubbmirns;
	int noTorpedoes;

	Navy(){
		super();
		this.noOFShips=12;
		this.noOfSubbmirns=243;
		this.noTorpedoes=423;
	}

	Navy(String str,int mis,int veh,double bug,String con,int pow,int sh,int sub,int to){
		super(str,mis,veh,bug,con,pow);
		this.noOFShips=sh;
		this.noOfSubbmirns=sub;
		this.noTorpedoes=to;
	}

	public int getNoOFShips() {
		return noOFShips;
	}

	public void setNoOFShips(int noOFShips) {
		this.noOFShips = noOFShips;
	}

	public int getNoOfSubbmirns() {
		return noOfSubbmirns;
	}

	public void setNoOfSubbmirns(int noOfSubbmirns) {
		this.noOfSubbmirns = noOfSubbmirns;
	}

	public int getNoTorpedoes() {
		return noTorpedoes;
	}

	public void setNoTorpedoes(int noTorpedoes) {
		this.noTorpedoes = noTorpedoes;
	}

	void display() {
		super.display();
		System.out.println("Nuber od ships :"+this.noOFShips);
		System.out.println("Number of subbmirans :"+this.noOfSubbmirns);
		System.out.println("Number of torpedoes :"+this.noTorpedoes);
	}
}
class Army extends  Defence{
	int noOFTank;
	int noofGun;
	int noOfBatallin;
	
	Army(){
		super();
		this.noOfBatallin=43;
		this.noOFTank=34;
		this.noofGun=34;
	}
	Army(String str,int mis,int veh,double bug,String con,int pow,int tank,int gun,int bat){
		super(str,mis,veh,bug,con,pow);
		this.noOfBatallin=bat;
		this.noOFTank=tank;
		this.noofGun=gun;
	}
}
class Airfores extends Defence{
	String airCarft;

	Airfores(){
		super();
		this.airCarft="fsaef";
		
	}
	Airfores(String str,int mis,int veh,double bug,String con,int pow,String ss){
		super(str,mis,veh,bug,con,pow);
		this.airCarft=ss;
		
	}
	public String getAirCarft() {
		return airCarft;
	}
	public void setAirCarft(String airCarft) {
		this.airCarft = airCarft;
	}
	void display() {
		super.display();
		System.out.println("AirCarft :"+this.airCarft);
	}
}

class test6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Defence d1= new  Defence ();
		 Defence d2= new  Defence ("efs",22,55,33,"dfgdf",55);
		 
		 d1.display();
		 d2.display();
		
		 Navy n1= new Navy();
		 Navy n2= new Navy("sdfd",44,23,67,"sfsdg",77,67,23,23);
		 
		 n1.display();
		 n2.display();
		 
		 Army a1= new Army();
		 Army a2= new Army("ere",43,65,12,"dfsd",45,67,12,34);
		 
		 a1.display();
		 a2.display();
		 
		 Airfores f1= new Airfores();
		 Airfores f2= new Airfores("fdg",34,34,234,"rgd",34,"sef");
		 
		 f1.display();
		 f2.display();
	}

}
