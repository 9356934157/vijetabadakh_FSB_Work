#include<stdio.h>
void main(){
	int r1,num,k;
	printf("enter the number :");
	scanf("%d",&num);
	
	for(int k=1;k<=num;k++){ 
	int temp=k,sum=0;
	while(temp!=0){
		r1=temp%10;
		int fact =1;
		for(int i=1;i<=r1;i++){
			 fact=fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}

	if(sum==k){
		printf("Strong %d",k);
	}
}
}