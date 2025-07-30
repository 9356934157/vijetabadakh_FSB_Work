#include<stdio.h>
void main(){
	double bs =12000;
	double da,ta, hra,total;
	if(bs<=5000){
		da=bs*0.10;
		ta= bs*0.20;
		hra= bs*0.25;
	}else{
		da=bs*0.15;
		ta= bs*0.25;
		hra= bs*0.30;
	}
	total =bs+da+ta+hra;
		printf("Toatl =%lf",total);
}