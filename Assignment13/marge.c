#include<stdio.h>
void merge(int*,int*,int*,int);
void main(){
 int arr[5];
 int brr[5];
 int crr[10];
 int n;

 printf("enter the element :");
 for(int i=0;i<5;i++){
 scanf("%d",&arr[i]);
}
 int *arr1 = (int*) malloc(n * sizeof(int));
    if (arr1 == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }

 printf("enter the element :");
  for(int i=0;i<5;i++){
 scanf("%d",&brr[i]);
}
merge(arr,brr,crr,5);
}


void merge(int* ptr1,int* ptr2,int* ptr3,int n){
int i,j;
for( i=0;i<5;i++){
	ptr3[i]=ptr1[i];
}
for( j=0;j<5;j++){
	ptr3[i++]=ptr2[j];
}

printf("\n merged array is :");
for(i=0;i<10;i++){
	printf("%d",ptr3[i]);
}

}