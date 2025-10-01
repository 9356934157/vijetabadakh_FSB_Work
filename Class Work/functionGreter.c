#include<stdio.h>
int greater();
void main(){
	int res=greater();
	if(res==1)
	printf("a");
	else if(res==2)
	printf("b");
	else
	printf("c");
}
int greater(){
	int a=10,b=13,c=15;
	if(a>b && a>c)
	return 1;
	else if(b>a && b>c)
	return 2;
	else
	return 3;
}