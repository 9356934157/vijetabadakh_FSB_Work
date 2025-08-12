#include<stdio.h>
void prime(int*);
void main(){
	int num;
	printf("enter the number :");
	scanf("%d",&num);
	prime(&num);
}
void prime(int *n){

   int j=2;
	
	for(int i=2;i<=*n;i++){
		int isprime=1;
		if(i<=1){
			isprime=0;
		}
		else{
			while(j<=i/2){
			if(i%j==0)	{
				isprime=0;
				break;
			}
			j++;
			}
		}
		if(isprime){
			printf("\n%d",i);
		}
	}
}
	