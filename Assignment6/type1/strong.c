#include<stdio.h>
void strong();
void main(){
	strong();
}
void strong(){
	for(int j=1;j<=1000;j++){
	
	int n=j, rem;

	int temp=n;
	int sum=0;
	while(n>0){
		rem=n%10;
		int fact=1;
		
		for(int i=1;i<=rem;i++){
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;	
	}

	if(sum==temp){
		printf("%d is strong\n",temp);
	}
}
	
}
	