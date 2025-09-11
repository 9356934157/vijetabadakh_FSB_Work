#include<stdio.h>
void main(){
	int start,end;
	int sum=0;

	printf("enter the starting point :");
	scanf("%d",&start);
	
	printf("enter the ending point :");
	scanf("%d",&end);
	
	for(int i=start;i<=end;i++){
	
		int isprime=1;
		int j=2;
		if(i<=1){
			isprime=0;
		}
		else{
			while(j<=(i/2)){
			if(i%j==0)	{
				isprime=0;
				break;
           	}
           		j++;
		}
			}
			if(isprime){
			printf("\n%d",i);
			sum=sum+i;
		
		}
		}
		printf("sum=%d",sum);
		
}