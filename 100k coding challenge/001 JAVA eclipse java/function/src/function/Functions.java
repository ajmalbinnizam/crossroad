package function;

import java.util.Scanner;

public class Functions {
	public static void main(String hello[]) {
		System.out.println("enter ur num");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int result=sum(num1,num2);
		System.out.println("result= "+result);
	}


static int sum(int a, int b)
	{
	int s=a+b;
	return s;
}
}