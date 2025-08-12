#include<stdio.h>
int palindrom();
void main(){
	
	if(palindrom()){
		printf(" Pallindrome..\n");
	}else{
		printf("Number is not Pallindrome..\n");
	}	
}
palindrom(){
	
	int no =121;
    int r1,r2,r3,rev;
    r1= no%10;
	int q1= no/10;
	r2=q1%10;
	r3=q1/10;
	rev = r1*100+r2*10+r3;
	
	if(rev==no){
	return 1;
	}else{
	return 0;
}
}