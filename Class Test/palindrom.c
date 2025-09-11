#include<stdio.h>
int* palindrom(int*,int);
void main(){
	int arr[5];
	printf("enter the element :");
	for(int i=0;i<5;i++){
	scanf("%d",&arr[i]);
}
	for(int i=0;i<5;i++){
		printf("%d",arr[i]);
}

	int* x=palindrom(arr,5);
	if(x==0){
		printf("IS paliandrom ");
	}
	else{
		printf("Is NOT palindrom ");
	}
}
int* palindrom(int* ptr,int n){
	int flag=1;
	for(int i=0;i<n/2;i++){
		if(ptr[i]!=ptr[4-i]){
			flag=0;		
		}
	}
	return 1;
}