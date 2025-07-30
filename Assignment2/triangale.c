#include<stdio.h>
void main(){
	int a=12;
	int b=10;
	int c=6;
	if(a==b && b==c){
		printf("Triangal is equilateral");
	}
	else if(a==b || a==c || b==c){
		printf("Triangal is isosceles");
	}
	else{
		printf("Triangale is Scalene");
	}
}