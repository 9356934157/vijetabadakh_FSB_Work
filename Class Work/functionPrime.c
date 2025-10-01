#include<stdio.h>
int prime();
void main(){
	int res=prime();
	if(res==1){
		printf("prime");
	}else{
		printf("is not prime");
	}
}
int prime(){
int n=17;
int isprime=1;
for(int i=2;i<=n/2;i++){
		if(n%i==0){
			isprime=0;
		}
	}
	if(isprime){
		return 1;
	}else{
		return 0;
	}
}
	