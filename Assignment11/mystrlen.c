#include<stdio.h>
int mystring(char*);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	int i=mystring(str1);
	printf("\n %d",i);
	
}
int mystring(char* ptr1){
	int len=0;
	
	while(ptr1[len] != '\0'){
		len++;
	}
	return len;
}