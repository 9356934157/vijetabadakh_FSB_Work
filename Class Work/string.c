#include<stdio.h>
char* mystring(char*,char*);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char str2[10];
	printf("enter the string :");
	scanf("%s",str2);
	
	char* ch=mystring(str1,str2);
	printf("\n %s",ch);
	
}
char* mystring(char* ptr1,char* ptr2){
	int i=0;
	int j=0;
	while(ptr1[i]!='\0'){
		i++;	
	}
		while(ptr2[j]!='\0'){
		ptr1[i]=ptr2[j];
		i++;
		j++;		
	}
	ptr1[i]='\0';
	return ptr1;
}