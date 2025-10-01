#include<stdio.h>
char* mystrdup(char*);
void main(){
	
	char str[]="vijetabadakh";
	
	char* dup= strdup(str);
	
	printf("str= %s and address of str %u \n ",str ,str);
	printf("str= %s and address of str %u \n ",dup ,dup);
}
char* mystrdup(char* ptr){
	int len=strlen(ptr)+1;
	
	char* dup=(char*)malloc(sizeof(char)*len);
	for(int i=0;i<len;i++){
		dup[i]=ptr[i];
	}
	return dup;
}