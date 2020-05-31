
#include <stdio.h>
#include <stdlib.h>

int main(void) {
int val[100],mul[100];
int limit,i,x=0,y=0;
setbuf(stdout,NULL);
printf("enter the array limit\n");  //a.accept array
scanf("%d",&limit);
printf("enter the values of array\n");
for(i=0;i<limit;i++)
{
	scanf("%d",&val[i]);
}

for(i=0;i<limit-1;i++)
{
	x=val[i];
	y=val[i+1];			//b.multiply adjacent values
	mul[i]=x*y;   		//c.store in another variable
//	printf("%d\t",mul[i]);
}
printf("Output\n");
for(i=0;i<limit-1;++i)
{
	printf("%d\t",mul[i]);
}
}






//Assignment Answer

#include <stdio.h>

#include <stdlib.h>

int main(void) {

        int a[10],b[10],i,num;

        setbuf(stdout,NULL);

        printf("Please enter the limit of the array \n");

        scanf("%d",&num);

        printf("Please enter the numbers into the array \n");

        for(i=0;i<num;i++)

                {scanf("%d",&a[i]);}

        for(i=0;i<num-1;i++)

                {b[i]=(a[i]*a[i+1]);}

        printf("Values in the Original Array is \n");

        for(i=0;i<num;i++)

                {printf("%d  ",a[i]);}

        printf("\nValues in the Multiplied Array is \n");

        for(i=0;i<num-1;i++)

                {printf("%d  ",b[i]);}

        return EXIT_SUCCESS;

}
