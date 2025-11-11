class HR{
int id;
String name;
double salary;
double commission;

HR(){
System.out.println("constrctor called...");
this.id=101;
this.name="nikita";
this.salary=23400;
this.commission=1000;
}
HR(int i,String n,double sal,double com){
System.out.println("parameter constrctor called...");
this.id=i;
this.name=n;
this.salary=sal;
this.commission=com;
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

HR [] arr= new HR[3];
arr[0]= new HR();
arr[1]=new HR(1,"KIRTI",23432,234);
arr[2]=new HR();

for(int i=0;i<arr.length;i++){
arr[i].display();
}


 HR e1,e2,e3;
e1= new HR();
e2= new HR();
e3= new HR(22,"kirti",32435,3000);

e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setCommission(1000);

e1.display();
e2.display();
e3.display();

//System .out. println ("HR Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Commission :"+e1.commission);
} //main end here
} // test end here

