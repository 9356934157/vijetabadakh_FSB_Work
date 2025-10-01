#include<stdio.h>
void fun1(int,int ,int ,char,double,float);
void fun2(int,char,char,char,double,int,float);
void fun3(int,int,char,float);


void main(){
	int a=10,b=20,c;
	char ch='x';
	double y=10.2;
	float f=3.2;
	fun1(a,b,c,ch,y,f);
	fun2(a+b,'c','y','y+2',10,15+3.2);
	fun3(5*2+4,a*3,'f',20.8);
}
void fun1(int a,int b,int c,char ch,double y,float f){
	printf("%d%d%d",a,b,c);
	printf("%c",ch);
	printf("%lf",y);
	printf("%f",f);
}
void fun2(int a,char b,char c,double d,int e,float f){
	
}
void fun2(int a,int b,char c,float d){
	
}

