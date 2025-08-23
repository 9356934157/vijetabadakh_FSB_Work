#include<stdio.h>
int mystring(char*,char*);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char str2[10];
	printf("enter the string :");
	scanf("%s",str2);
	
	int n=mystring(str1,str2);
	printf("\n %d",n);
	
	
}
int mystring(char* ptr1,char* ptr2){
	int i=0;
	while(ptr1[i] !='\0' && ptr2[i] !='\0'){
		if(ptr1[i]!=ptr2[i]){
			if(ptr1[i]>ptr2[i])
			return 1;
			else
			return -1;
		}
		i++;
	}
	return 0;
}