#include<stdio.h>
void main(){
	int r1,num,k;
	printf("perfect num from 1 to %d are :\n",num);
	scanf("%d",&num);
	for(int k=1;k<=num;k++){
		int num=k;

	int sum=0;
	for(int i=1;i<k;i++){
		if(num%i==0){
			sum=sum+i;
		}
	}
	if(sum==num){
		printf("%d perfect number\n",k);
	}
}
	
}