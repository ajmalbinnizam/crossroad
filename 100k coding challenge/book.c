#include <stdio.h>
#include<stdlib.h>
#include<conio.h>
 int fact(int );
 int main()
 {

	 int n,r,f;
//	 clrscr();
	 setbuf(stdout,NULL);
	 printf("enetr ur n and r");
	 scanf("%d %d",&n,&r);
	 n=3;
	 r=3;
	 f=fact(n)+fact(r);
printf("%d",f);

}
int fact(int k){
	int p=1,i;
	for (i=1;i<=k;i++){
		p=p*i;
	}

	return p;
}
