#include<stdio.h>
void palindrom(int);
void main(){
	int n;
	printf("enter the number :");
	scanf("/n%d",&n);
	palindrom(n);
}
void palindrom(int n){
	
	int sum=0;
	int r1=n;
	while(n!=0){
		r1=n%10;
		sum=sum+r1;
		n=n/10;
	}
	printf("\n%d",sum);
	if(n==sum){
		printf("Number is palindrom..");
	}else{
		printf("Number is not palindrom..");
	}
}