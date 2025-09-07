#include<stdio.h>
int* maxNumber(int*,int );
int* minNumber(int*,int);
void main(){
	int arr[5];
	int n;

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
}
int *arr1 = (int*) malloc(n * sizeof(int));
    if (arr1 == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }

	maxNumber(arr,5);
	minNumber(arr,5);
}
int* maxNumber(int* ptr,int n){
	
	int max=ptr[0];
	for(int i=1 ;i<5;i++){
		if(ptr[i]>max){
			max=ptr[i];
		}
	}
	printf(" \max number : %d \n",max);
}
int* minNumber(int* ptr,int n){
	
	int min=ptr[0];
	for(int i=1 ;i<5;i++){
		if(ptr[i]<min){
			min=ptr[i];
		}
	}
	printf(" \min number : %d \n",min);
}
	