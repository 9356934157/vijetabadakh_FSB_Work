#include<stdio.h>
#include<string.h>
struct admin{
	
	int id;
	char name[20];
	double salary;
	float allowance;
	
};
void main(){
	
	struct admin s1,s2,s3;
	
	s1.id=101;
	strcpy(s1.name,"vijeta");
	s1.salary=5000;
	s1.allowance=2000.00;
	
	printf("enter the detail for 2nd admin..");
	scanf("%d",&s2.id);
	scanf("%s",s2.name);
	scanf("%lf",&s2.salary);
	scanf("%f",&s2.allowance);
	
	printf("enter the detail for 2nd admin..");
	scanf("%d",&s3.id);
	scanf("%s",s3.name);
	scanf("%lf",&s3.salary);
	scanf("%f",&s3.allowance);
	
	
	printf("\n id : %d",s1.id);
	printf("\n Name :%s",s1.name);
	printf("\n salary : %lf",s1.salary);
	printf("\n allowance : %lf",s1.salary);
	
	printf("\n id : %d",s2.id);
	printf("\n Name :%s",s2.name);
	printf("\n salary : %lf",s2.salary);
	printf("\n allowance : %lf",s2.salary);
	
	
	printf("\n id : %d \n Name :%s \n salary : %lf ,\n allowance :",s3.id,s3.name,s3.salary,s3.allowance);
}