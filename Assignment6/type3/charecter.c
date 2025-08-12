#include<stdio.h>
void charecter1(char);
void main(){
	char ch;
	printf("enter the charecters :");
	scanf("%c",&ch);
	charecter1(ch);
}
void charecter1(char ch){
	
	if(ch >='A' && ch <= 'Z'){
		printf("Charecter is UpperCase..");
	}else{
		printf("Charecter is LowerCase..");
	}
}
