#include<stdio.h>
void main(){
	int n=15;
	int i=2;
	int flag=0;
	while(i<=n/2){
		if(n%i==0){
			flag=1;
			break;
		}
		i++;	
	}
	if(flag==0){
			printf("Prime");
		}else{
			printf("is not prime");
		}
}