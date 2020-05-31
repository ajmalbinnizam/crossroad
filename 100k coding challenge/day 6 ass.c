
#include<stdio.h>

void getArray(char[][30],int[],char[][15],int);
void display(char[][30],int [],char[][15],int);

int  main()
{
    char Name[100][30],Place[100][15];
    int Age[100],size;
    setbuf(stdout,NULL);

    printf("\nEnter the size of array \n\n");
    scanf("%d",&size);

    getArray(Name,Age,Place,size);

    printf("\n\n\n\nOutput:\n\nStudent record: \n");
    display(Name,Age,Place,size);
return 0;
}

void getArray(char x[][30],int y[],char z[][15],int size)
{
	int i;
    for(i=0;i<size;i++)
        {
            printf("\nEnter the record of Student %d\n",i+1);
            printf("\nEnter the name\n\n");
            scanf("%s",x[i]);
            printf("\nEnter the age\n\n");
            scanf("%d",&y[i]);
            printf("\nEnter the place\n\n");
            scanf("%s",z[i]);
        }
}

void display(char x[][30],int y[],char z[][15],int size)
{
    printf("\n\n\t\tName\t\tAge\t\tPlace\n\n");
    int i;
    for(i=0;i<size;i++)
        {
         printf("\n\t\t%s\t\t%d\t\t%s\n\n",x[i],y[i],z[i]);
        }
}



