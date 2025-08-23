#include<stdio.h>
void main(){
 int arr[10];
 int brr[10];
 int crr[20];
 int i;
 printf("enter the element :");
 for(int i=0;i<10;i++){
 scanf("%d",&arr[i]);
}

 printf("enter the element :");
  for(int i=0;i<10;i++){
 scanf("%d",&brr[i]);
}

for( i=0;i<10;i++){
	crr[i]=arr[i];
}
for(int j=0;j<10;j++){
	crr[i++]=brr[j];
}

printf("\n merged array is :");
for(int i=0;i<20;i++){
	printf("%d",crr[i]);
}

}