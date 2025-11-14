package assingent0;

 class Shape {
String color;
double area;

Shape(){
	this.color="red";
}
Shape(String str){
	this.color=str;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
void display() {
	System.out.println("Color is : "+this.color);
}
 double calArea() {
	 return area;
	
 }
}
 class Circle extends Shape{
	 double radius;
	 Circle() {
		 super();
		 this.radius=12;
	
	 }
	 Circle(String str,double r) {
		 super(str);
		 this.radius=r;
	
	 }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	void display() {
		super.display();
		System.out.println("radius is : "+this.radius);
	}  
	double calArea() {
		return 3.14*radius;
		
	}
 }
 class Rectangle extends Shape{
	 int lenght;
	 int width;
	 
	 Rectangle(){
		 super();
		 this.lenght=12;
		 this.width=2;
	 }
	 Rectangle(String str,int len,int wid){
		 super(str);
		 this.lenght=len;
		 this.width=wid;
	 }
	 void display() {
			super.display();
			System.out.println("lenght is : "+this.lenght);
			System.out.println("Width is :"+ this.width);
		} 
	 double calArea() {
			return  lenght*width;
			
		}
 }
class test2{
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Shape s1= new Shape ();
//		Shape s2= new Shape ("fhh");
//		s1.display();
//		s2.display();
//		
//		Circle c1= new Circle();
//		Circle c2= new Circle("tret",45);
//		s1.display();
//		s2.display();
//		
//		Rectangle r1= new Rectangle();
//		Rectangle r2= new Rectangle("wqe",23,45);
//		r1.display();
//		r2.display();
		 Shape s1;
	s1= new Shape ();
	System.out.println(s1.calArea());
	
	s1= new Circle();
	System.out.println(s1.calArea());
	
	s1= new Rectangle();
	System.out.println(s1.calArea());
	
	}

}
