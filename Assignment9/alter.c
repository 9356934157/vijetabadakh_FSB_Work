#include<stdio.h>
int* alternumber(int*);
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	alternumber(arr);
}
	
int* alternumber(int* ptr){

	printf("alternate element are :");
	for(int i=0;i<=7;i+=2){
		printf("[%d]\n",ptr[i]);
	}
}