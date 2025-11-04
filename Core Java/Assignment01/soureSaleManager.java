class SaleManager{
int id;
String name;
double salary;
double incentive;
double target;

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

}// SaleManager end here
class Test{
public static void main(String [] args){
  SaleManager e1;
e1= new  SaleManager();
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setIncentive(1000);
e1.setTarget(500);
System .out. println (" SaleManager Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Incentive:"+e1.incentive +"Target : "+e1.target);
} //main end here
} // test end here

