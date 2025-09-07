#include<stdio.h>
void sumOfArray(int*,int*,int);
void main(){
	int arr[5];
	int ar[5];
	

	
	printf("enter the number for 1st array :");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("[%d]\n",arr[i]);
	}
	int *brr = (int*) malloc(5 * sizeof(int));
    if (brr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }

	printf("enter the number for 2st array :");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&ar[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("[%d]\n",ar[i]);
	}
	sumOfArray(arr,ar,5);
}
	// sum of arr[]+ar[]
void sumOfArray(int* drr,int* crr,int n){
	int a[10];
	for(int i=0;i<5;i++)
	{
		a[i]=drr[i]+crr[i];
		printf("sum %d \n:",a[i]);
	}
	
	// sum of 3rd array
	
	int sum=0;
	for(int i=1;i<5;i++){
		sum =sum+a[i];	
	}
	printf("sum is :%d",sum);
}