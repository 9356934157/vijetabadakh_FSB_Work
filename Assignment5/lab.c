#include<stdio.h>
//void main(){
//	int no=153,r1,sum=0;
//	int temp=no;
//	while(temp!=0){
//		r1=temp%10;
//		sum= sum+r1*r1*r1;
//		temp=temp/10;
//	}if(no==sum){
//		printf("amstrong");
//	}else{
//		printf("not amstrong");
//	}
//}
void main(){
	int num=153,r1,sum=0,temp;
	temp=num;
	int count=0;
	while(temp!=0){
		count++;
		temp=temp/10;	
	}
	temp=num;
	while(temp!=0){
		r1=temp%10;
		int p=1;
		for(int i=1;i<=count;i++){
			p=p*r1;	
		}
			sum=sum+p;
			temp=temp/10;
	}
	if(sum==num){
			printf(" is amstrong");
		}else{
			printf("is not amstrong");
		}
}