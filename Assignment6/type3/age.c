#include<stdio.h>
void age1(int);

void main(){
	int age;

	printf("enter the number");
	scanf("%d",&age);
	age1(age);
}
void age1(int age){

	if(age>=18){
		printf("Person is eligble to vote..");
	}else{
		printf("Person is not eligble to vote.");
	}
}