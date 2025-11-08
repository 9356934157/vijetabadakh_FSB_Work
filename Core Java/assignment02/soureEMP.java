class Employee{
int id;
String name;
double salary;

Employee(){
this.id=2;
this.name="krutika";
this.salary=2435;
}
Employee(int i,String n,double s)
{
this.id=i;
this.name=n;
this.salary=s;

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
int getId(){
return this.id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
void display(){
System.out.println("Id is :"+this.id);
System.out.println("Name is :"+this.name);
System.out.println("Salary is :"+this.salary);

}
}// employee end here
class Test{
public static void main(String [] args){


 Employee e1,e2,e3;
e1= new Employee();
e2= new Employee();
e3= new Employee(102,"wee",547576);
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);

e1.display();
e2.display();
e3.display();

//System .out. println ("Employee : "+ e1.id+ "/"+e1.name +"/"+e1.salary);
}
}


