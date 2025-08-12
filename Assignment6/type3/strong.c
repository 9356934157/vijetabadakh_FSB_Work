#include<stdio.h>
void strong(int);
void main(){
	int n;
	printf("enter the number :");
	scanf("%d",&n);
	strong(n);
}
void strong(int n1){
	
	for(int j=1;j<=n1;j++){
	
	int n=j, rem;

	int temp=n1;
	int sum=0;
	while(n1>0){
		rem=n%10;
		int fact=1;
		
		for(int i=1;i<=rem;i++){
			fact=fact*i;
		}
		sum=sum+fact;
		n1=n1/10;	
	}

	if(sum==temp){
		printf("%d is strong\n",temp);
	}
}
	
}
	