#include<stdio.h>
#include<string.h>
struct Date{
	int date;
	int month;
	int year;
};
void main(){
	struct Date s1,s2;
	
	s1.date=1;
	s1.month=2;
	s1.year=2000;
	
	printf("enter the detail for 2nd date..");
	scanf("%d",&s2.date);
	scanf("%d",&s2.month);
	scanf("%d",&s2.year);
	
	printf("\n Date : %d",s1.date);
	printf("\n Month :%d",s1.month);
	printf("\n Year : %d",s1.year);
	
	printf("\n Date : %d",s2.date);
	printf("\n  Month :%d",s2.month);
	printf("\n Year : %d",s2.year);
}