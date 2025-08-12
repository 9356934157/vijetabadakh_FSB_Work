
#include<stdio.h>
int evenOdd();
void main(){
	int res=evenOdd();
	if(res==1){
		printf("even");
	}else{
		printf("odd");
	}
}
int evenOdd(){
	int n=4;
//	if(n%2==0)
//	return 1;
//	else
//	return 0;
return n%2==0;
}