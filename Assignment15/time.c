#include<stdio.h>
#include<string.h>
typedef struct time{
	int hour;
	int min;
	int sec;
}Time;
void display(Time t);
Time addtime(Time t1, Time t2);
void main(){
	Time t1,t2,sum;
	
	printf("Enter the first time (hour min sec): ");
    scanf("%d %d %d", &t1.hour, &t1.min, &t1.sec);

    printf("Enter the second time (hour min sec): ");
    scanf("%d %d %d", &t2.hour, &t2.min, &t2.sec);
    
    sum = addtime(t1, t2);

    printf("\nFirst Time: ");
    display(t1);

    printf("\nSecond Time: ");
    display(t2);

    printf("\nSum of Times: ");
    display(sum);

}
void display(Time t) {
	
    printf("\nHour : %d", t.hour);
    printf("\nMin  : %d", t.min);
    printf("\nSec  : %d\n", t.sec);
}

Time addtime(Time t1,Time t2){
	
	Time result;
    int totalSec1 = t1.hour * 3600 + t1.min * 60 + t1.sec;
    int totalSec2 = t2.hour * 3600 + t2.min * 60 + t2.sec;

    int sumSec = totalSec1 + totalSec2;

	result.hour = sumSec / 3600;
    sumSec =sumSec % 3600;
    result.min = sumSec / 60;
    result.sec = sumSec % 60;
    
	return result;
}