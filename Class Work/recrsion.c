#include<stdio.h>
int printNum(int);
void main(){
	int n=1;
	printNum(n);	
}
int printNum(int n){
	if(n==11){
		return 1;
	}
	printf("%d",n);
	printNum(n+1);
}