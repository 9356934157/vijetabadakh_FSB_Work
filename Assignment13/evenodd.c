#include <stdio.h>
#include <stdlib.h> 

void evenodd(int* ptr, int n);

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

    
    evenodd(arr, n);


    free(arr);

    return 0;
}

void evenodd(int* ptr, int n) {
    int evenCount = 0, oddCount = 0;

    printf("\nEven numbers:");
    for (int i = 0; i < n; i++) {
        if (ptr[i] % 2 == 0) {
            printf(" %d", ptr[i]);
            evenCount++;
        }
    }
    printf("\nCount of even numbers: %d", evenCount);

    printf("\nOdd numbers:");
    for (int i = 0; i < n; i++) {
        if (ptr[i] % 2 != 0) {
            printf(" %d", ptr[i]);
            oddCount++;
        }
    }
    printf("\nCount of odd numbers: %d\n", oddCount);
}
