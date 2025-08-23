#include<stdio.h>
char* exchaged(char*);
void main(){
	char str[10];
	printf("enter the string :");
	scanf("%s",str);
	 
	char* ch=exchaged(str);
	printf("%s",ch);

}
char* exchaged(char* ptr){
	int i=0;
	char temp;
	int len=strlen(ptr);
	
	if(len>1){
		temp=ptr[0];
		ptr[0]=ptr[len-1];
		ptr[len-1]=temp;
	}
	return ptr;
}