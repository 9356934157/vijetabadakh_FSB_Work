#include<stdio.h>
void main(){
	int n;
	printf("enter the number :");
	scanf("%d",&n);
	
	if(n==0){
		printf("Number is neutal..");
	}else if(n>0){
		printf("Number is positive..");
	}else if(n<0){
		printf("number is negative..");
	}else{
		printf("invalid input..");
	}
}