#include<stdio.h>
void sumDigit(int*);
void main(){
	int n;
	printf("enter the number :");
	scanf("\n%d",&n);
	sumDigit(&n);
}
void sumDigit(int*n1){
	
	int r1;
	int sum=0;
	
	while(*n1>0){
		r1= *n1%10;
		sum=sum+r1;
		*n1=*n1/10;	
	}
	printf("sum is :%d",sum);
}