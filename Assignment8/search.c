#include<stdio.h>
void main(){
	int arr[5];
	int n,i;
	int found=0;
	
	printf("enter the element :");
	for( i=0;i<5;i++){
	scanf("%d",&arr[i]);
}
		for( i=0;i<5;i++){
				printf("%d",arr[i]);
	}

printf("\n enter the element to search :");
scanf("%d",&n);

for( i=0;i<5;i++){
	if(arr[i]==n){
		found=1;
		break;
	}
}
if(found){
printf("number is found %d",i);
}
else
{
	printf("number is not found");
}

}