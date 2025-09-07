#include<stdio.h>
#include<string.h>
struct employee{
	int id;
	char name[20];
	double salary;
	
};
void main(){
	struct employee s1,s2,s3;
	
	s1.id=101;
	strcpy(s1.name,"vijeta");
	s1.salary=5000;
	
	printf("enter the detail for 2nd employee..");
	scanf("%d",&s2.id);
	scanf("%s",s2.name);
	scanf("%lf",&s2.salary);
	
	printf("enter the detail for 3nd employee..");
	scanf("%d",&s3.id);
	scanf("%s",s3.name);
	scanf("%lf",&s3.salary);
	
	printf("\n id : %d",s1.id);
	printf("\n Name :%s",s1.name);
	printf("\n salary : %lf",s1.salary);
	
	printf("\n id : %d",s2.id);
	printf("\n Name :%s",s2.name);
	printf("\n salary : %lf",s2.salary);
	
	printf("\n id : %d \n Name :%s \n salary : %lf ",s3.id,s3.name,s3.salary);
}