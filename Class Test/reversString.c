#include<stdio.h>
#include<string.h>
void reversString(char* ptr);
void main(){
	char str[20];
	printf("enter the string :");
	scanf("%s",str);
	reversString(str);
    printf("revers string is :%s",str);
	
}

void reversString(char* ptr){
	int len=strlen(ptr);
	for(int i=0;i<=len/2;i++){
		char temp = ptr[i];
        ptr[i] = ptr[len-1-i];
        ptr[len-1-i] = temp;

	}
}