#include<stdio.h>
void main(){
	int a=10;
	int b=20;
	char ch ='%';
	if(ch=='+'){
	     printf("Addition is : %d\n",a+b);
	}
	else if(ch=='-'){
     printf("subtraction is :%d\n", a-b);	
	}
	else if(ch=='/'){
		printf("Division is :%d\n", a/b);
	}
	else if(ch=='*'){
		printf("Multiplction is :%d\n ",a*b);
	}
	else if(ch=='%'){
		printf("Modulo is :%d\n",a%b);
	}
	else{
		printf("invaild..");
	}
}