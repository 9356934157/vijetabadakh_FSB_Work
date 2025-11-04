class Employee{
int id;
String name;
double salary;
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
 Employee e1;
e1= new Employee();
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);

e1.display();

//System .out. println ("Employee : "+ e1.id+ "/"+e1.name +"/"+e1.salary);
}
}


