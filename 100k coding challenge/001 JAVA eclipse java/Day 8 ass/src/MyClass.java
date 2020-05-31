import java.util.Scanner;

public class  MyClass extends Area{
	Scanner  scan = new Scanner(System.in);
	MyClass(int choices) {
		// TODO Auto-generated constructor stub
		
	
		switch (choices) {
		case 1: circle();
		break;
		case 2: rectangle();
		break;
	
		default:
			System.out.println("enter correct choices");
		}
	}
		void circle() {
			
			System.out.println("enter ur radius");
			int rad=scan.nextInt();
			circle(rad);
			
		}
	void rectangle() {
		System.out.println("enter lenth and breadth");
		int l=scan.nextInt();
		int b=scan.nextInt();
		rectangle(l,b);
		
	}
		

	
	public static void main(String []args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter ur choice \n1.circle\n 2.rectangle ");
	int choices=s.nextInt();
	
	MyClass obj =new MyClass(choices);
	s.close();
	}
}
