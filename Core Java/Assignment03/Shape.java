class Shape{

void area(float base, float height){
float area =(0.5f) * (base) * (height);
System.out.println("Area of Tringal :"+ area);

}
void Area(int lenght, int breadth){
int area =(lenght) * (breadth);
System.out.println("Area of Rectangle :"+ area);

}

void area(int radius ){
float area =(3.15f) * (radius);
System.out.println("Area of Circal :"+ area);

}
}
class Test{
public static void main(String [] args){

Shape s1= new Shape();

s1.area(5.2f,5.2f);
s1.area(5,6);
s1.area(5);

}
}

