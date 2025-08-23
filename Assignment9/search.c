#include<stdio.h>
void search(int*,int);
void main(){
	int arr[5];
	int n;
		
	printf("enter the element :");
	for( int i=0;i<5;i++){
	scanf("%d",&arr[i]);
}
		for( int i=0;i<5;i++){
				printf("%d",arr[i]);
	}
	printf("\n enter the element to search :");
	scanf("%d",&n);

	search(arr,n);
}
void search(int* ptr,int n1){
		int found=0;
		int i;

for( int i=0;i<5;i++){
	if(ptr[i]==n1){
		found=1;
		break;
	}
}
if(found){
printf("number is found ");
}
else
{
	printf("number is not found");
}

}