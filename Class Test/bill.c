#include<stdio.h>
void main(){
	int unit,bill;
	printf("enter the unit :");
	scanf("%d",&unit);
	
	if(unit<=1 || unit<=50){
		bill=30*unit;
		printf("The unit cost will be :%d rs/unit",bill);
	}else if(unit<=51 || unit<=150){
			bill=40*unit;
			printf("The unit cost will be :%d rs/unit",bill);
	}else if(unit>=151){
		bill=50*unit;
		printf("The unit cost will be :%d rs/unit",bill);	
	}else{
		printf("invalid input");
	}
}
