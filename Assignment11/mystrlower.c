#include<stdio.h>
char* mystring(char*);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char* ch=mystring(str1);
	printf("\n %s",ch);
	
	
}
char* mystring(char *ptr){
	int i=0;

	while(ptr[i]!='\0'){
		if(ptr[i]>= 'A' && ptr[i]<='Z'){
		ptr[i]=ptr[i]+32;
		
		}
		i++;
	}
	return ptr;
}
	