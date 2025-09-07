#include<stdio.h>
#include<string.h>
struct time{
	int hour;
	int min;
	int sec;
};
void main(){
	struct time s1,s2;
	
	s1.hour=1;
	s1.min=2;
	s1.sec=30;
	
	printf("enter the detail for 2nd time..");
	scanf("%d",&s2.hour);
	scanf("%d",&s2.min);

	
	printf("\n hour : %d",s1.hour);
	printf("\n min :%d",s1.min);
	printf("\n sec : %d",s1.sec);
	
	printf("\n hour : %d",s2.hour);
	printf("\n  min :%d",s2.min);
	printf("\n sec : %d",s2.sec);
}