class Date{
 int day, month,year;

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
 Date d1,d2;
d1= new Date();
d2= new Date();

d1.setDay(31);
d1.setMonth(12);
d1.setYear(2002);
d2.setDay(30);
d2.setMonth(11);

d1.display();
d2.display();


if(d1.getDay()> d2.getDay()){
System .out. println ("d1 is younger");
}else{
System .out. println ("d2 is younger");
}
}// main end here
} // test end here