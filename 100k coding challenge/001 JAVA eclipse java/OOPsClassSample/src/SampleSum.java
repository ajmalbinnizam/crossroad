import java.util.Scanner;

public class SampleSum {
	public static void main(String sum[]) {
	Calsum s1=new Calsum();
	System.out.println(" 2 num");
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	int c=s1.sum(a,b);
//	= s1.display();
	System.out.println("cal val="+c);
	
		
		
	}

}
