#include<stdio.h>
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	printf("alternate element are :");
	for(int i=0;i<=7;i+=2){
		printf("[%d]\n",arr[i]);
	}
}