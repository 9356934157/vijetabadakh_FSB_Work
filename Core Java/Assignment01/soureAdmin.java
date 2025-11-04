class Admin{
int id;
String name;
double salary;
int allowance;

void setId(int i){
this.id=i;
}
void setName(String str){
this. name=str;
}
void setSalary(double sal){
this. salary=sal;
}
void setAllowance(int all){
this. salary=all;
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
double getAllowance(){
return this.allowance;
}

void display(){
System.out.println("Id is :"+this.id);
System.out.println("Name is :"+this.name);
System.out.println("salary is :"+this.salary);
System.out.println("Allowance is :"+this.allowance);

}

}// admin end here
class Test{
public static void main(String [] args){
 Admin e1;
e1= new Admin();
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setAllowance(1000);

e1.display();
//System .out. println ("Admin Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Allowance :"+e1.allowance);
} //main end here
} // test end here

