#include<stdio.h>
void armstrong(int);
void main(){
	int n;
	printf("enter the number :");
	scanf("%d",&n);
	armstrong(n);
}
void armstrong(int n){

	int temp=n;
	int sum=0,r1;
	
	for(int i=1;i>0;i++){
		r1=n%10;
		sum=sum+(r1*r1*r1);
		n=n/10;
	}
	printf("%d sum \n",sum);
	if(sum==temp){
		printf("%d Number is amstrong..",temp);
	}else{
		printf("%d Number is not amstrong..",temp);
	}
}


