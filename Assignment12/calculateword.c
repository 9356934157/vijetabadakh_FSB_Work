#include<stdio.h>
int calculateword(char*);
void main(){
	char str[50];
	printf("enter the string :");
	//scanf("%s",str);
	fgets(str,sizeof(str),stdin);
	
	int n= calculateword(str);
	printf("%d",n);
}
int calculateword(char* ptr){
	int i=0, count =0;
	int flag=0;
	while(ptr[i]!='\0'){
		if(ptr[i]!=' '&& ptr[i]!='\n' && ptr[i]!='\t'){
			if(flag==0){
				count++;
				flag=1;
			}
		}
		else{
			flag=0;
		}
		i++;	
	}
	return count;	
}