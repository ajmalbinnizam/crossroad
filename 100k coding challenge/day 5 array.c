
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int val[100];
	int i,limit,sum,search,flag;
	setbuf(stdout,NULL);
//	printf("enter array limit");
//	scanf("%d",&limit);
//	printf("enetr val");
//	for(i=0;i<limit;i++)
//	{
//		scanf("%d",&a[i]);
//	}
////	printf("ur val");
//	sum=0;
//	for(i=0;i<limit;i++){
//
//		sum=sum+a[i];
//	}
//	printf("%d",sum);


#include <stdio.h>
#include <stdlib.h>

int main(void) {
int val[100];
int limit,i,j,temp;
setbuf(stdout,NULL);
	printf("enter the limit");
	scanf("%d",&limit);
	printf("enter val");
	for (i=0;i<limit;i++)
	{
		scanf("%d",&val[i]);
	}
	printf("search key");
	scanf("%d",&search);

	for (i=0;i<limit;i++){

	if(search==val[i]){
		flag=1;
		break;
	}
	}
	if(flag==1){
		printf("val %d",i+1);
	}else{
		printf("invalid");
	}

//	########selection sorted array$##@@


	printf("enter the limit");
	scanf("%d",&limit);
	printf("enter ur val");
	for(i=0;i<limit;i++)
	{
		scanf("%d\n",&val[i]);
	}
	for(i=0;i<limit-1;i++)
	{for(j=i+1;j<limit;j++)
		{if(val[i]>val[j])
		{
			temp=val[i];
		val[i]=val[j];
		val[j]=temp;
		}
		}
	}
	printf("sorted val =");
	for(i=0;i<limit;i++){
		printf("%d, ",val[i]);
	}


















	return EXIT_SUCCESS;
}
