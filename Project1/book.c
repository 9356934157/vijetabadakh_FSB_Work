#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct Book {
    int id;                  
    char name[100];          
    char authorName[100];       
    char category[50];       
    float price;            
    float rating;            
}book;

void addBook(book books[], int *count, int n);
void displayBooks(book books[], int count);
void searchBook(book books[], int count);
void updateBook(book books[], int count);
void removeBook(book books[], int *count);
void showBooksByAuthor(book*, int);
void addExtraBook(book**,int*,int*);
void showTop3Books(book*, int count);


int main() {
	int count = 0, choice,n;
    printf("Enter No of Elements: ");
	scanf("%d",&n);
	
	book* books = (book*)malloc(n * sizeof(book));
	if(books==NULL){
		printf("memory allocation failed \n");
		return 1;
	}


    do {
        printf("\n---- Book Management System ----\n");
        printf("1. Add Book\n");
        printf("2. Display All Books\n");
        printf("3. Search Book by ID\n");
        printf("4. Update Book\n");
        printf("5. Add new book\n");
        printf("6. Remove Book\n");
        printf("7. Show Books by Author\n");
        printf("8. Show Top 3 Books (Price & Rating)\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
         addBook(books,&count,n);
        }
        else if (choice == 2) {
            displayBooks(books, count);
        }
        else if (choice == 3) {
            searchBook(books, count);
        }
        else if (choice == 4) {
            updateBook(books, count);
        }
        else if (choice == 5) {
            addExtraBook(&books,&n,&count);
        }
        else if (choice == 6) {
            removeBook(books, &count);
        }
         else if (choice == 7) {
            showBooksByAuthor(books, count);
        }
         else if (choice == 8) {
            showTop3Books(books, count);
        }
        else if (choice == 9) {
            printf("Exiting...\n");
        }
        else {
            printf("Invalid choice!\n");
        }

    } while(choice != 9);

    return 0;
}
// Function to add a book
void addBook(book* books, int *count,int n) {
    if (*count >= n) {
        printf("Book list is full!\n");
        return;
    }
for (int i = *count; i < n; i++)
{
    printf("Enter Book ID: ");
    scanf("%d", &books[*count].id);
    getchar();

    printf("Enter Book Name: ");
    scanf("%s", books[*count].name);

    printf("Enter Author Name : ");
    scanf("%s", books[*count].authorName);

    printf("Enter Category : ");
    scanf("%s", books[*count].category);

    printf("Enter Price : ");
    scanf("%f", &books[*count].price);

    printf("Enter Rating: ");
    scanf("%f", &books[*count].rating);

    (*count)++;
}
    printf("Book added successfully!\n");
}

// Function to display all books
void displayBooks(book books[], int count) {
    if (count == 0) {
        printf("No books available!\n");
        return;
    }

    printf("\n--- Book Records ---\n");
    for (int i = 0; i < count; i++) {
        printf("\nBook %d:\n", i + 1);
        printf("ID: %d\n", books[i].id);
        printf("Name: %s\n", books[i].name);
        printf("Author: %s\n", books[i].authorName);
        printf("Category: %s\n", books[i].category);
        printf("Price: %.2f\n", books[i].price);
        printf("Rating: %.1f\n", books[i].rating);
    }
}

// Function to search a book by ID
void searchBook(book books[], int count) {
    if (count == 0) {
        printf("No books to search!\n");
        return;
    }

    int id;
    printf("Enter Book ID to search: ");
    scanf("%d", &id);

    for (int i = 0; i < count; i++) {
        if (books[i].id == id) {
            printf("\nBook found:\n");
            printf("ID: %d\n", books[i].id);
            printf("Name: %s\n", books[i].name);
            printf("Author: %s\n", books[i].authorName);
            printf("Category: %s\n", books[i].category);
            printf("Price: %.2f\n", books[i].price);
            printf("Rating: %.1f\n", books[i].rating);
            return;
        }
    }
    printf("Book with ID %d not found!\n", id);
}

// Function to update a book by ID
void updateBook(book books[], int count) {
    if (count == 0) {
        printf("No books to update!\n");
        return;
    }

    int id;
    printf("Enter Book ID to update: ");
    scanf("%d", &id);
    getchar();

    for (int i = 0; i < count; i++) {
        if (books[i].id == id) {
             printf("Enter new Book Name: ");
            scanf(" %s", books[i].name);
            
            printf("Enter new Author Name: ");
            scanf(" %s", books[i].authorName);

            printf("Enter new Category: ");
            scanf(" %s", books[i].category);
            
            printf("Enter new Price: ");
            scanf("%f", &books[i].price);

            printf("Enter new Rating: ");
            scanf("%f", &books[i].rating);

            printf("Book updated successfully!\n");
            return;
        }
    }
    printf("Book with ID %d not found!\n", id);
}
void addExtraBook(book** books,int*n,int* count){

  int n1;
    printf("\n how many book do you want add:");
    scanf("%d",&n1);
 	*books = (book*)realloc(*books, (*n + n1) * sizeof(book));


if (*books == NULL) {
        printf("Memory reallocation failed!\n");
        return ;
    }
for(int i=*n;i<*n+n1;i++)
    {
       book *b = &(*books)[i]; 

        printf("\nEnter the details of book %d:\n", i + 1);
        printf("enter id :");
        scanf("%d", &b->id);
        printf("enter name :");
        scanf("%s", b->name);
        printf("enter AuthorName :");
        scanf("%s", b->authorName);
        printf("enter category :");
        scanf("%s", b->category);
        printf("enter price :");
        scanf("%f", &b->price);
        printf("enter rating :");
        scanf("%f", &b->rating);
        (*count)++;
    }
    
   *n+=n1;
}

// Function to remove a book by ID
void removeBook(book books[], int *count) {
    if (*count == 0) {
        printf("No books to remove!\n");
        return;
    }

    int id;
    printf("Enter Book ID to remove: ");
    scanf("%d", &id);

    for (int i = 0; i < *count; i++) {
        if (books[i].id == id) {
            for (int j = i; j < *count - 1; j++) {
                books[j] = books[j + 1];
            }
            (*count)--;
            printf("Book removed successfully!\n");
            return;
        }
    }
    printf("Book with ID %d not found!\n", id);
}
// Show all books by a given author
void showBooksByAuthor(book books[], int count) {
    if (count == 0) {
        printf("No books available!\n");
        return;
    }

    char author[100];
    printf("Enter Author Name: ");
    scanf("%s", author);   

    int found = 0;
    printf("\nBooks by %s:\n", author);

    for (int i = 0; i < count; i++) {
        if (strcmp(books[i].authorName, author) == 0) {   
            printf("ID: %d | Name: %s | Category: %s | Price: %.2f | Rating: %.1f\n",
                   books[i].id, books[i].name, books[i].category,
                   books[i].price, books[i].rating);
            found = 1;
        }
    }

    if (!found) {
        printf("No books found by %s\n", author);
    }
}

//Show Top 3 Books (Price & Rating)
void showTop3Books(book *books, int count) {
    if (count == 0) {
        printf("No books available!\n");
        return;
    }

    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (books[j].rating > books[i].rating ||
               (books[j].rating == books[i].rating && books[j].price > books[i].price)) {
                
                book temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }
    }

    int n = (count < 3) ? count : 3;
    printf("\n--- Top %d Books (by Rating & Price) ---\n", n);
    for (int i = 0; i < n; i++) {
        printf("ID: %d | Name: %s | Author: %s | Price: %.2f | Rating: %.1f\n",
               books[i].id, books[i].name, books[i].authorName, books[i].price, books[i].rating);
    }
}


