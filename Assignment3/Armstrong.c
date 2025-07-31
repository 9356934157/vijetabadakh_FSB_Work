#include<stdio.h>
void main(){
	int n;
	int sum=0;
	int r1;
	printf("enter the number :");
	scanf("\n%d",&n);
	int n1=n;
	while(n!=0){
		r1=n%10;
		sum=sum+r1*r1*r1;
		n=n/10;
	}
	printf("sum is :%d",sum);
	if(sum==n1){
		printf("unmber is Armstrong..");
	}else{
		printf("number is not Armstrong..");
	}
}