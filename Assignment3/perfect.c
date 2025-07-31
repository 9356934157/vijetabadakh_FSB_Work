#include<stdio.h>
void main(){
	int i=1;
	int sum=0;
	int n=28;
	while(i<n){
		if(n%i==0){	
		sum=sum+i;	
	}
	i++;
}
if(n==sum){
	printf("Number is perfect..%d",);
}else{
	printf("Number is not perfecr");
}
	
}