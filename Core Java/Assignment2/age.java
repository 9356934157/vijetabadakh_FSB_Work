class age{
 public static void main(String args[]){
	int age =62;
	if(age<12){
		System.out.printf("Chaild..");
	}
	else if(age>=12 || age>=19){
		System.out.printf("Teenager");
	}
	else if(age>=20 || age>= 59){
		System.out.printf("Adult..");
	}
	else if(age> 60){
		System.out.printf("Senior...");
	}
}
}