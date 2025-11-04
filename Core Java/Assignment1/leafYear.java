class leafYear{
public static void main(String arg[]){		

	int year =2004;
	if(year %4 ==0 && year %100!= 10 || year %400 ==0){
		System.out.printf("year is leaf..");
	}else{
		System.out.printf("year is not leaf..");
	}
}
}