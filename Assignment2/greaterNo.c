#include<stdio.h>
void main(){
	int a=27, b=120, c=20;
	if(a>b && a>c){
		printf("Number a is greater...");
	}
	else if(b>c && b>a){
		printf("b is greater...");
	}
	else{
		printf("c is greater..");
	}
}