import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	String oldvalue1,oldvalue2,oldvalue3,oldvalue4,C;
	
//	
	boolean isoperatorclicked=false;
//	boolean addpressed=false;
//	boolean subpressed=false;
//	boolean mulpressed=false;
//	boolean divpressed=false;

	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton delbutton ;JButton fivebutton;JButton onebutton; 
	JButton zerobutton;JButton addbutton;JButton subbutton;
	JButton eightbutton;JButton sixbutton ;JButton fourbutton;
	JButton dotbutton ; JButton clearbutton;
	JButton modbutton ;JButton sqrtbutton;
	JButton ninebutton;JButton threebutton;JButton twobutton;
	JButton equalto;JButton divbutton; JButton mulbutton;
	
	public Calculator() {
	jf =new JFrame("Calculator by aju");
	jf.setLayout(null);
	jf.setBackground(Color.black);
	jf.setForeground(Color.RED);
	jf.setSize(550,560);
	Color framecolor =new Color(10,10,255);
	jf.getContentPane().setBackground(framecolor);
	jf.setLocation(750,95);
	
	displaylabel =new JLabel();	
//	Font f=new Font("Digital-7",Font.BOLD,30);
//	displaylabel.setFont(f);
	displaylabel.setBounds(30 ,30,480,60);
	displaylabel.setBackground(Color.lightGray);
	displaylabel.setOpaque(true);
	displaylabel.setHorizontalAlignment(SwingConstants.LEFT);
	displaylabel.setForeground(Color.white);
	displaylabel.setFont(new Font("Parypus",Font.BOLD,35));
	jf.add(displaylabel);
//first row
	sevenbutton=new JButton("7");
	sevenbutton.setBounds(30, 120, 80, 80);
	sevenbutton.setFont(new Font("Digital-7",Font.PLAIN,40));
	sevenbutton.addActionListener(this);
	jf.add(sevenbutton);
	
	eightbutton=new JButton("8");
	eightbutton.setBounds(130, 120, 80, 80);
	eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
	eightbutton.addActionListener(this);
	jf.add(eightbutton);
	
	ninebutton=new JButton("9");
	ninebutton.setBounds(230, 120, 80, 80);
	ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
	ninebutton.addActionListener(this);
	jf.add(ninebutton);
//second row
	fourbutton=new JButton("4");
	fourbutton.setBounds(30, 230, 80, 80);
	fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
	fourbutton.addActionListener(this);
	jf.add(fourbutton);
	
	fivebutton=new JButton("5");
	fivebutton.setBounds(130, 230, 80, 80);
	fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
	fivebutton.addActionListener(this);
	jf.add(fivebutton);
	
	sixbutton=new JButton("6");
	sixbutton.setBounds(230, 230, 80, 80);
	sixbutton.addActionListener(this);
	sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
	jf.add(sixbutton);
//third row 1-3
	onebutton=new JButton("1");
	onebutton.setBounds(30, 330, 80, 80); //230+80+20 gap=330
	onebutton.setFont(new Font("Arial",Font.PLAIN,40));
	onebutton.addActionListener(this);
	jf.add(onebutton);
	
	twobutton=new JButton("2");
	twobutton.setBounds(130, 330, 80, 80);
	twobutton.setFont(new Font("Arial",Font.PLAIN,40));
	twobutton.addActionListener(this);
	jf.add(twobutton);
	
	threebutton=new JButton("3");
	threebutton.setBounds(230, 330, 80, 80);
	threebutton.setFont(new Font("Arial",Font.PLAIN,40));
	threebutton.addActionListener(this);
	jf.add(threebutton);
	//fourth row . 0 =
	dotbutton=new JButton(".");
	dotbutton.setBounds(30, 430, 80, 80); //330+80+20 gap=330
	dotbutton.setFont(new Font("Arial",Font.PLAIN,40));
	dotbutton.addActionListener(this);
	jf.add(dotbutton);
	
	zerobutton=new JButton("0");
	zerobutton.setBounds(130, 430, 80, 80);
	zerobutton.addActionListener(this);
	zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
	jf.add(zerobutton);
	
	equalto=new JButton("=");
	equalto.setBounds(230, 430, 80, 80);
	equalto.setFont(new Font("Arial",Font.PLAIN,40));
	equalto.addActionListener(this);
	jf.add(equalto);
//operator
	divbutton=new JButton("/");
	divbutton.setFont(new Font("Arial",Font.PLAIN,40));
	divbutton.addActionListener(this);
	divbutton.setBounds(330, 120, 80, 80); //x=230+80+20
	jf.add(divbutton);
	
	mulbutton=new JButton("*");
	mulbutton.setBounds(330, 230, 80, 80); //x=230+80+20
	mulbutton.addActionListener(this);
	mulbutton.setFont(new Font("Arial",Font.PLAIN,40));
	jf.add(mulbutton);
	
	subbutton=new JButton("-");
	subbutton.setBounds(330, 330, 80, 80); //x=230+80+20
	subbutton.addActionListener(this);
	subbutton.setFont(new Font("Arial",Font.PLAIN,40));
	jf.add(subbutton);
	
	addbutton=new JButton("+");
	addbutton.setBounds(330, 430, 80, 80); //x=230+80+20
	addbutton.addActionListener(this);
	addbutton.setFont(new Font("Arial",Font.PLAIN,40));
	jf.add(addbutton);
	
	clearbutton=new JButton("AC");
	clearbutton.setBounds(430, 430, 80, 80); //x=230+80+20
	clearbutton.addActionListener(this);
	clearbutton.setFont(new Font("Arial",Font.PLAIN,25));
	jf.add(clearbutton);
	
	modbutton=new JButton("%");
	modbutton.setBounds(430, 120, 80, 80); 
	modbutton.addActionListener(this);
	modbutton.setFont(new Font("Arial",Font.PLAIN,25));
	jf.add(modbutton);
	
	sqrtbutton=new JButton("+/-");
	sqrtbutton.setBounds(430, 230, 80, 80); 
	sqrtbutton.addActionListener(this);
	sqrtbutton.setFont(new Font("Arial",Font.PLAIN,25));
	jf.add(sqrtbutton);
	
	delbutton=new JButton("DEL");
	delbutton.setBounds(430, 330, 80, 80); 
	delbutton.addActionListener(this);
	delbutton.setFont(new Font("Arial",Font.PLAIN,20));
	jf.add(delbutton);
	
	jf.setVisible(true);	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
	
	
	
	
	
	
	
	
	
 public static void main(String[] args) {
	 new Calculator();
//	Calculator c=new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==sevenbutton) {
		
		if(isoperatorclicked) {		///auto true
			displaylabel.setText("7");
			
			isoperatorclicked=false;
		}else{
			
			displaylabel.setText(displaylabel.getText()+"7");
		}	
		
	}else if(e.getSource()==eightbutton) {
		if(isoperatorclicked) {
			displaylabel.setText("8");
			isoperatorclicked=false;
		}else{
		displaylabel.setText(displaylabel.getText()+"8");
		}
		
	}else if(e.getSource()==ninebutton) {
		if(isoperatorclicked) {
			displaylabel.setText("9");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"9");
		}
	}else if(e.getSource()==fourbutton) {
		if(isoperatorclicked) {
			displaylabel.setText("4");
			isoperatorclicked=false;
		}else{
				displaylabel.setText(displaylabel.getText()+"4");
		}
	
	}else if(e.getSource()==fivebutton) {
		if(isoperatorclicked) {
			displaylabel.setText("5");
			isoperatorclicked=false;
		}else{
				displaylabel.setText(displaylabel.getText()+"5");
		}
		
	}else if(e.getSource()==sixbutton) {
	
		if(isoperatorclicked) {
			displaylabel.setText("6");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"6");
			}
		
	}else if(e.getSource()==threebutton){
			if(isoperatorclicked) {
				displaylabel.setText("3");
				isoperatorclicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"3");
			}
	}else if(e.getSource()==twobutton) {
		if(isoperatorclicked) {
			displaylabel.setText("2");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"2");
		}
	}else if(e.getSource()==onebutton) {
		if(isoperatorclicked) {
			displaylabel.setText("1");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"1");
		}
	}else if(e.getSource()==zerobutton) {
		if(isoperatorclicked) {
			displaylabel.setText("0");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"0");
		}
	}else if(e.getSource()==dotbutton) {
		if(isoperatorclicked) {
			displaylabel.setText(".");
			isoperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+".");
		}
		
	}else if(e.getSource()==subbutton) {
		
		isoperatorclicked=true;
//		subpressed=true;
		oldvalue2=displaylabel.getText();
		C=oldvalue2;
		displaylabel.setText("-");
		
	}else if(e.getSource()==addbutton) {
		
		isoperatorclicked=true;
//		addpressed=true;
		oldvalue1=displaylabel.getText();
		C=oldvalue1;
		displaylabel.setText("+");
	}else if(e.getSource()==mulbutton) {
		oldvalue3=displaylabel.getText();
		isoperatorclicked=true;
//		mulpressed=true;
		C=oldvalue3;
		displaylabel.setText("*");
		
	}else if(e.getSource()==divbutton) {
		
		isoperatorclicked=true;
//		divpressed=true;
		oldvalue4=displaylabel.getText();
		C=oldvalue4;
		displaylabel.setText("/");
		
			
	}else if(e.getSource()==delbutton){
		displaylabel.setText("");
	
	}else if(e.getSource()==clearbutton){
		displaylabel.setText("");
	
		
	}
	else if(e.getSource()==equalto && C==oldvalue1){
		//displayLabel.setText("=");
		String newValue=displaylabel.getText();
		float oldValueF=Float.parseFloat(C);//convert string to float
		float newValueF=Float.parseFloat(newValue);
		float result=oldValueF+newValueF;
		displaylabel.setText(result+"");//convert float result to string

	}
	else if(e.getSource()==equalto && C==oldvalue2){
		//displayLabel.setText("=");
		String newValue=displaylabel.getText();
		float oldValueF=Float.parseFloat(C);//convert string to float
		float newValueF=Float.parseFloat(newValue);
		float result=oldValueF-newValueF;
		displaylabel.setText(result+"");//convert float result to string

	}
	else if(e.getSource()==equalto && C==oldvalue3){
		//displayLabel.setText("=");
		String newValue=displaylabel.getText();
		float oldValueF=Float.parseFloat(C);//convert string to float
		float newValueF=Float.parseFloat(newValue);
		float result=oldValueF*newValueF;
		
		displaylabel.setText(result+"");//convert float result to string

	}
	else if(e.getSource()==equalto && C==oldvalue4){
		//displayLabel.setText("=");
		String newValue=displaylabel.getText();
		float oldValueF=Float.parseFloat(C);//convert string to float
		float newValueF=Float.parseFloat(newValue);
		float result=oldValueF/newValueF;
		
		displaylabel.setText(result+"");//convert float result to string

	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	}else if(e.getSource()==equalbutton) {
//		String newvalue=displaylabel.getText();
//		float oldvaluef=Float.parseFloat(oldvalue);
//		float newvaluef=Float.parseFloat(newvalue);
	
//		//reult of calculator
//		float result=0;
//		if (addpressed) {
//			result=oldvaluef+newvaluef;
//		}else if(subpressed) {
//			result=oldvaluef-newvaluef;
//		}else if(mulpressed) {
//			result=oldvaluef*newvaluef;
//		}else if(divpressed) {
//			result=oldvaluef/newvaluef;
//		}
//		displaylabel.setText(result+"");
//		
//		addpressed=false;
//		subpressed=false;
//		mulpressed=false;
//		divpressed=false;		
		

		
	}	
		
}	
	





