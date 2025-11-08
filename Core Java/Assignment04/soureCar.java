import java.util.Scanner;

class Car{
String model;
String brand;
double price;
String colour;
int feulCapacity;

Car(){
System.out.println("Constructor called..");
this.model="abc";
this.brand="xyz";
this.price=2000000;
this.colour="red";
this.feulCapacity=2888;
}
Car(String str,String b,double p,String c,int i){
System.out.println("Constructor called..");
this.model=str;
this.brand=b;
this.price=p;
this.colour=c;
this.feulCapacity=i;
}

void setModel(String m){
this.model=m;
}
void setBrand(String str){
this.brand=str;
}
void setPrice(double pri){
this.price=pri;
}
void setColour(String col){
this.colour=col;
}
void setFeulCapacity(int fc){
this.feulCapacity=fc;
}
String getModel(){
return this.model;
}
String getBrand(){
return this.brand;
}

double getPrice(){
return this.price;
}
String getColour(){
return this.colour;
}
int getFeulCapacity(){
return this.feulCapacity;
}
void display(){
System.out.println("brand is :"+this.brand);
System.out.println("model is :"+this.model);
System.out.println("Price is :"+this.price);
System.out.println("Colour is :"+this.colour);
System.out.println("FeulCapacity is :"+this.feulCapacity);

}

}//  car end here

class Test{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the isbn: ");
int id= sc.nextInt();

sc.nextLine();

System.out.println("Enter the model: ");
String mod= sc.nextLine();

System.out.println("Enter the price: ");
double pri= sc.nextDouble();

System.out.println("Enter the brand: ");
String br= sc.nextLine();

System.out.println("Enter the colour: ");
String col= sc.nextLine();

System.out.println("Enter the feulCapacity: ");
int feul= sc.nextInt();


  Car e1,e2,e3;
//e1= new Car();
e2= new Car();
e3= new Car(mod,br,pri,col,feul);
//e1.setModel("eritiga");
//e1.setBrand("MarutiSuzuki");
//e1.setPrice(1500000);
//e1.setColour("white");
//e1.setFeulCapacity(10000);

//e1.display();
e2.display();
e3.display();

//System .out. println ("Model : "+e1.model+ "Brand : "+e1.brand + "Price : "+e1.price +" Colour:" +e1.colour +"FeulCapacity:"+e1.feulCapacity );
}//main end here
} // test end here


