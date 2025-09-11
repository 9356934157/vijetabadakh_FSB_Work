#include<stdio.h>
int caluclate();
void main(){

int price;
int discount;

printf("enter the price :");
scanf("%d",&price);

printf("enter the discount :");
scanf("%d",&discount);

caluclate(price,discount);

}
int caluclate(int price ,int discount){
	int sp;
	sp=price-discount;
	printf("the selling price is :%d",sp);
}