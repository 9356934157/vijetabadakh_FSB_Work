#include<stdio.h>
typedef struct Book{
	int id;;
	char bname[20];
	char author[20];
	double price ;
	
}book;
void displyBook(book b);
void main(){
	book b;
	
	for(int i=0;i<5;i++){
		printf("enter the id ,bname, author,price : ");
		scanf("%d",&b.id);
		scanf("%s",&b.bname);
		scanf("%s",&b.author);
		scanf("%lf",&b.price);
	}
	displyBook(b);
}
void displyBook(book b){
	for(int i=0;i<5;i++){
		printf("\n id :%s",b);
		printf("\n book name :%s",b.bname);
		printf("\n author :%s",b.author);
		printf("\n Price :%lf",b.price);
	}
}