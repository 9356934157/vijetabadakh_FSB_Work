class Book{
int isbn;
String name;
double price;
String category;
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
  Book e1;
e1= new Book();
e1.setISBN(1);
e1.setName("Yayati");
e1.setPrice(2000);
e1.setCategory("histroric");

e1.display();

//System .out. println ("Book ISBN : "+ e1.id+ "Name : "+e1.name +"Price : "+e1.price + "Category :" +e1.category);
}//main end here
} // test end here


