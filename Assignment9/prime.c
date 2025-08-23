#include<stdio.h>
void prime(int*,int);
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++){
		printf("[%d]\n",arr[i]);
	}
	prime(arr,5);
	
}
	void prime(int* ptr,int n){
	
	printf("prime number in array :");
	for(int i=0; i<5;i++){
		int n1=ptr[i];
		int isprime=1;
		
		if(n1<=1){
			isprime=0;
		}else{
			for(int j=2;j*j<=n1;j++){
				if(n1%j==0){
					isprime=0;
					break;
				}
			}
		}
		if(isprime){
			printf("%d",n1);
		}
	}
}