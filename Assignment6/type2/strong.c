#include<stdio.h>
int strong();
void main(){
	if(strong()){
		printf("strong\n");
	}else{
		printf(" not strong\n");
	}
}
int strong(){
	int n;
	printf("enter the number: ");
	scanf("\n %d",&n);
	int rem;
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

	if(sum==temp)
		return 1;
		else
		return 0;	
}
	