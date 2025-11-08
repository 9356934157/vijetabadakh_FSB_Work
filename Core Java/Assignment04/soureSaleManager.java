import java.util.Scanner;
class SaleManager{
int id;
String name;
double salary;
double incentive;
double target;

SaleManager(){
System.out.println("Constructor called..");
this.id=122;
this.name="xyz";
this.salary=2000000;
this.incentive=234;
this.target=5664;
}

SaleManager(int i,String n,double sal,double in,double t){
System.out.println("Prameter Constructor called..");
this.id=i;
this.name=n;
this.salary=sal;
this.incentive=in;
this.target=t;
}

void setId(int i){
this.id=i;
}
void setName(String str){
this. name=str;
}
void setSalary(double sal){
this. salary=sal;
}
void setIncentive(double inc){
this.incentive=inc;
}
void setTarget(double target){
this.target=target;
}

void display(){
System.out.println("ID is :"+this.id);
System.out.println("Name is :"+this.name);
System.out.println("Salary is :"+this.salary);
System.out.println("Incentive is :"+this.incentive);

}


}// SaleManager end here
class Test{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the id: ");
int id= sc.nextInt();

sc.nextLine();

System.out.println("Enter the name: ");
String name= sc.nextLine();

System.out.println("Enter the salary: ");
double sal= sc.nextDouble();

System.out.println("Enter the incentive: ");
double in= sc.nextDouble();

System.out.println("Enter the target: ");
double tar= sc.nextDouble();


  SaleManager e1,e2,e3;
e1= new  SaleManager();
e2= new  SaleManager();
e3= new  SaleManager(id,name,sal,in,tar);

e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setIncentive(1000);
e1.setTarget(500);

e1.display();
e2.display();
e3.display();

System .out. println (" SaleManager Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Incentive:"+e1.incentive +"Target : "+e1.target);
} //main end here
} // test end here

