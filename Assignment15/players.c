#include <stdio.h>
#include <string.h>

typedef struct Player {
    char name[50];
    int matches;
    int runs;
    int wickets;
} Player;

void displayPlayers(Player ptr[], int n);
void displayMax(Player ptr[], int n);

void main(){
	Player arr[5];
	 for(int i = 0; i < 5; i++) {
        printf("\nEnter details of Player %d\n", i + 1);
        printf("Name: ");
        scanf("%s", arr[i].name);  
        printf("Matches played: ");
        scanf("%d", &arr[i].matches);
        printf("Runs: ");
        scanf("%d", &arr[i].runs);
        printf("Wickets: ");
        scanf("%d", &arr[i].wickets);
    }
    
    printf("\n All Players Information");
    displayPlayers(arr,5);
    
    displayMax(arr, 5);
  	
}
void displayPlayers(Player ptr[], int n) {
    for(int i = 0; i < n; i++) {
        printf("\nPlayer %d:\n", i + 1);
        printf("Name: %s\n", ptr[i].name);
        printf("Matches : %d\n", ptr[i].matches);
        printf("Runs : %d\n", ptr[i].runs);
        printf("Wickets : %d\n", ptr[i].wickets);
    }
}
void displayMax(Player ptr[], int n) {
    int maxRunsIndex = 0, maxWicketsIndex = 0;

    for(int i = 1; i < n; i++) {
        if(ptr[i].runs > ptr[maxRunsIndex].runs) {
            maxRunsIndex = i;
        }
        if(ptr[i].wickets > ptr[maxWicketsIndex].wickets) {
            maxWicketsIndex = i;
        }
    }

    printf(" Player with Maximum Runs \n");
    printf("Name: %s, Runs: %d\n", ptr[maxRunsIndex].name, ptr[maxRunsIndex].runs);

    printf(" Player with Maximum Wickets \n");
    printf("Name: %s, Wickets: %d\n", ptr[maxWicketsIndex].name, ptr[maxWicketsIndex].wickets);
}