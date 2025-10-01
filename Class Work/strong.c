#include<stdio.h>
void main(){
	int num= 1,r1, sum=0;
	int temp =num;
	while(temp!=0){
		int fact=1;
		r1=temp%10;
		for(int i=1;i<=r1;i++){
			fact=fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(sum==num){
		printf("Strong");
	}else{
		printf("Not strong");
	}
}