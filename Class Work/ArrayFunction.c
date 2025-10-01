#include<stdio.h>
void storeArray(int*,int );
void displayArray(int*,int;
int searchInArray(int*,int, int )
void main(){
	int arr[10],brr[5],crr[7];
	
	printf("enter elements of arr ");
	storeArray(arr[0],10);
	
	printf("enter elements of brr ");
	storeArray(brr[0],5);
	
	printf("enter elements of crr ");
	storeArray(crr[0],7);
	
	// display
	printf("\n Elements in arr are :");
	displayArray(arr[0],10);
	
//		printf("\n Elements in brr are :");
//	displayArray(brr[0],5);
//	
//		printf("\n Elements in crr are :");
//	displayArray(crr[0],7);
	
	printf("enter the number you want to search");
	int no;
	scanf("%d",&no);
	int res=searchInArray(arr,10,no);
	if(res==-1)
	print("element not found");
	else
	printf("found at &d index ",res);
}
void storeArray(int* ptr,int size){
	for(int i=0;i<size;i++){
		scanf("%d",&ptr[i]);
	}	
}
void displayArray(int* ptr,int size){
	printf("[");
	for(int i=0;i<size;i++){
		printf("%d,",&ptr[i]);
		
		printf("\b]");
	}
	
}
int searchInArray(int* ptr,int size, int ele){
	for(int i=0;i<size;i++){
		if(ptr[i]==ele)
		return i;
	}
	return -1;
}