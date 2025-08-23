#include<stdio.h>
void main(){
int arr[10];
printf("enter the element :");
 for(int i=0;i<10;i++){
 scanf("%d",&arr[i]);
 
}
for(int i=0;i<10;i++){
	printf("\n %d",arr[i]);
}

printf("\n revers array :");
for(int i=9;i>=0;i--){
	printf("%d",arr[i]);
}
}