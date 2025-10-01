#include<stdio.h>
typedef struct student{
	int rollNo;
	char name[20];
	int mark;	
}Student;

void storeStudent(Student* ptr,int);
void displayStudent(Student* ptr,int);

void main(){
	Student july[5];
	Student aug[6];
	Student sep[10];
	
	storeStudent(july,5);
	storeStudent(aug,6);
	storeStudent(sep,10);
	
	displayStudent(july,5);
	displayStudent(aug,5);
	displayStudent(sep,5);
	
	

} //main ends

void storeStudent(Student* ptr,int size){
	for(int i=0;i<size;i++){
		printf("enter the rollNo name mark ");
		scanf("%d",&ptr[i].rollNo);
		scanf("%s",&ptr[i].name);
		scanf("%d",&ptr[i].mark);
	}
	
}// storeStudents ends
void displayStudent(Student* ptr,int size){
	for(int i=0;i<size;i+1){
		printf("\nRollNo :%d",ptr[i].rollNo);
		printf("\nName :%s",ptr[i].name);
		printf("\n Mark :%d",ptr[i].mark);
	}
}//displayStudent ends