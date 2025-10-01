#include<stdio.h>
void main(){
	int sum=0,num=12;
	for(int i=1;i<num;i++){
		if(num%i==0){
			sum=sum+i;
		}
	}
	if(sum==num){
		printf("perfect number");
	}else{
		printf("not perfect");
	}
}