#include<stdio.h>
void evenodd(int*,int);
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<7;i++){
		printf("[%d]\n",arr[i]);
	}
	evenodd(arr,7);
	
}

void evenodd(int* ptr,int n){

	printf("print the even array");
		int count=0;
	for(int i=0;i<7;i++){
		if(ptr[i]%2==0){
			printf("\n %d",ptr[i]);
			count++;
		}
	}
	printf("\n count of even number :%d",count);
	
	printf("\n print the odd array");
	
	for(int i=0;i<7;i++){
		if(ptr[i]%2!=0){
			printf("\n %d",ptr[i]);
			count++;
		}
	}
	printf("\n count of odd number :%d",count);
}
