class HR{
int id;
String name;
double salary;
double commission;

void setId(int i){
this.id=i;
}
void setName(String str){
this. name=str;
}
void setSalary(double sal){
this. salary=sal;
}
void setCommission(double com){
this. commission=com;
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
double getCommission(){
return this.commission;
}

void display(){
System.out.println("Id is :"+this.id);
System.out.println("Name is :"+this.name);
System.out.println("salary is :"+this.salary);
System.out.println("Commission is :"+this.commission);

}

}// hr end here
class Test{
public static void main(String [] args){
 HR e1;
e1= new HR();
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setCommission(1000);

e1.display();
//System .out. println ("HR Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Commission :"+e1.commission);
} //main end here
} // test end here

