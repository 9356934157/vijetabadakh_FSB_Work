#include<stdio.h>
int perfect();
void main(){
	if(perfect()){
		printf(" perfect number\n");
	}else{
		printf("not perfect number\n");
	}
}
int perfect(){
	int n;
	printf("enter the number: ");
	scanf("\n %d",&n);
	int j=n;
	int sum=0;
	for(int i=1;i<j;i++){
		if(j%i==0){
			sum=sum+i;
		}
	}
	if(sum==j)
	return 1;
	else
	return 0;

}