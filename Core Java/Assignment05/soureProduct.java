class Product{
int id;
String name;
double price;
int quantity;

Product(){
System.out.println("Constructor called..");
this.id=122;
this.name="xyz";
this.price=2000000;
this.quantity=234;
}

Product(int i,String n,double p,int q){
System.out.println("Prameter Constructor called..");
this.id=i;
this.name=n;
this.price=p;
this.quantity=q;
}

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
Product [] arr= new Product[3];
arr[0]= new Product();
arr[1]=new Product(1,"KIRTI",23432,234);
arr[2]=new Product();

for(int i=0;i<arr.length;i++){
arr[i].display();
}
  Product e1,e2,e3;
e1= new  Product();
e2= new  Product();
e3= new  Product(101,"shubham",20000,123);

e1.setId(1);
e1.setName("vijeta");
e1.setPrice(2000);
e1.setQuantity(2);

e1.display();
e2.display();
e3.display();

//System .out. println ("Product id : "+ e1.id+ "Name : "+e1.name +"Price : "+e1.price +"Quantity :" +e1.quantity);
}//main end here
} // test end here


