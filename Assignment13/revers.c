#include<stdio.h>
void revers(int*,int);
void main(){
int arr[10];
printf("enter the element :");
 for(int i=0;i<10;i++){
 scanf("%d",&arr[i]);
 
 int *arr = (int*) malloc(10 * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    free(arr);
 
}
for(int i=0;i<10;i++){
	printf("\n %d",arr[i]);
}
     revers(arr,10);
}
void revers(int* ptr,int n){

printf("\n revers array :");
for(int i=9;i>0;i--){
	printf("%d",ptr[i]);
}
}