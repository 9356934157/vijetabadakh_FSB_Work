#include<stdio.h>
void alternet();
void main(){
	int start, end, sum=0;
	printf("enter the range :");
	scanf("%d",&end);
	
	for(int i=1;i<=end;i=i+2){
		sum=sum+i;	
	}
		printf("%d",sum);
}