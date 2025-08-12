#include<stdio.h>
void evenOdd(int*);
void main(){
	int num;
	printf("enter the number");
	scanf("%d",&num);
	evenOdd(&num);
}
void evenOdd(int *n){
	if(*n%2==0){
		printf("number is even");
	}else{
		printf("number is odd");
	}
}