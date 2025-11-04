class palindrom{
public static void main(String arg[]){		
int no =123;
    int r1,r2,r3,rev;
//	int fd = no%10;
//	int n1 = no/10;
//	int ld = n1%10;
//	if(fd==ld){
//		System.out.printf("pl");
//	}else{
//		System.out.printf("not pl");
//	}
	r1= no%10;
	int q1= no/10;
	r2=q1%10;
	r3=q1/10;
	rev = r1*100+r2*10+r3;
	if(no == rev){
		System.out.printf(" Pallindrome..");
	}else{
		System.out.printf("Number is not Pallindrome..");
	}
}
}