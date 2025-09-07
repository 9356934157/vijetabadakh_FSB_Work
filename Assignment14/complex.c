#include<stdio.h>
#include<string.h>
struct  complex {
	int real;
	int imaginary;
	
};
void main(){
	struct complex s1,s2;
	
	s1.real=1;
	s1.imaginary=2;

	
	printf("enter the detail for 2nd distance..");
	scanf("%d",&s2.real);
	scanf("%d",&s2.imaginary);
	
	
	printf("\n real : %d",s1.real);
	printf("\n imaginary :%d",s1.imaginary);

	
	printf("\n real : %d",s2.real);
	printf("\n  imaginary :%d",s2.imaginary);

}