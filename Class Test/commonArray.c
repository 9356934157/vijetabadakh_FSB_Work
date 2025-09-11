#include<stdio.h>
void main(){
	int arr[5];
	int brr[5];
	printf("enter the element in arr :");
	for(int i=0;i<5;i++){
	scanf("%d",&arr[i]);
}
	printf("enter the element in brr :");
	for(int i=0;i<5;i++){
	scanf("%d",&brr[i]);
}
printf("common element are :");
for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
		if(arr[i]==brr[j]){
			printf("%d",arr[i]);
		}
	}
	
}
}