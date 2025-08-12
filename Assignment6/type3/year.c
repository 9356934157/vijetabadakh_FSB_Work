#include<stdio.h>
void year(int);
void main(){
	
	int year1;
	printf("enter the number :");
	scanf("%d",&year1);
	year(year1);
}
void year(int year1)	{

	if(year1 %4 ==0 && year1 %100!= 10 || year1 %400 ==0){
		printf("year is leaf..");
	}else{
		printf("year is not leaf..");
	}
}