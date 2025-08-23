#include<stdio.h>
char* removeodd(char*);
void main(){
	char str[10];
	printf("enter the string :");
	scanf("%s",str);
	
	char* ch= removeodd(str);
	printf("%s",ch);
}
char* removeodd(char* ptr){
	int i=0,j=0;
	while(ptr[i]!='\0'){
		if(i%2==0){
			ptr[j++]=ptr[i];
		}
		i++;
	}
	ptr[j]='\0';
	return ptr;
}