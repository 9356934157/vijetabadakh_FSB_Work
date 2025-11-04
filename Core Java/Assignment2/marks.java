class mark{
public static void main(String arg []){	
	int marks=50;
	if(marks>75){
		System.out.printf("Distinction..");		
	}
	else if(marks>= 65 && marks< 75){
		System.out.printf("First Class");
	}
	else if(marks>=55 && marks <65){
		System.out.printf("Sencond class");
	}
	else if(marks >=40 && marks<=55){
		System.out.printf("pass class");
	}
	else {
		System.out.printf("fail..");
	}
}
}