
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void) {
float t,l,a,test,lab,ass,avg;
setbuf(stdout,NULL);
t=0.7; //70/100=0.7
l=0.2; //20/100=0.2
a=0.1; //10/100=0.1

printf("Enter the mark scored by the students\n ");
printf("\n Written test= ");//user input
scanf("%f",&test);
printf("\n Lab exams= ");
scanf("%f",&lab);
printf("\n Assignments= ");
scanf("%f",&ass);
avg=t*test+l*lab+a*ass; //calculation of mark *grade weightage

printf("\nGrade of the student is  %f",avg); // in orround(avg)
//printf("\nGrade of the student is  %f",round(avg)); // in round off average
}
