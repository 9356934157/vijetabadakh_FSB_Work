#include <stdio.h>
#include <stdlib.h>

void prime(int* ptr, int n);

int main() {
    int n;

    printf("Enter number of elements: ");
    scanf("%d", &n);


    int *arr = (int*) malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }


    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    
    printf("You entered:\n");
    for (int i = 0; i < n; i++) {
        printf("[%d]\n", arr[i]);
    }

    
    prime(arr, n);


    free(arr);

    return 0;
}

void prime(int* ptr, int n) {
    printf("\nPrime numbers in array: ");
    for (int i = 0; i < n; i++) {
        int num = ptr[i];
        int isprime = 1;

        if (num <= 1) {
            isprime = 0;
        } else {
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isprime = 0;
                    break;
                }
            }
        }

        if (isprime) {
            printf("%d ", num);
        }
    }
    printf("\n");
}
