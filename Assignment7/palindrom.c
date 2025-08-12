#include<stdio.h>
void palindrom(int*);
void main(){
	int n;
	printf("enter the number :");
	scanf("/n%d",&n);
	palindrom(&n);
}
void palindrom(int *n1){
	
	int sum=0;
	int r1=*n1;
	while(*n1!=0){
		r1=*n1%10;
		sum=sum+r1;
		*n1=*n1/10;
	}
	printf("\n%d",sum);
	if(*n1==sum){
		printf("Number is palindrom..");
	}else{
		printf("Number is not palindrom..");
	}
}