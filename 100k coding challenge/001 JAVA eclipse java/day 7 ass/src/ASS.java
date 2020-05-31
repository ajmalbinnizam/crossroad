import java.util.Scanner;

public class ASS {
public static void main(String[] args) {
	ASS obj =new ASS();
	int [][]num=new int[100][100];
	System.out.println("enter size of aaray");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt() ;
	
	System.out.println("enter elements");
	obj.getarray(num,size);
	System.out.println("ur value are");
	obj.display(num,size);
	
	
}
void getarray(int num[][],int s)
{
	Scanner a=new Scanner(System.in);
for(int i=0;i<s;i++) {
	for(int j=0;j<s;j++) {
		num[i][j]=a.nextInt();	
	}
}
}
void display(int n[][],int size) {
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
		System.out.print(n[i][j]+ " \t");
		}
		System.out.println("\n");
	}
	}
}
