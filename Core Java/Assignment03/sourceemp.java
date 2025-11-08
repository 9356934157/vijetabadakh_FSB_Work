
class Student{
int rollno;
String name;
float percentage;

Student(int r, String n, float p){
this.rollno=r;
this.name=n;
this.percentage=p;
}
}
class Employee{
int id;
String Name;
double salary;

Employee(int i ,String N, double sal){
this.id=i;
this.Name=N;
this.salary=sal;
}
}

class bank{

void Loan(Student s){
System.out.println("loan approve for student :"+s.name);
if(s.percentage>80)
System.out.println("loan approved : 200000");
else if(s.percentage>= 60 && s.percentage<=80)
System.out.println("loan approved : 100000");
else if(s.percentage>= 40 && s.percentage<=60)
System.out.println("loan approved : 50000");
else
System.out.println("loan not approved below 40%");

}
}

class bank{
void Loan(Employee e){
System.out.println("loan approve for employee :"+e.name);
if(e.salary>80)
System.out.println("loan approved : 200000");

else if(e.salary>= 60 && e.salary<=80)
System.out.println("loan approved : 100000");

else if(e.salary>= 40 && e.salary<=60)
System.out.println("loan approved : 50000");

else;
System.out.println("loan not approved below 4 LPA");

}
}

class Test{
public static void main(String [] args){

Student s1= new Student(101,"vijeta",85);
Student s2= new Student(102,"nikta",55);

Employee e1= new Employee(201,"krutika",13);
Employee e2= new Employee(202,"manjiri",5);

bank b= new bank();

b.Loan(s1);
b.Loan(s2);

b.Loan(e1);
b.Loan(e2);

}
}




