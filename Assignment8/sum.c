#include<stdio.h>
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++){
		printf("[%d]\n",arr[i]);
	}
	int sum=0;	 
	for(int i=1 ;i<5;i++){	
	sum=sum+arr[i];	
     }
     printf("sum is : %d",sum);
}
	