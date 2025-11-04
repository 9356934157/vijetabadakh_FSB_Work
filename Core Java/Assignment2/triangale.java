class triangal{
 public static void main(String args[]){
	int a=12;
	int b=10;
	int c=6;
	if(a==b && b==c){
		System.out.printf("Triangal is equilateral");
	}
	else if(a==b || a==c || b==c){
		System.out.printf("Triangal is isosceles");
	}
	else{
		System.out.printf("Triangale is Scalene");
	}
}
}