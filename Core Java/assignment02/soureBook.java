class Book{
int isbn;
String name;
double price;
String category;

Book(){
System.out.println("Constructor called..");
this.isbn=122;
this.name="xyz";
this.price=2000000;
this.category="erte";
}

Book(int i,String n,double p,String cat){
System.out.println("Prameter Constructor called..");
this.isbn=i;
this.name=n;
this.price=p;
this.category=cat;
}


void setISBN(int isbn){
this.isbn=isbn;
}
void setName(String str){
this. name=str;
}
void setPrice(double pri){
this.price=pri;
}
void setCategory(String cat){
this.category=cat;
}
int getISBN(){
return this.isbn;
}
String getName(){
return this.name;
}
double getPrice(){
return this.price;
}
String getCategory(){
return this.category;
}
void display(){
System.out.println("ISBN is :"+this.isbn);
System.out.println("Name is :"+this.name);
System.out.println("Price is :"+this.price);
System.out.println("Category is :"+this.category);

}



}// Book end here
class Test{
public static void main(String [] args){
  Book e1,e2,e3;
e1= new Book();
e2= new Book();
e3= new Book(123,"etrey",5465,"tyuy");

e1.setISBN(1);
e1.setName("Yayati");
e1.setPrice(2000);
e1.setCategory("histroric");

e1.display();
e2.display();
e3.display();

//System .out. println ("Book ISBN : "+ e1.id+ "Name : "+e1.name +"Price : "+e1.price + "Category :" +e1.category);
}//main end here
} // test end here


