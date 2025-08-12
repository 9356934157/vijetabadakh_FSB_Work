#include<stdio.h>
void factorial(int);
void main(){
	int n;
	printf("enter the number: ");
	scanf("\n %d",&n);
	factorial(n);
}
void factorial(int n){
	int i=1;
	int fact=1;
	
	while(i<=n){
		fact=fact*i;
		i++;
	}
	printf("factorial is :%d\n",fact);
}