
#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
void getarray(char x[][30],int y[],char z[][20],int );
void display(char x[][30],int y[],char z[][20],int );
int main() {
	char name[100][30],place[100][20];
	int age[100],size;
	setbuf(stdout,NULL);

//	printf("enter the num of student");
//	scanf("%d",&size);
	size=1;
	getarray(name,age,place,size);
	printf("\n\n output\n\n student record");
	display(name,age,place,size);

	return 0;
}
void getarray(char x[][30],int y[],char z[][20],int size){
	int i;
	for(i=0;i<size;i++){
		printf("enter student %d",i+1);
		printf("\n enter ur name");
		scanf("%s",x[i]);
		printf("enter ur age");
		scanf("%d",&y[i]);

		printf("enter ur place");
		scanf("%s",z[i]);

	}

}

void display(char x[][30],int y[],char z[][20],int size)
		{
		int i;
		printf("\n\tname;\tage;\t place\n");
			for(i=0;i<size;i++){

				printf("\n\t%s\t%d\t%s\n ",x[i],y[i],z[i]);

		}

}
