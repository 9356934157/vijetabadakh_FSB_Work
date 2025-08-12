#include<stdio.h>
void factorial();
void main(){
	factorial();
}
void factorial(){
	int i=1;
	int fact=1;
	int n;
	printf("enter the number: ");
	scanf("\n %d",&n);
	while(i<=n){
		fact=fact*i;
		i++;
	}
	printf("factorial is :%d\n",fact);
}