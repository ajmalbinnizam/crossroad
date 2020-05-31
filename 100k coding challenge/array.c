

#include <stdio.h>
#include <stdlib.h>

int main(void) {
// int m[5],i;
// setbuf(stdout,NULL);
//		 printf("nter stud mark");
//		 for (i=0;i<5;i++){
//		 scanf("%d",&m[i]);
// }
// for (i=0;i<5;i++){
//		 printf(" %d stud mark= %d\n",i+1,m[i]);
//
// }

//	char name[20];
//	setbuf(stdout,NULL);
//	printf("enter ur name");
//	scanf("%s",name);
//	printf("%s",name);
	int a[2][2],i,j;
	setbuf(stdout,NULL);
	printf("enter ur num");
 for (i=0;i<2;i++){
	 for (j=0;j<2;j++){
		 scanf("%d",&a[i][j]);
	 }
 }
 for (i=0;i<2;i++){
	 for (j=0;j<2;j++)
	 {
		 printf("%d\t",a[i][j]);
	 }
	 printf("\n");
 }



}
