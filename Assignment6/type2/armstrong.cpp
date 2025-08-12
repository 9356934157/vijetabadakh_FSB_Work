#include<stdio.h>
int armstrong();
int main(){
	
	if(armstrong()){
		printf("Number is amstrong..\n");
	}else{
		printf("Number is not amstrong..\n");
	}
	
}
int armstrong(){
	int n;
	printf("enter the number :");
	scanf("%d",&n);
	int temp=n;
	int sum=0,r1;
	
	for(int i=1;i>0;i++){
		r1=n%10;
		sum=sum+(r1*r1*r1);
		n=n/10;
	}	
	if(sum==temp)
	return 1;
	else
	return 0;

}

