#include<stdio.h>
char* mystring(char*);
void main(){
	char str[10];
	printf("enter the string :");
	scanf("%s",str);
	
	char* ch=mystring(str);
	printf("\n %s",ch);
	
	
}
char* mystring(char *ptr){
	int i=0;
	int len=strlen(ptr);
	int j=len-1;
	char temp;
	while(i<j){
		temp=ptr[i];
		ptr[i]=ptr[j];
		ptr[j]=temp;
		i++;
		j--;
	}
	return ptr;
}
	