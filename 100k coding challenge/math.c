
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int num1,num2,choice,res;
	setbuf(stdout,NULL);

	printf("enter ur two number");
	scanf("%d %d",&num1,&num2);
	printf("1;add \n2;sub\n3;multi\n4;div\n enter ur choice \n ");
	scanf("%d",&choice);
	setbuf(stdout,NULL);
	if (choice==1){
	res=num1+num2;
	printf("result = %d",res);
	}else if(choice==2){
	res=num1-num2;
	printf("result = %d",res);
	}else if(choice==3){
	res=num1*num2;
	printf("result = %d",res);
	}else if(choice==4){
	res=num1/num2;
	printf("result = %d",res);
	}else {
	printf("u are fool");}
	return EXIT_SUCCESS;
}


