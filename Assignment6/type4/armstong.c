#include<stdio.h>
int isArmstrong(int);
void main(){
	int n;
	
	printf("enter the number :");
	scanf("\n%d",&n);
	if(isArmstrong(n)){
		printf("unmber is Armstrong..");	
	}else{
		printf("number is not Armstrong..");
	}
}

int isArmstrong(int n){
	
	int sum=0;
	int r1;
	int n1=n;
	while(n!=0){
		r1=n%10;
		sum=sum+r1*r1*r1;
		n=n/10;
	}
	if(sum==n1){
		return 1;
	}else{
		return 0;
	}
}