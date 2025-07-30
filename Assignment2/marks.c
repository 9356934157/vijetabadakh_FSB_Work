#include<stdio.h>
void main(){
	int marks=50;
	if(marks>75){
		printf("Distinction..");		
	}
	else if(marks>= 65 && marks< 75){
		printf("First Class");
	}
	else if(marks>=55 && marks <65){
		printf("Sencond class");
	}
	else if(marks >=40 && marks<=55){
		printf("pass class");
	}
	else {
		printf("fail..");
	}
}