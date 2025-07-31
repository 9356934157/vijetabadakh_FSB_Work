#include<stdio.h>
void main(){
	int n=13;
	int flag=0;
	for(int i=2;i<=n/2;i++){
		if(n%i==0){
		flag=1;
		break;
	}
	}
	if(flag==0){
		printf("Prime");
	}else{
		printf("Is NOT Prime");
	}
}