#include<stdio.h>
void main(){
	int r1,sum=0;
	int no= 73485;
	while(no>0){
		r1= no%10;
		sum= sum+r1;
		no= no/10;
	}
	printf("%d",sum);
}