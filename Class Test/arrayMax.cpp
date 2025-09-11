#include<stdio.h>
int main(){
	int arr[5];

	printf("enter the element :");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	
	int max=arr[0];
	for(int i=1 ;i<5;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	printf(" \max number : %d \n",max);
	
	int max2 = max;
	for(int i=1 ;i<5;i++){
		if(arr[i]<max2){
			max2=arr[i];
}
}
printf(" \max number : %d \n",max2);
}