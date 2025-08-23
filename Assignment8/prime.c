#include<stdio.h>
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<7;i++){
		printf("[%d]\n",arr[i]);
	}
	printf("prime number in array :");
	for(int i=0; i<7;i++){
		int n1=arr[i];
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