#include<stdio.h>
void even();
void odd();
void main(){
	even();
	odd();

}
void even(){

	int start, end;
	printf("enter the range :");
	scanf("%d",&end);
	printf("\n even :");
	
	for(int i=10;i<=end;i++){
		
		if(i%2==0){
			printf("%d\n",i);
		}
	}
}
void odd(){

	int start, end;
	printf("enter the range :");
	scanf("%d",&end);
	printf("\n odd :");
	
	for(int i=10;i<=end;i++){
		
		if(i%2==0){
			printf("%d\n",i);
		}
	}
}