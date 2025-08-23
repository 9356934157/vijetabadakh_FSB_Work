#include<stdio.h>
void main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<7;i++){
		printf("[%d]\n",arr[i]);
	}
	printf("print the even array");
		int count=0;
	for(int i=0;i<7;i++){
		if(arr[i]%2==0){
			printf("\n %d",arr[i]);
			count++;
		}
	}
	printf("\n count of even number :%d",count);
	
	printf("\n print the odd array");
	for(int i=0;i<7;i++){
		if(arr[i]%2!=0){
			printf("\n %d",arr[i]);
		}
	}
}
	