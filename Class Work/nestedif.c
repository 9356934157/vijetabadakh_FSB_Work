#include<stdio.h>
void main(){
	int a=20, b=120,c=800;
	if(a>b){
		if(a>c){
			printf("a is greater");
		}else{
			printf("c is samller");
		}
	}
	if(b<c){
		if(b>c){
			printf("b is greater");
		}else{
			printf("b is samller");
		}         
	}
	if(a<c){
		if(c>b){
			printf("c is greater");
		}else{
			printf("c is samller");
		}
	}
}