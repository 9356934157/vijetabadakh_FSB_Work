#include<stdio.h>
int factorial();
void main(){
	int res=factorial();
		printf("factorial is :%d",res);
	
}
int factorial(){
	int i=1;
	int fact=1;
	int n;
	printf("enter the number: ");
	scanf("\n %d",&n);
	while(i<=n){
		fact=fact*i;
		i++;
	}
	return fact;
	
}