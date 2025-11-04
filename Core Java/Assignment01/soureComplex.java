class Complex{
int real;
int imaginary;
void setReal(int real){
this.real=real;
}
void setImaginary(int img){
this.imaginary=img;
}
int getReal(){
return this.real;
}
int getImaginary(){
return this.imaginary;
}
void display(){
System.out.println(" Real value is : "+this.real);
System.out.println("Imaginary is : "+this.imaginary);

}

}// Complex end here
class Test{
public static void main(String [] args){
 Complex e1;
e1= new  Complex();
e1.setImaginary(34);
e1.setReal(3);

e1.display();

//System .out. println ("Real and imaginary:"+e1.real+"+"+e1.imaginary+"i");
}// main end here
} // test end here


