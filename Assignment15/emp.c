#include<stdio.h>
#include<string.h>
struct employee{
	
    int id;
	char name[20];
	double salary;
	
};
void display(struct employee emp);
struct employee store();
void main(){
	
	struct employee s1,s2,s3;
	printf("enter the detail for 1st employee..");
	s1=store();

	printf("enter the detail for 2nd employee..");
	s2=store();
	
	printf("enter the detail for 3rd employee..");
	s3=store();
	
	display(s1);
	display(s2);
	display(s3);
	
	
}
 void display(struct employee emp){

	printf("\n id : %d",emp.id);
	printf("\n Name :%s",emp.name);
	printf("\n salary : %lf",emp.salary);

}
struct employee store(){
	struct employee temp;
	scanf("%d",&temp.id);
	scanf("%s",&temp.name);
	scanf("%lf",&temp.salary);
	
	return temp;
}