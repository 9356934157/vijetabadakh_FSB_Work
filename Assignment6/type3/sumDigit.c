#include<stdio.h>
void sumDigit(int);
void main(){
	int n;
	printf("enter the number :");
	scanf("\n%d",&n);
	sumDigit(n);
}
void sumDigit(n){
	
	int r1;
	int sum=0;
	
	while(n>0){
		r1= n%10;
		sum=sum+r1;
		n=n/10;	
	}
	printf("sum is :%d",sum);
}