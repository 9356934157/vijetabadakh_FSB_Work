#include<stdio.h>
void sumnumber(int*,int);
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++){
		printf("[%d]\n",arr[i]);
	}
	sumnumber(arr,10);
}
	void sumnumber(int* ptr,int n){
	
	int sum=0;	 
	for(int i=0 ;i<5;i++){	
	sum=sum+ptr[i];	
     }
     printf("sum is : %d",sum);
}
