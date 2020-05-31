
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a,n,i,j,flag;
	setbuf(stdout,NULL);
//	EEVEN NUMBERS
//	printf("enter ur number ");
//	scanf("%d",&a);
////	sum=0;
//	for(i=2;i<=a;i++){
//		if(i%2==0){
//		printf("%d\n",i);
//	}
//}
//####### prime or not ######
//	printf("enter num to be primed");
//	scanf("%d",&n);
//	flag=0;
//	n=13;
//	setbuf(stdout,NULL);
//	for(i=2;i<n;i++){
//		if(n%i==0){
//		flag=1;
//		break;}
//	}
//	if(flag==0){
//		printf("prime");
//	}
//		else{
//			printf(" not prime nnum");
//	}
//	##@@@@ star pattern ##@@

//n=4;
//for(i=1;i<=n;++i)
//{
//	for(j=1;j<=i;++j){
//		printf("* ");
//	}
//	printf("\n");
//}

// ####  Assignment star pattern ####

//
//a=1;
//n=4;
//for(i=1;i<=n;++i)
//{
//	for(j=1;j<=i;++j){
//		printf("%d ",a++);
//	}
//	printf("\n");
//}
//return EXIT_SUCCESS;
//}






#include <stdio.h>
#include <stdlib.h>

int main(void) {
        int i,j,n,s=0;
                setbuf(stdout,NULL);
                printf("Enter the number of rows:");
                scanf("%d",&n);
                for(i=1;i<=n;i++)
                {
                        for(j=1;j<=i;j++)
                        {
                                s=s+1;
                                printf("%d\t",s);
                        }
                        printf("\n");
                }
        return EXIT_SUCCESS;
}

