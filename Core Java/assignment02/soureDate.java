class Date{
 int day, month,year;

Date(){
System.out.println("constrctor is called..");
this.day=2;
this.month=5;
this.year=2005;
}

Date(int d,int m,int y){
System.out.println("parametric constrctor is called..");
this.day=d;
this.month=m;
this.year=y;

}
void setDay(int x){
this.day=x;
}
void setMonth(int m){
this.month=m;
}
void setYear(int y){
this.year=y;
}

int getDay(){
return this.day;
}
int getMonth(){
return this.month;
}
int getYear(){
return this.year;
}
void display(){
System.out.println("Day is :"+this.day);
System.out.println("Month is :"+this.month);
System.out.println("Year is :"+this.year);

}
}// date ends here

class Test{
 public static void main(String [] args){
 Date d1,d2,d3,d4;
d1= new Date();
d2= new Date();
d3= new Date();
d4= new Date(21,3,2034);

d1.setDay(31);
d1.setMonth(12);
d1.setYear(2002);
d2.setDay(30);
d2.setMonth(11);

d1.display();
d2.display();
d3.display();
d4.display();


if(d1.getDay()> d2.getDay()){
System .out. println ("d1 is younger");
}else{
System .out. println ("d2 is younger");
}
}// main end here
} // test end here