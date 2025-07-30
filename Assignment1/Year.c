#include<stdio.h>
void main(){
	int year =2004;
	if(year %4 ==0 && year %100!= 10 || year %400 ==0){
		printf("year is leaf..");
	}else{
		printf("year is not leaf..");
	}
}