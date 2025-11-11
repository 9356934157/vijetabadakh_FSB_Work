

	class Employee{
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

	}
	class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		Employee e2= new Employee(101,"manjiri",21342);
		
		e1.display();
		e2.display();
		
		 Admin a1= new Admin();
		 Admin a2= new Admin(102,"nikita",12312,132);
		 
		 a1.display();
		 a2.display();
		 
		
	}


}