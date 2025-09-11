#include<stdio.h>
void main(){
double base, exp;
    printf("\nEnter base and exponent: ");
    scanf("%lf %lf", &base, &exp);
    printf("%.0lf ^ %.0lf = %.0lf\n", base, exp, pow(base, exp));

    return 0;
}