class Product{
int id;
String name;
double price;
int quantity;
void setId(int i){
this.id=i;
}
void setName(String str){
this. name=str;
}
void setPrice(double pri){
this.price=pri;
}
void setQuantity(int qan){
this.quantity=qan;
}
int getId(){
return this.id;
}
String getName(){
return this.name;
}
double getPrice(){
return this.price;
}
int getQuantity(){
return this.quantity;
}
void display(){
System.out.println("Id is :"+this.id);
System.out.println("Name is :"+this.name);
System.out.println("Price is :"+this.price);
System.out.println("Quantity is :"+this.quantity);

}


}//  Product end here
class Test{
public static void main(String [] args){
  Product e1;
e1= new  Product();
e1.setId(1);
e1.setName("vijeta");
e1.setPrice(2000);
e1.setQuantity(2);

e1.display();

//System .out. println ("Product id : "+ e1.id+ "Name : "+e1.name +"Price : "+e1.price +"Quantity :" +e1.quantity);
}//main end here
} // test end here


