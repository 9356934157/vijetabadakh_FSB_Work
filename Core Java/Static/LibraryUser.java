class LibraryUser{
String name;
int daysLate;
static double finePerDay= 2.0;

LibraryUser(){
this.name="kirti";
this.daysLate=22;
}

LibraryUser(String n,int d){
this.name=n;
this.daysLate=d;
}

void setName(String nm){
this.name=nm;
}

void setaDaysLate(int day){
this.daysLate= day;
}

static void setChangeFinePerDay(double newRate){
finePerDay = newRate;

}
double calculateFine(){
return daysLate * finePerDay;
}

String getName(){
return this.name;
}

int getDysLate(){
return this.daysLate;
}

double getFinerPerDay(){
return this.finePerDay;
}

void display(){
System.out.println("Name :"+this.name);
System.out.println("DaysLate :"+this.daysLate);
System.out.println("Fine :"+this.calculateFine());

}
}
class Test{
public static void main(String[] args){

LibraryUser l1= new LibraryUser("VIJETA",3);
LibraryUser l2= new LibraryUser();

LibraryUser.setChangeFinePerDay(3.0);

l1.display();
l2.display();

l1.calculateFine();
l2.calculateFine();

}
}



