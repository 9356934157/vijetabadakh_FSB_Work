#include<stdio.h>
#include<string.h>
struct  distance {
	float feet;
	float inch;
	
};
void main(){
	struct distance s1,s2;
	
	s1.feet=1;
	s1.inch=2;

	
	printf("enter the detail for 2nd distance..");
	scanf("%f",&s2.feet);
	scanf("%f",&s2.inch);
	
	
	printf("\n feet : %f",s1.feet);
	printf("\n inch :%f",s1.inch);

	
	printf("\n feet : %f",s2.feet);
	printf("\n  inch :%f",s2.inch);

}