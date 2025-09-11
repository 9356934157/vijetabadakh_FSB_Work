#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

int main() {
    char password[20] = "vijeta";
    int userid = 121;
    char userpassword[20];
    int newid;

    printf("Enter user password: ");
    scanf("%s", userpassword);

    printf("Enter user id : ");
    scanf("%d", &newid);

    if (strcmp(password, userpassword) == 0 && userid == newid) {
        srand(time(0));
        int randomNumber = rand() % 9000 + 1000;  
        int userInput;

        printf("Random number: %d\n", randomNumber);
        printf("Enter the number: ");
        scanf("%d", &userInput);

        if (userInput == randomNumber) {
            printf("Login successful..\n");
        } else {
            printf("Verification failed..\n");
        }

    } else {
        printf("Invalid user id and password\n");
    }

    return 0;
}
