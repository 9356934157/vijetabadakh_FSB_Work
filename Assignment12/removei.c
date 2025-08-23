#include<stdio.h>
char* removei(char*,int );
void main(){
	char str1[10];
	printf("enter the string :");
	scanf("%s",str1);
	
	int n;
	printf("enter the index :");
	scanf("%d",&n);
	
	char* ch= removei(str1,n);
	printf("%s",ch);
}
char* removei(char* ptr,int n){
	int i=n;
	while(ptr[i]!='\0'){
		ptr[i]=ptr[i+1];
		i++;
	}
	return ptr;
}