#include<stdio.h>
#include<string.h>
struct admin{
	
	int id;
	char name[20];
	double salary;
	float allowance;
	
};
void display(struct admin ad);
struct admin store();
void main(){
	
	struct admin s1,s2,s3;
	printf("enter the detail for 1st admin..");
	s1=store();

	printf("enter the detail for 2nd admin..");
	s2=store();
	
	printf("enter the detail for 3rd admin..");
	s3=store();
	
	display(s1);
	display(s2);
	display(s3);
	
	
}
 void display(struct admin ad){

	printf("\n id : %d",ad.id);
	printf("\n Name :%s",ad.name);
	printf("\n salary : %lf",ad.salary);
	printf("\n allowance : %lf",ad.allowance);
}
struct admin store(){
	struct admin temp;
	scanf("%d",&temp.id);
	scanf("%s",&temp.name);
	scanf("%lf",&temp.salary);
	scanf("%f",&temp.allowance);
	
	return temp;
}