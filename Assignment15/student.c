#include<stdio.h>
#include<string.h>
struct student{
	
	int rollno;
	char name[20];
	int mark;
	
};
void display(struct student ad);
struct student store();
void main(){
	
	struct student s1,s2,s3;
	printf("enter the detail for 1st student..");
	s1=store();

	printf("enter the detail for 2nd student..");
	s2=store();
	
	printf("enter the detail for 3rd student..");
	s3=store();
	
	display(s1);
	display(s2);
	display(s3);
	
	
}
 void display(struct student ss){

	printf("\n Roll No. : %d",ss.rollno);
	printf("\n Name :%s",ss.name);
	printf("\n Mark : %d",ss.mark);
	
}
struct student store(){
	struct student temp;
	scanf("%d",&temp.rollno);
	scanf("%s",&temp.name);
	scanf("%d",&temp.mark);
	return temp;
}