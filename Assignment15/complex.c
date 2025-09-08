#include<stdio.h>
#include<string.h>
struct  complex {
	int real;
	int imaginary;
	
};
void display(struct complex ad);
struct complex store();
void main(){
	
	struct complex s1,s2,s3;
	printf("enter the detail for 1st complex..");
	s1=store();

	printf("enter the detail for 2nd complex..");
	s2=store();
	
	printf("enter the detail for 3rd complex..");
	s3=store();
	
	display(s1);
	display(s2);
	display(s3);
	
	
}
 void display(struct complex cc){

    printf("\n real : %d",cc.real);
	printf("\n imaginary :%d",cc.imaginary);

}
struct complex store(){
	struct complex temp;
	
	scanf("%d",&temp.real);
	scanf("%d",&temp.imaginary);
	
	return temp;
}