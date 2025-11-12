package assingent0;

public class Farmer {
	String farmerName;
	int farmerId;
	String landArea;
	double annualIncome;
	int noOFequipment;
	String city;
	
	Farmer(){
		this.farmerName="vijeta";
		this.city="safsd";
		this.farmerId=2132;
		this.landArea="yjyj";
		this.annualIncome=3243453;
		this.noOFequipment=233;
				
		}
	Farmer(String name,int id,String str,int inc,int eq,String ci){
		this.farmerName=name;
		this.city=ci;
		this.farmerId=id;
		this.landArea=str;
		this.annualIncome=inc;
		this.noOFequipment=eq;
				
		}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getLandArea() {
		return landArea;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public int getNoOFequipment() {
		return noOFequipment;
	}
	public void setNoOFequipment(int noOFequipment) {
		this.noOFequipment = noOFequipment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void display() {
		System.out.println("Farmer name :"+this.farmerName);
		System.out.println("Farmer id :"+this.farmerId);
		System.out.println("Farmer land area :"+this.landArea);
		System.out.println("Farmer annual income :"+this.annualIncome);
		System.out.println("Farmer no of equmpment :"+this.noOFequipment);
		System.out.println("Farmer city :"+this.city);
	}
}
class DairyFarmer extends Farmer{
	int noOfCattles;
	int milkLiter;
	int dairyLanNo;
	
	DairyFarmer(){
		super();
		this.noOfCattles=34;
		this.milkLiter=453;
		this.dairyLanNo=12423;
	}
	DairyFarmer(String name,int id,String str,int inc,int eq,String ci,int cat,int milk,int lanN){
		super(name,id,str,inc,eq,ci);
		this.noOfCattles=34;
		this.milkLiter=453;
		this.dairyLanNo=12423;
	}
	public int getNoOfCattles() {
		return noOfCattles;
	}
	public void setNoOfCattles(int noOfCattles) {
		this.noOfCattles = noOfCattles;
	}
	public int getMilkLiter() {
		return milkLiter;
	}
	public void setMilkLiter(int milkLiter) {
		this.milkLiter = milkLiter;
	}
	public int getDairyLanNo() {
		return dairyLanNo;
	}
	public void setDairyLanNo(int dairyLanNo) {
		this.dairyLanNo = dairyLanNo;
	}
	void display() {
		super.display();
		System.out.println("no. of cattal :"+this.noOfCattles);
		System.out.println("milk Liter :"+this.milkLiter);
		System.out.println("DAIRY lan no:"+this.dairyLanNo);
	}
}
class PoltryFram extends Farmer {
	int noOFChiken;
	int noNoShad;
	int eggProdusPerDay;
	
	PoltryFram(){
		super();
		this.noNoShad=23;
		this.noOFChiken=345;
		this.eggProdusPerDay=324;
	}
	
	PoltryFram(String name,int id,String str,int inc,int eq,String ci,int chi,int shad,int egg){
		super(name,id,str,inc,eq,ci);
		this.noNoShad=shad;
		this.noOFChiken=chi;
		this.eggProdusPerDay=egg;
	}

	public int getNoOFChiken() {
		return noOFChiken;
	}

	public void setNoOFChiken(int noOFChiken) {
		this.noOFChiken = noOFChiken;
	}

	public int getNoNoShad() {
		return noNoShad;
	}

	public void setNoNoShad(int noNoShad) {
		this.noNoShad = noNoShad;
	}

	public int getEggProdusPerDay() {
		return eggProdusPerDay;
	}

	public void setEggProdusPerDay(int eggProdusPerDay) {
		this.eggProdusPerDay = eggProdusPerDay;
	}
	void display() {
		super.display();
		System.out.println("no. of shead :"+this.noNoShad);
		System.out.println("egg produs per day:"+this.eggProdusPerDay);
		System.out.println("no of chiken :"+this.noOFChiken);
	}
}
class OrganicFarmer extends Farmer{
	int organicID;
	String fertilizerused;
	
	OrganicFarmer(){
		super();
		this.organicID=12;
		this.fertilizerused="sdfs";
	}
	OrganicFarmer(String name,int id,String str,int inc,int eq,String ci,int oid,String fer){
		super(name,id,str,inc,eq,ci);
		this.organicID=oid;
		this.fertilizerused=fer;
	}
	public int getOrganicID() {
		return organicID;
	}
	public void setOrganicID(int organicID) {
		this.organicID = organicID;
	}
	public String getFertilizerused() {
		return fertilizerused;
	}
	public void setFertilizerused(String fertilizerused) {
		this.fertilizerused = fertilizerused;
	}
	void display() {
		super.display();
		System.out.println("organic id :"+this.organicID);
		System.out.println("fertilizer used :"+this.fertilizerused);
		
	}
}
class test7{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Farmer f1= new Farmer();
		Farmer f2 = new Farmer("ewr",22,"efwe",345,353,"sdfs");
		
		f1.display();
		f2.display();
		
		DairyFarmer d1= new DairyFarmer();
		DairyFarmer d2= new DairyFarmer("wede",44,"hgrt",34,453,"gdfg",54,45,345);
		
		d1.display();
		d2.display();
		
		 PoltryFram p1= new  PoltryFram();
		 PoltryFram p2 = new  PoltryFram("fafd",23,"fsdf",34,45,"ggdf",45,45,45);
		 
			p1.display();
			p2.display();	 
		
			 OrganicFarmer o1= new  OrganicFarmer();
			 OrganicFarmer o2 = new  OrganicFarmer("fafd",23,"fsdf",34,45,"ggdf",55,"dhgf");
			 
			 o1.display();
			 o2.display();	 
			
				 
				 
		
	}

}
