#include<stdio.h>
char* strreplaces(char* ,char);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
		
	char ch='$';
	char* ch1=strreplaces(str1,ch);
	printf("%s",ch1);
}
char* strreplaces(char* ptr,char ch1){
	int i=0;
	while(ptr[i]!='\0'){
		if(ptr[i]=='a'){
			ptr[i]=ch1;
		}
		i++;
		
	}
	return ptr;
}