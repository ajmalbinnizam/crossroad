
public class B extends A {
	int a;
	B(){
		System.out.println("ist b constr");
	}
	B(int a){
		super(10);
		System.out.println("ists argumnt of b");
//		,,>> error  super(10);
	}
	void display() {
		System.out.println("its b b");
//		super.display();
		a=20;
		super.a=30;
		int c=a+super.a;
		System.out.println(c);
	}
	void dis() {
		super.display();
	}
	public static void main(String[] args) {
		B b =new B(10);
		
//obj.display();
//obj.super.display();
//	obj.dis();
}
	
	
	
}
