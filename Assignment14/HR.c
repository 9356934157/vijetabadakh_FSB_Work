#include<stdio.h>
#include<string.h>
struct HR{
	
	int id;
	char name[20];
	double salary;
	float commission;
	
};
void main(){
	
	struct HR s1,s2,s3;
	
	s1.id=101;
	strcpy(s1.name,"vijeta");
	s1.salary=5000;
	s1.commission=2000.00;
	
	printf("enter the detail for 2nd hr..");
	scanf("%d",&s2.id);
	scanf("%s",s2.name);
	scanf("%lf",&s2.salary);
	scanf("%f",&s2.commission);
	
	printf("enter the detail for 2nd HR");
	scanf("%d",&s3.id);
	scanf("%s",s3.name);
	scanf("%lf",&s3.salary);
	scanf("%f",&s3.commission);
	
	
	printf("\n id : %d",s1.id);
	printf("\n Name :%s",s1.name);
	printf("\n salary : %lf",s1.salary);
	printf("\n commission : %lf",s1.commission);
	
	printf("\n id : %d",s2.id);
	printf("\n Name :%s",s2.name);
	printf("\n salary : %lf",s2.salary);
	printf("\n commission : %lf",s2.commission);
	
	
	printf("\n id : %d \n Name :%s \n salary : %lf ,\n commission :",s3.id,s3.name,s3.salary,s3.commission);
}