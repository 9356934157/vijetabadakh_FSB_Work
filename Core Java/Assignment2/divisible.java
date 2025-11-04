class divisible{
public static void main(String arg[]){	
int x=15;
	if(x%5==0 && x%3==0){
		System.out.printf("Divisible by 3 and 5");
	}
	else if(x%5==0){
		System.out.printf("divisible by 5 but not 3");
		}
		else if(x%3==0){
		System.out.printf("divisible by 3 but not 5");
		}
		else{
		System.out.printf("not divisible by 3 and 5");
		}
	
}
}