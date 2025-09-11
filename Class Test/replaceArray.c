#include<stdio.h>
int* exchange(int*,int,int);
void main(){
	int arr[7];
	int x,y;

	printf("enter the element :");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
	printf("user array :");
	for(int i=0;i<7;i++){
		printf("[%d] ",arr[i]);
	}
	printf("\n enter the xth position :");
	scanf("%d",&x);
	
	printf("\n enter the yth position :");
	scanf("%d",&y);
	
	exchange(arr,x,y);
}
int* exchange(int *ptr,int a,int b){
	int temp;
	for(int i=0;i<7;i++){
		for(int j=0;j<i;j++){
		if(ptr[i]==a && ptr[i]==b){
			temp=a;
			a=b;
			b=temp;
		}
	}
}
printf("after exchang array :");
for(int i=0;i<7;i++){
	printf("%d ",ptr[i]);
}
}