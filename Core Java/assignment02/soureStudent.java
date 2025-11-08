class Student{
int rollNo;
String name;
int mark;

Student(){
this.rollNo=101;
this.name="nikita";
this.mark=234;
}
Student(int r,String n,int m){
this.rollNo=r;
this.name=n;
this.mark=m;
}

void setRollNo(int r){
this.rollNo=r;
}
void setName(String str){
this. name=str;
}
void setMark(int mark){
this.mark=mark;
}
int getRollNo(){
return this.rollNo;
}
String getName(){
return this.name;
}
int getMark(){
return this.mark;
}
void display(){
System.out.println("RollNo is :"+this.rollNo);
System.out.println("Name is :"+this.name);
System.out.println("Mark is :"+this.mark);


}

}// student end here
class Test{
public static void main(String [] args){
  Student e1,e2,e3;
e1= new  Student();
e2= new  Student();
e3= new  Student(1,"mnv",2532);
e1.setRollNo(1);
e1.setName("vijeta");
e1.setMark(50);


e1.display();
e2.display();

e3.display();

//System .out. println ("RollNo : "+ e1.rollNo+ " Name : "+ e1.name +"Mark :"+e1.mark);
} //main end here
} // test end here

