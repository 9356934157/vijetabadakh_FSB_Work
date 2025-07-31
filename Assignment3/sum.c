#include<stdio.h>
void main(){
	int n;
	int r1;
	int sum=0;
	printf("enter the number :");
	scanf("\n%d",&n);
	while(n>0){
		r1= n%10;
		sum=sum+r1;
		n=n/10;	
	}
	printf("sum is :%d",sum);
}