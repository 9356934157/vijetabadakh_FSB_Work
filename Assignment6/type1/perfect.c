#include<stdio.h>
void perfect();
void main(){
	perfect();
}
void perfect(){
	for(int j=1;j<=1000;j++){
		int temp=j;

	int sum=0;
	for(int i=1;i<j;i++){
		if(temp%i==0){
			sum=sum+i;
		}
	}
	if(sum==temp){
		printf("%d perfect number\n",temp);
	}
}
}