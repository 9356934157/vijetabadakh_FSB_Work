#include<stdio.h>
void revers(int*,int);
void main(){
int arr[10];
printf("enter the element :");
 for(int i=0;i<10;i++){
 scanf("%d",&arr[i]);
 
}
for(int i=0;i<10;i++){
	printf("\n %d",arr[i]);
}
     revers(arr,10);
}
void revers(int* ptr,int n){

printf("\n revers array :");
for(int i=9;i>=0;i--){
	printf("%d",ptr[i]);
}
}