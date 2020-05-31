
#include<stdio.h>
#include<stdlib.h>
void getarray();
main(void){
	int n,i;
	setbuf(stdout,NULL);
	printf("enter n");
	scanf("%d",&n);
	for (i=0;i<n;i++){

  getarray();
}
void getarray(char name[100], char place[100])
{
	printf("enter ur name");
	scanf("%s",name);
	printf("enter ur place");
	scanf("%s",place);

}
