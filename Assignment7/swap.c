#include<stdio.h>
int swap(int* ,int*);
void main(){
	int a=10,b=20;
	printf("%d %d \n",a,b);
	swap(&a,&b);
}
int swap(int *x,int *y){
	
	int temp =*x;
	*x=*y;
	*y=temp;
	printf("The value of a and b: %d %d",*x,*y);
	
}