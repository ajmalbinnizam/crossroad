
public class MainClass {

public static void main(String clas[]) {
	
	SampleClass s1 =new SampleClass();     //sample class blueprint il oru s1 object
	SampleClass s2 =new SampleClass(); 
	s1.a=10;
	s1.b=20;//object .variable
	s2.b=30;
	s2.a=40;
	
//System.out.println(" S1-a:"+s1.a+" s2.b "+s2.b+" s2.a:"+s2.a);
	System.out.println("main class");
	s1.display(); //object .method
	s2.display();
}

}
