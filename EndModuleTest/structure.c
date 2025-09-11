#include <stdio.h>
#include <string.h>

typedef struct Task {
    int taskId;
    char desc[50];
    int status;
} Task;

void add(Task tasks[], int n);
void update(Task tasks[], int n);
void display(Task tasks[], int n);

int main() {
    int n, choice;
    printf("Enter the number of tasks: ");
    scanf("%d", &n);

    Task tasks[n]; 

    do {
        printf("\n1. Add the details\n");
        printf("2. Update the details\n");
        printf("3. Display the details\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            add(tasks, n);
        } else if (choice == 2) {
            update(tasks, n);
        } else if (choice == 3) {
            display(tasks, n);
        } else if (choice == 4) {
            printf("Exiting...\n");
        } else {
            printf("Invalid choice\n");
        }
    } while (choice != 4);

    return 0;
}

void add(Task tasks[], int n) {
    for (int i = 0; i < n; i++) {
        printf("\nEnter Task Id, Description, Status: ");
        scanf("%d %s %d", &tasks[i].taskId, tasks[i].desc, &tasks[i].status);
    }
}

void update(Task tasks[], int n) {
    int id;
    printf("Enter the Task Id to update: ");
    scanf("%d", &id);

    for (int i = 0; i < n; i++) {
        if (tasks[i].taskId == id) {
            printf("Enter new Task Id, Description, Status: ");
            scanf("%d %s %d", &tasks[i].taskId, tasks[i].desc, &tasks[i].status);
            printf("Task updated successfully.\n");
            return;
        }
    }
    printf("Task with Id %d not found.\n", id);
}

void display(Task tasks[], int n) {
    printf("Task Details \n");
    for (int i = 0; i < n; i++) {
        printf("\nTask Id      : %d", tasks[i].taskId);
        printf("\nDescription  : %s", tasks[i].desc);
        printf("\nStatus       : %d\n", tasks[i].status);
    }
}
