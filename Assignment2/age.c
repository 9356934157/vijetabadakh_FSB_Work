#include<stdio.h>
void main(){
	int age =62;
	if(age<12){
		printf("Chaild..");
	}
	else if(age>=12 || age>=19){
		printf("Teenager");
	}
	else if(age>=20 || age>= 59){
		printf("Adult..");
	}
	else if(age> 60){
		printf("Senior...");
	}
}