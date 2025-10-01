#include <stdio.h>
typedef struct student{
	int rollNo;
	char name[20];
	int mark;	
}Student;
void displayStudent(Student* ptr,int);
void searchStudent(Student* ptr,int);
int main() {
    int choice;

    do {
        printf("\n--- MENU ---\n");
        printf("1. Display Student\n");
        printf("2. Search by Roll No.\n");
        printf("3. Update Student\n");
        printf("4. Delete student\n");
        printf("5. Sort student\n");
        printf("6. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            displayStudent(july,5);
			displayStudent(aug,5);
			displayStudent(sep,5);
           	 printf("Display student...\n");
        }
        else if (choice == 2) {
            displayStudent(5);
			displayStudent(5);
			displayStudent(5);
            printf("Search by roll no...\n");
        }
        else if (choice == 3) {
            // call your update function here
            printf("Update student...\n");
        }
        else if (choice == 4) {
            // call your delete function here
            printf("Delete employee...\n");
        }
        else if (choice == 5) {
            // call your sort function here
            printf("Sort student...\n");
        }
        else if (choice == 6) {
            printf("Exiting program...\n");
        }
        else {
            printf("Invalid choice! Try again.\n");
        }

    } while (choice != 6);

    return 0;
}
void displayStudent(Student* ptr,int size){
	for(int i=0;i<size;i+1){
		printf("\nRollNo :%d",ptr[i].rollNo);
		printf("\nName :%s",ptr[i].name);
		printf("\n Mark :%d",ptr[i].mark);
	}
}
void searchStudent(Student* ptr,int size){
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
