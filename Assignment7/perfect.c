#include<stdio.h>
void perfect(int*);
void main(){
	int n;
	printf("enter the number :");
	scanf("%d",&n);
	perfect(&n);
}
void perfect(int*n){
	int temp=*n;
	int sum=0;
	for(int i=1;i<*n;i++){
		if(temp%i==0){
			sum=sum+i;
		}
	}
	if(sum==temp){
		printf("%d perfect number\n",temp);
	}else{
		printf("%d not perfect number",temp);
	}
}
