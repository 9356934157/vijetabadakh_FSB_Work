#include<stdio.h>
int main(){

int a=10,b=20;
int *ptr=&a;
int *p=&b;
int c=*p;
p=ptr;
*ptr=101;
int *x=p;
*x=*ptr;
printf("%d %d %d %d %d %d %d %d",a,b,c,p,ptr,*x,*ptr,*p);

}