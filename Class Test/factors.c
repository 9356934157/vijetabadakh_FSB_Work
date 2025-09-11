#include<stdio.h>
void main(){
	int start, end;
	printf("enter the starting number :");
	scanf("%d",&start);
	
	printf("enter the end number :");
	scanf("%d",&end);
	
	for(int i=start ;i<=end; i++){
		printf("%d =",i);
		for(int j=1;j<=i ;j++){
		
		if(i%j==0)
		printf("%d",i);
		if(j !=i)
		printf(",");
	}
}
printf("\n");
}