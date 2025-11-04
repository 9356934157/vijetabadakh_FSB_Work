class Car{
String model;
String brand;
double price;
String colour;
int feulCapacity;

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
  Car e1;
e1= new Car();
e1.setModel("eritiga");
e1.setBrand("MarutiSuzuki");
e1.setPrice(1500000);
e1.setColour("white");
e1.setFeulCapacity(10000);

e1.display();

//System .out. println ("Model : "+e1.model+ "Brand : "+e1.brand + "Price : "+e1.price +" Colour:" +e1.colour +"FeulCapacity:"+e1.feulCapacity );
}//main end here
} // test end here


