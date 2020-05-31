//
//#include <stdio.h>
//#include <stdlib.h>
//
//int main(void) {
//int a,b,c,temp;
//setbuf(stdout,NULL);
//########positive or negative#########33
//printf("enter ur dec");
//scanf("%d",&a);
//if (a<0){
//printf("numbr is negative");
//}
//else{
//printf("number is positive");
//}
//##### comparing two number################

//printf("enter ur frst number");
//scanf("%d",&a);
//printf("enter your second number");
//scanf("%d",&b);
//if (a>b){
//	printf("\n %d is greater ",a);
//}else{
//	printf("\n %d is greater",b);
//}

//##########comparing three values########3
//printf("enter ur number");
//scanf("%d %d %d",&a,&b,&c);
//if(a>b&&a>c){
//	printf("greatest number is: %d",a);
//}
//else if(b>a&&b>c){
//	printf("greatest number is: %d",b);
//}
//else{
//	printf("greatest number is :%d",c);
//}

//########## MATHEMATICS else if ladder add ,sub,##########


//#include <stdio.h>
//#include <stdlib.h>
//
//int main(void) {
//	int num1,num2,choice,res;
//	setbuf(stdout,NULL);
//
//	printf("enter ur two number");
//	scanf("%d %d",&num1,&num2);
//	printf("1;add \n2;sub\n3;multi\n4;div\n enter ur choice \n ");
//	scanf("%d",&choice);
//	setbuf(stdout,NULL);
//	if (choice==1){
//	res=num1+num2;
//	printf("result = %d",res);
//	}else if(choice==2){
//	res=num1-num2;
//	printf("result = %d",res);
//	}else if(choice==3){
//	res=num1*num2;
//	printf("result = %d",res);
//	}else if(choice==4){
//	res=num1/num2;
//	printf("result = %d",res);
//	}else {
//	printf("u are fool");}
//	return EXIT_SUCCESS;
//}

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int choice;
	setbuf(stdout,NULL);
	printf(" 1 for porotta\n 2 for biriyani\n 3 for mandhi \n 4 for omlette\n enter you choice");
	scanf("%d",&choice);
	switch(choice){
	case 1:
		printf("porotta");
		break;
	case 2:
		printf("biriyani");
		break;
	case 3:
		printf("mandi");
		break;
	case 4:
		printf("omlete");
		break;
	default:
	printf("fool");
	}


}






