
public class Statik {
int a=10;
static int b=12;
public static void main(String h[]) {
	
	Statik S=new Statik();
	Statik S1=new Statik();
	
//	System.out.println(S.a);
//	**helo();
//	S.helo();
	S.b=20;
	b=200;
	hi();
	System.out.println("j=="+b);
}

void helo() {
	System.out.println("hi");
}
static void hi()
{
	
}
}