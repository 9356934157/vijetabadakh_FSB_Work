package assingent0;

abstract class Employee{
		int id;
		String name;
		double salary;
		
		Employee(){
		this.id=1;
		this.name="manjiri";
		this.salary=56477;
		}

		Employee(int i,String n, double sal){
		this.id=i;
		this.name=n;
		this.salary=sal;
		}
		void setId(int i){
			this.id=i;
			}
		int getId(){
			return this.id;
			}
	    String getName() {
			return name;
		}

		 void setName(String name) {
			this.name = name;
		}

		 double getSalary() {
			return salary;
		}

		 void setSalary(double salary) {
			this.salary = salary;
		}
		
	  void display(){
		  System.out.println("Id is :"+this.id);
		  System.out.println("Name :"+this.name);
		  System.out.println("salary :"+this.salary);
		
	  }	
	  public String toString() {
		  return "\n id is :"+this.id+ "/"+ "Name is :" +this.name +"Year is: "+this.salary;
	  }
	 abstract double calSalary();
}
	
	class Admin extends Employee{
		int allowance;

		Admin(){
			super();
		System.out.println("Constructor called..");
		this.allowance=28;
		}

		Admin(int i,String n, double sal, int all){
			super(i,n,sal);
		System.out.println(" Prametric Constructor called..");
		this.allowance=all;
		}

		void setAllowance(int all){
		this.allowance=all;
		}
	
		double getAllowance(){
		return this.allowance;
		}

		void display(){
		super.display();
		System.out.println("Allowance is :"+this.allowance);

		}

		 double calSalary() {
			  return salary+allowance;
		  }
	}
	class SaleManger extends Employee{
		
		int target;
		int incetvie;
		
		SaleManger(){
			super();
			this.target=132;
			this.incetvie=2423;
		}
		SaleManger(int i,String n, double sal,int t,int ii){
			super(i,n,sal);
			this.target=t;
			this.incetvie=ii;
		}
		public int getTarget() {
			return target;
		}
		public void setTarget(int target) {
			this.target = target;
		}
		public int getIncetvie() {
			return incetvie;
		}
		public void setIncetvie(int incetvie) {
			this.incetvie = incetvie;
		}
		void display(){
			super.display();
			System.out.println("Target is :"+this.target);
			System.out.println("Incetive is :"+this.incetvie);

			}
		 double calSalary() {
			  return salary+incetvie;
		  }
	}
	class AreaSaleManger extends SaleManger{
		String area;
		
		AreaSaleManger(){
			super();
			this.area="pune";
		}
		AreaSaleManger(int i,String n, double sal,int t,int ii,String s){
			super(i,n,sal,t,ii);
			this.area=s;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		void display(){
			super.display();
			System.out.println("Area is :"+this.area);
			}
		
	}
		
	class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1= new Employee();
//		Employee e2= new Employee(101,"manjiri",21342);
//		
//		e1.display();
//		e2.display();
//		
//		 Admin a1= new Admin();
//		 Admin a2= new Admin(102,"nikita",12312,132);
//		 
//		 a1.display();
//		 a2.display();
//		 
//		 SaleManger s1= new SaleManger();
//		 SaleManger s2= new SaleManger(11,"sdgf",3425,23,34);
//		 
//		 s1.display();
//		 s2.display();
//		 
//		 AreaSaleManger m1= new AreaSaleManger();
//		 AreaSaleManger m2= new AreaSaleManger(22,"dgfh",2324,54,34,"shirapur");
//		 
//		 m1.display();
//		 m2.display();
		
		Employee e1;
	e1= new Admin(101,"gch",587687,76);
	e1= new Admin();		
	e1.display();
	System.out.println(e1.calSalary());
		
		
		e1= new SaleManger(102,"sfdg",43534,78,67);
		e1= new SaleManger();
		e1.display();
		System.out.println(e1.calSalary());
		
		  System.out.println(e1.toString());
	}
	
	}