#include<stdio.h>
void evenodd();
void add();
void age();
void charcters();
void palindrom();
void salary();
void year();
int main(){
	evenodd();
	add();	
	age();
	charcters();
	palindrom();
	salary();
	year();
}//main end
evenodd(){
	int n=55;
	if(n%2==0){
		printf("Number is even..\n");
		}else{
			printf("Number is odd..\n");
		}
}//evenodd end
add(){
	int n=2;
	int n1=3;
	int c=n+n1;
	printf("Addition is %d and %d :%d \n",n,n1,c);
}//add end
age(){
	int age =31;
	if(age>=18){
		printf("Person is eligble to vote..\n");
	}else{
		printf("Person is not eligble to vote.\n");
	}
}// age end
charcters(){
	int ch= 'a';
	if(ch=='a' || ch=='e' || ch=='i' || ch== 'o' || ch =='u'){
		printf("charcter are vowels..\n");
	}else{
		printf("charcter are consonant..\n");
	}
}//charcter end
palindrom(){
		int no =123;
    int r1,r2,r3,rev;
    r1= no%10;
	int q1= no/10;
	r2=q1%10;
	r3=q1/10;
	rev = r1*100+r2*10+r3;
	if(no == rev){
		printf(" Pallindrome..\n");
	}else{
		printf("Number is not Pallindrome..\n");
	}	
}//palindeom end
salary(){
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
		printf("Toatl =%lf\n",total);
}//salary end
year(){
		int year =2004;
	if(year %4 ==0 && year %100!= 10 || year %400 ==0){
		printf("year is leaf..");
	}else{
		printf("year is not leaf..");
	}
}