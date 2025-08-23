#include<stdio.h>
void sorting(int*,int);
void main(){
int arr[5];
printf("enter the element :");
 for(int i=0;i<5;i++){
 scanf("%d",&arr[i]);
 
}
printf("\n before sorting :");
for(int i=0;i<5;i++){
	printf("\n %d",arr[i]);
}
sorting(arr,5);
}
void sorting(int* ptr,int n){

int temp;
for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
		if(ptr[j]>ptr[j+1]){
			temp=ptr[i];
			ptr[i]=ptr[j];
			ptr[j]=temp;
		}
	}
}
printf("\n after sorting");
for(int i=0;i<5;i++){
	printf("\n %d",ptr[i]);
}
}
