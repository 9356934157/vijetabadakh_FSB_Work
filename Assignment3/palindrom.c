#include<stdio.h>
void main(){
	int n;
	int sum=0;
	int r1;
	printf("enter the number :");
	scanf("/n%d",&n);
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