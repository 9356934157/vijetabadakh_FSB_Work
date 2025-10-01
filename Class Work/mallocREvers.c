#include<stdio.h>
void storeArray(int*,int);
int* display(int* ,int);
int* reverseArray(int*,int);
void main(){
	int arr[10];
	storeArray(arr,10);
	display(arr,10);
	int* rev=reverseArray(arr,10);
}
void storeArray(int* ptr,int n){
	printf("enter the element :");
	for(int i=0;i<n;i++){
		scanf("%d",&ptr[i]);
	}
}
int* display(int* ptr,int n){
	printf("display the element :");
	for(int i=0;i<n;i++){
		printf("\n %d",ptr[i]);
	}
}

int* reverseArray(int* ptr,int n){
	printf("reverse the element :");
	int temp[n];
	for(int i=0;j<n-1;i>=0;i++;j--){
		printf("\n %d",ptr[i]);
}
}