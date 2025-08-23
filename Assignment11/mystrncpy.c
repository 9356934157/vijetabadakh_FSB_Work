#include<stdio.h>
char* mystring(char*,char*,int);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char str2[10];
	
	char* ch=mystring(str2,str1,3);
	printf("\n %s",ch);
	
}
	
char* mystring(char* ptr1,char* ptr2,int n){
	int i=0;
	while(i<n){
	 ptr1[i]=ptr2[i];
	 i++;	
	}
	ptr1[i]='\0';
	return ptr1;	
}