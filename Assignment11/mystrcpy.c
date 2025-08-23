#include<stdio.h>
char* mystring(char*,char*);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char str2[10];
	
	char* ch=mystring(str2,str1);
	printf("\n %s",ch);
	
}
	
char* mystring(char* ptr1,char* ptr2){
	int i=0;
	while(ptr2[i]!='\0'){
	 ptr1[i]=ptr2[i];
	 i++;	
	}
	ptr1[i]='\0';
	return ptr1;	
}