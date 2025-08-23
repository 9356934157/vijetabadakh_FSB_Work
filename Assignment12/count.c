#include<stdio.h>
int count(char*);
void main(){
	char str[10];
	printf("enter the string :");
	scanf("%s",str);
	 
	int x=count(str);
	printf("%d",x);

}
int count(char* ptr){
	int i=0;
	int count =0;
	while(ptr[i]!='\0'){
		if(ptr[i]=='a'|| ptr[i]=='e'|| ptr[i]=='i'|| ptr[i]=='o'||ptr[i]=='u'){
			count++;
		}
		i++;
	}
	return count;	
}