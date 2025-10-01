#include<stdio.h>
typedef struct student{
	int rollNo;
	char name[20];
	int mark;	
}std;
void main(){
	std s[5];
	
	for(int i=0;i<5;i++){
		printf("enter the rollNo name mark ");
		scanf("%d",&s[i].rollNo);
		scanf("%s",&s[i].name);
		scanf("%d",&s[i].mark);
	}
	for(int i=0;i<5;i++){
		printf("\nRollNo :%d",s[i].rollNo);
		printf("\nName :%s",s[i].name);
		printf("\n Mark :%d",s[i].mark);
	}
	printf("enter rollNo of student you want to search :");
	int rollNo;
	scanf("%d",&rollNo);
	int index=-1;
	for(int i=0;i<5;i++){
		if(s[i].rollNo==rollNo){
			index=i;
			break;
		}
	}
	if(index!=-1){
		printf("%s student is found at %d index",s[index].name,index);
	}else{
		printf("student is not found");
	}
}