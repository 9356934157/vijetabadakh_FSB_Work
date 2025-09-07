#include<stdio.h>
#include<string.h>
struct product{
	int id;
	char name[20];
	int quantity;
	float price;
	
};
void main(){
	struct product s1,s2;
	
	s1.id=101;
	strcpy(s1.name,"vijeta");
	s1.quantity=5000;
	s1.price=132.54;
	
	printf("enter the detail for product");
	scanf("%d",&s2.id);
	scanf("%s",s2.name);
	scanf("%lf",&s2.price);
	scanf("%d",&s2.quantity);
	
	printf("\n id : %d",s1.id);
	printf("\n Name :%s",s1.name);
	printf("\n price : %lf",s1.price);
	printf("\n  quantity : %d",s1.quantity);
	
	
	
	printf("\n id : %d \n Name :%s \n price : %lf  \n quantity : %d",s1.id,s2.name,s2.price,s2.quantity);
}