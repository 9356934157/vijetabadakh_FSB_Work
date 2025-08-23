#include<stdio.h>
int charsearch(char*,char);
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	char ch;
	printf("enter the charcter :");
	scanf(" %c",&ch);
	
	int x=charsearch(str1,ch);
	if(x==-1){
		printf("charcter is not found..");
	}else{
		printf("\n charcter is found at %d index",x);
	}
}
	
int charsearch(char* ptr, char ch1){
		int i=0;
		while(ptr[i]!='\0'){
			if(ptr[i]==ch1)
			return i;
			i++;
		}
		return -1;
	}
	
	