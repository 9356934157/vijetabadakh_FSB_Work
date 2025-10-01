#include<stdio.h>
#include<string.h>
struct student{
	int rollno;
	char name[20];
	int mark;
};
void main(){
	struct student s1,s2;
	
	s1.rollno=101;
	strcpy(s1.name,"vijeta");
	s1.mark=50;
	
	printf("enter the detail for 2nd student..");
	scanf("%d",&s2.rollno);
	scanf("%s",s2.name);
	scanf("%d",&s2.mark);
	
	printf("\n Roll No. : %d",s1.rollno);
	printf("\n Name :%s",s1.name);
	printf("\n Mark : %d",s1.mark);
	
	printf("\n Roll No. : %d",s2.rollno);
	printf("\n Name :%s",s2.name);
	printf("\n Mark : %d",s2.mark);
}