#include<stdio.h>
char* replacesSpace(char*);
void main(){
	char str[10];
	printf("enter the string :");
	//scanf("%s",str);
	fgets(str,sizeof(str),stdin);
	
	char* ch= replacesSpace(str);
	printf("%s",ch);
	
}
char* replacesSpace(char* ptr){
	int i=0;
	while(ptr[i]!='\0'){
		if(ptr[i]== ' '){
			ptr[i]='$';
		}
		i++;
	}
	return ptr;	
}