#include<stdio.h>
void main(){
	int arr[5];
	int a[5];
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
	
	
	printf("enter the number for 2st array :");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&ar[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("[%d]\n",ar[i]);
	}
	
	// sum of arr[]+ar[]
	
	for(int i=0;i<5;i++)
	{
		a[i]=arr[i]+ar[i];
		printf("sum %d \n:",a[i]);
	}
	
	// sum of 3rd array
	
	int sum=0;
	for(int i=1;i<5;i++){
		sum =sum+a[i];	
	}
	printf("sum is :%d",sum);
}