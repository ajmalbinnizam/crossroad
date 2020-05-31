
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JFrame jf;JLabel displayLabel;JButton seven;JButton eight;JButton nine;
	JButton four;JButton five;JButton six;JButton one;
	JButton two;JButton three;
	JButton dot;JButton zero;JButton equalto;
	JButton Div;JButton Multpln;JButton Minus;JButton Plus;JButton Clear;
	boolean isOperatorClicked=true;
	String oldValue1,oldValue2,oldValue3,oldValue4,C;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		init();
		
	}
	
	public void init() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(650, 560);
		jf.setLocation(150,110);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 540, 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		seven=new JButton("7");
		seven.setBounds(35, 115, 75,75);
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(seven);
		seven.addActionListener(this);
		
		eight=new JButton("8");
		eight.setBounds(135, 115, 75,75);
		eight.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(eight);
		eight.addActionListener(this);
		
		nine=new JButton("9");
		nine.setBounds(235, 115, 75,75);
		nine.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(nine);
		nine.addActionListener(this);
		
		four=new JButton("4");
		four.setBounds(35, 215, 75,75);
		four.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(four);
		four.addActionListener(this);
		
		five=new JButton("5");
		five.setBounds(135, 215, 75,75);
		five.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(five);
		five.addActionListener(this);
		
		six=new JButton("6");
		six.setBounds(235, 215, 75,75);
		six.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(six);
		six.addActionListener(this);
		
		one=new JButton("1");
		one.setBounds(35, 315, 75,75);
		one.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(one);
		one.addActionListener(this);
		
		two=new JButton("2");
		two.setBounds(135, 315, 75,75);
		two.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(two);
		two.addActionListener(this);
		
		three=new JButton("3");
		three.setBounds(235, 315, 75,75);
		three.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(three);
		three.addActionListener(this);
		
		dot=new JButton(".");
		dot.setBounds(35, 415, 75,75);
		dot.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(dot);
		dot.addActionListener(this);
		
		zero=new JButton("0");
		zero.setBounds(135, 415, 75,75);
		zero.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(zero);
		zero.addActionListener(this);
		
		equalto=new JButton("=");
		equalto.setBounds(235, 415, 75,75);
		equalto.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(equalto);
		equalto.addActionListener(this);
		
		Div=new JButton("/");
		Div.setBounds(415, 115, 75,75);
		Div.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Div);
		Div.addActionListener(this);
		
		Multpln=new JButton("x");
		Multpln.setBounds(415, 215, 75,75);
		Multpln.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Multpln);
		Multpln.addActionListener(this);
		
		Minus=new JButton("-");
		Minus.setBounds(415, 315, 75,75);
		Minus.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Minus);
		Minus.addActionListener(this);
		
		Plus=new JButton("+");
		Plus.setBounds(415, 415, 75,75);
		Plus.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Plus);
		Plus.addActionListener(this);
		
		Clear=new JButton("C");
		Clear.setBounds(500, 415, 75,75);
		Clear.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(Clear);
		Clear.addActionListener(this);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the pgm when
		//window is closed
	}

	public static void main(String[] args) {
		//Calculator c=new Calculator(); or
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//displayLabel.setText("7");--only print 7
		
	if(e.getSource()==seven) {
		//displayLabel.setText("7");
		if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"7");
		}
	}else if(e.getSource()==eight) {
		//displayLabel.setText("8");
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"8");
		}
}
	else if(e.getSource()==nine) {
		//displayLabel.setText("9");
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"9");
		}
}else if(e.getSource()==four) {
	//displayLabel.setText("4");
	if(isOperatorClicked) {
		displayLabel.setText("4");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"4");
	}
}else if(e.getSource()==five) {
	//displayLabel.setText("5");
	if(isOperatorClicked) {
		displayLabel.setText("5");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"5");
	}
}else if(e.getSource()==six) {
	//displayLabel.setText("6");
	if(isOperatorClicked) {
		displayLabel.setText("6");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"6");
	}
}else if(e.getSource()==one) {
	//displayLabel.setText("1");
	if(isOperatorClicked) {
		displayLabel.setText("1");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"1");
	}
}else if(e.getSource()==two) {
	//displayLabel.setText("2");
	if(isOperatorClicked) {
		displayLabel.setText("2");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"2");
	}
}else if(e.getSource()==three) {
	//displayLabel.setText("3");
	if(isOperatorClicked) {
		displayLabel.setText("3");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"3");
	}
}else if(e.getSource()==zero) {
	//displayLabel.setText("0");
	if(isOperatorClicked) {
		displayLabel.setText("0");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+"0");
	}
}else if(e.getSource()==dot) {
	//displayLabel.setText(".");
	if(isOperatorClicked) {
		displayLabel.setText(".");
		isOperatorClicked=false;
	}else {
	displayLabel.setText(displayLabel.getText()+".");
	}
}else if(e.getSource()==Div) {
	isOperatorClicked=true;
	oldValue4=displayLabel.getText();
	C=oldValue4;
	displayLabel.setText("/");
	
}else if(e.getSource()==Multpln) {
	isOperatorClicked=true;
	oldValue3=displayLabel.getText();
	C=oldValue3;
	displayLabel.setText("x");
	
}else if(e.getSource()==Minus) {
	isOperatorClicked=true;
	oldValue2=displayLabel.getText();
	C=oldValue2;
	displayLabel.setText("-");
	
}else if(e.getSource()==Plus) {
	isOperatorClicked=true;
	oldValue1=displayLabel.getText();
	C=oldValue1;
	displayLabel.setText("+");
	
}
else if(e.getSource()==equalto && C==oldValue1){
	//displayLabel.setText("=");
	String newValue=displayLabel.getText();
	float oldValueF=Float.parseFloat(C);//convert string to float
	float newValueF=Float.parseFloat(newValue);
	float result=oldValueF+newValueF;
	displayLabel.setText(result+"");//convert float result to string

}
else if(e.getSource()==equalto && C==oldValue2){
	//displayLabel.setText("=");
	String newValue=displayLabel.getText();
	float oldValueF=Float.parseFloat(C);//convert string to float
	float newValueF=Float.parseFloat(newValue);
	float result=oldValueF-newValueF;
	displayLabel.setText(result+"");//convert float result to string

}
else if(e.getSource()==equalto && C==oldValue3){
	//displayLabel.setText("=");
	String newValue=displayLabel.getText();
	float oldValueF=Float.parseFloat(C);//convert string to float
	float newValueF=Float.parseFloat(newValue);
	float result=oldValueF*newValueF;
	displayLabel.setText(result+"");//convert float result to string

}
else if(e.getSource()==equalto && C==oldValue4){
	//displayLabel.setText("=");
	String newValue=displayLabel.getText();
	float oldValueF=Float.parseFloat(C);//convert string to float
	float newValueF=Float.parseFloat(newValue);
	float result=oldValueF/newValueF;
	displayLabel.setText(result+"");//convert float result to string

}
else if(e.getSource()==Clear) {
	displayLabel.setText("");
	
}
	}
	}

