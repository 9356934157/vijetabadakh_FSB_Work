import java.util.Scanner;
class Complex{
int real;
int imaginary;

Complex(){
System.out.print("constrctor is called..");
this.real=23;
this.imaginary=546;
}

Complex(int r,int i){
System.out.println("parametric constrctor is called..");
this.real=r;
this.imaginary=i;
}

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
Scanner sc= new Scanner(System.in);

System.out.println("Enter the real: ");
int real= sc.nextInt();

sc.nextLine();

System.out.println("Enter the imagnari: ");
int img= sc.nextInt();





 Complex e1,e2,e3;
e1= new  Complex();
e2= new  Complex();
e3= new  Complex(real,img);
e1.setImaginary(34);
e1.setReal(3);

e1.display();
e2.display();
e3.display();

//System .out. println ("Real and imaginary:"+e1.real+"+"+e1.imaginary+"i");
}// main end here
} // test end here


