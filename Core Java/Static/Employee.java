class Employee{
String name;
double salary;
static double companyBounsRate=10.0;

Employee(){
this.name="manjiri";
this.salary=56477;
}

Employee(String n, double sal){
name=n;
salary=sal;
}

void setName(String nm){
this.name=nm;
}

void setSalary(double sal){
this.salary=sal;
}

static void setCompanyBounsRate( double newRate){
companyBounsRate=newRate;
}

String getName(){
return this.name;
}

double getSalary(){
return this.salary;
}

double setCompanyBounsRate(){
return this.companyBounsRate;

}
double calculateTotalSalary(){
return salary + (salary * companyBounsRate / 100);

}

void display(){
System.out.println("Name :"+this.name);
System.out.println("salary :"+this.salary);
System.out.println("company Bouns Rate :"+this.companyBounsRate);
System.out.println("Total Salary :"+this.calculateTotalSalary());

}
}

class Test{
public static void main(String[] args){

Employee e1= new Employee("vijeta",50000);
Employee e2= new Employee();

Employee.setCompanyBounsRate(15.0);

e1.display();
e2.display();

e1.calculateTotalSalary();
e2.calculateTotalSalary();

}
}


