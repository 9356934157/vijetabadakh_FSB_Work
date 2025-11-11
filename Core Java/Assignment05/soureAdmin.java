class Admin{
int id;
String name;
double salary;
int allowance;

Admin(){
System.out.println("Constructor called..");
this.id=1;
this.name="xyz";
this.salary=2000000;
this.allowance=28;
}

Admin(int i,String n,double sal,int all){
System.out.println(" Prametric Constructor called..");
this.id=i;
this.name=n;
this.salary=sal;
this.allowance=all;
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
void setAllowance(int all){
this.allowance=all;
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
Admin [] arr= new Admin [3];
arr[0]= new Admin ();
arr[1]=new Admin (1,"KIRT",2342,2342);
arr[2]=new Admin ();

for(int i=0;i<arr.length;i++){
arr[i].display();
}


 Admin e1,e2 ,e3;
e1= new Admin();
e2= new Admin();
e3=new Admin(2,"vaishnvi",30000,20000);
e1.setId(1);
e1.setName("vijeta");
e1.setSalary(2000);
e1.setAllowance(1000);

e1.display();
e2.display();
e3.display();
//System .out. println ("Admin Id : "+ e1.id+ " Name :"+e1.name +"Salary :"+e1.salary + "Allowance :"+e1.allowance);
} //main end here
} // test end here

