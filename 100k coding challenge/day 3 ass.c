
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	float tax,amount;
	setbuf(stdout,NULL);
	printf("Enter the annual amount:");
	scanf("%f" ,&tax);
	if(tax<=250000){
	printf("No tax only for annual income upto 2.5 lakhs ,your annual income is %f",tax);
	}else if(tax>250000 && tax<=500000){  //above 2.5 to 5
	amount=(tax*5)/100;
	}else if (tax>500000 && tax<=1000000){  //above 5 to 10
	amount=(tax*20)/100;
	}else if (tax>1000000 && tax<=5000000){ //above 10 to 50
	amount=(tax*30)/100;}
	else {printf("Enter annual income upto 50 lakhs");}

	printf("Income tax amount= %f",amount);
}

