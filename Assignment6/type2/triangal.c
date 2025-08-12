#include<stdio.h>
int triangle();
void main(){
	
	int res=triangle();
	if(res==1)
	printf("Triangal is equilateral");
	else if(res==2)
	printf("Triangal is isosceles");
	else
	printf("Triangale is Scalene");	
	
}

int triangle(){
	int a=54;
	int b=10;
	int c=16;
	if(a==b && b==c)
	return 1;
	else if(a==b || a==c || b==c)
	return 2;
	else
	return 3;
				
}