#include<stdio.h>
#include<string.h>
struct SalesManger{
	
	int id;
	char name[20];
	double salary;
	float incentive;
	float target;
	
};
void main(){
	
	struct SalesManger s1,s2,s3;
	
	s1.id=101;
	strcpy(s1.name,"vijeta");
	s1.salary=5000;
	s1.incentive=2000.00;
	s1.target=234.00;
	
	printf("enter the detail for 2nd SalesManger..");
	scanf("%d",&s2.id);
	scanf("%s",s2.name);
	scanf("%lf",&s2.salary);
	scanf("%f",&s2.incentive);
	scanf("%f",&s2.target);
	
	printf("enter the detail for 2nd SalesManger..");
	scanf("%d",&s3.id);
	scanf("%s",s3.name);
	scanf("%lf",&s3.salary);
	scanf("%f",&s3.incentive);
	scanf("%f",&s3.target);
	
	
	printf("\n id : %d",s1.id);
	printf("\n Name :%s",s1.name);
	printf("\n salary : %lf",s1.salary);
	printf("\n incentive : %lf",s1.incentive);
	printf("\n target : %lf",s1.target);
	
	printf("\n id : %d",s2.id);
	printf("\n Name :%s",s2.name);
	printf("\n salary : %lf",s2.salary);
	printf("\n incentive : %lf",s2.incentive);
	printf("\n target : %lf",s2.target);
	
	
	printf("\n id : %d \n Name :%s \n salary : %lf ,\n incentive : \n target :",s3.id,s3.name,s3.salary,s3.incentive,s3.target);
}