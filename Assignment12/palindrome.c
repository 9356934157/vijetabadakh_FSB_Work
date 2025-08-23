#include<stdio.h>
int palindrome(char*);
void main(){
	char str[10];
	printf("enter the string :");
	scanf("%s",str);
	 
	int x=palindrome(str);
	if(x==1){
		printf("palindrome");
	}else{
		printf("not palindrome");
	}
	
}
int palindrome(char* ptr){
	int i=0;
	int len=strlen(ptr)-1;
	
	while(ptr[i]!='\0'){
		if(ptr[i]!=ptr[len]){
			return 0;
		}
		i++;
		len--;
		
	}
	return 1;
}