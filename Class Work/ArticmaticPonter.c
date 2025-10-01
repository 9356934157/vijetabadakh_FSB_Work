#include<stdio.h>
void main(){
	int a=10;
	int*ptr=&a;
	
	printf("\n a ki value =%d",a); //10
		printf("\n ptr ki value =%u",ptr);  // address
			printf("\n ptr ka addres =%u",&ptr); //
				printf("\n a ka addres =%u",&a);
					printf("\n ptr ki value =%d",*ptr);
						printf("\n a ki value =%d",*(ptr+0));
}