#include<stdio.h>
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
//	------------------Max number ------------------------------------
	
	int max=arr[0];
	for(int i=1 ;i<5;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	printf(" \max number : %d \n",max);
	
//	-------------------Min number  -------------------------------------
	
	int min=arr[0];
	for(int i=1 ;i<10;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
	printf(" \min number : %d \n",min);
}
	