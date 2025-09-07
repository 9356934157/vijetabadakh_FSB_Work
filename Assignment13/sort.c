#include<stdio.h>
void main(){
int arr[5];
printf("enter the element :");
 for(int i=0;i<5;i++){
 scanf("%d",&arr[i]);
 
}
 int *brr = (int*) malloc(5* sizeof(int));
    if (brr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
printf("\n before sorting :");
for(int i=0;i<5;i++){
	printf("\n %d",arr[i]);
}
int temp;
for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
		if(arr[j]>arr[j+1]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
printf("\n after sorting");
for(int i=0;i<5;i++){
	printf("\n %d",arr[i]);
}
}