package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	
	String inputFunction = "";
	JLabel title = new JLabel("0", JLabel.RIGHT);
	
	public Calculator(){
		this.setTitle("Calculator");
		this.setSize(250, 300);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		
		//main panel to receive the buttons and title on top
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//title label
		
		title.setOpaque(true);
		title.setBackground(Color.WHITE);
		title.setFont(new Font("Consolas", Font.PLAIN, 30));
		mainPanel.add(title, BorderLayout.NORTH);
		
		//center panel to receive the all the buttons
		JPanel centerpan = new JPanel(new GridLayout(5, 4, 5, 5));
		
		//backspace button
		JButton btnBack = new JButton("<=");
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (inputFunction != null && inputFunction.length() > 0) {
					inputFunction = inputFunction.substring(0, inputFunction.length() - 1);	
					title.setText(inputFunction);
					} else if (inputFunction.length() == 0 || inputFunction.isEmpty()) {
						title.setText("0");
					}
				else {
					title.setText("0");
				}								
			}
		});
		
		//clear entry button
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (checkOperator(inputFunction))  {
					// find position of operands
					int operatorPosition = positionOfOperator(inputFunction);
					// check for . in the substring

					String rightSide = inputFunction.substring(operatorPosition, inputFunction.length());
					
					inputFunction = inputFunction.replace(rightSide, "");
					title.setText(inputFunction);
											
				}				
			}						
		});
		
		//clear button
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = "0";
				title.setText(inputFunction);				
				
			}						
		});
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Double SigninputFunction = Double.parseDouble(inputFunction) * -1;
				inputFunction = SigninputFunction.toString();
				title.setText(inputFunction);			
				
			}						
		});
		
		//adding first row
		centerpan.add(btnBack);
		centerpan.add(btnCE);
		centerpan.add(btnC);
		centerpan.add(btnSign);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "7";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "8";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "9";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((checkOperator(inputFunction)) && (inputFunction.length() >= 0)) {
					title.setText(inputFunction); 
				} else if (inputFunction.length() != 0){
					inputFunction = inputFunction + "/";
					title.setText(inputFunction);		
				}
				
			}
						
		});
		
		//adding first row
		centerpan.add(btn7);
		centerpan.add(btn8);
		centerpan.add(btn9);
		centerpan.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "4";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "5";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "6";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((checkOperator(inputFunction)) && (inputFunction.length() >= 0)) {
					title.setText(inputFunction); 
				} else if (inputFunction.length() != 0){
					inputFunction = inputFunction + "*";
					title.setText(inputFunction);		
				}				
				
			}
						
		});
		
		//adding second row
		centerpan.add(btn4);
		centerpan.add(btn5);
		centerpan.add(btn6);
		centerpan.add(btnTimes);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "1";
				title.setText(inputFunction);				
				
			}
						
		});
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "2";
				title.setText(inputFunction);	
			}
			
		});
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "3";
				title.setText(inputFunction);	
				
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((checkOperator(inputFunction)) && (inputFunction.length() >= 0)) {
					title.setText(inputFunction); 
				} else if (inputFunction.length() != 0){
					inputFunction = inputFunction + "-";
					title.setText(inputFunction);		
				}
				
			}
		});
		//adding third row
		centerpan.add(btn1);
		centerpan.add(btn2);
		centerpan.add(btn3);
		centerpan.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputFunction = inputFunction + "0";
				title.setText(inputFunction);				
				
			}						
		});
		JButton btnPeriod = new JButton(".");
		btnPeriod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {							
				
				// if true then split into two substrings. if false then check only inputFunction for .
				if (checkOperator(inputFunction))  {
					// find position of operands
					int operatorPosition = positionOfOperator(inputFunction);
					// check for . in the substring

					String rightSide = inputFunction.substring(operatorPosition + 1, inputFunction.length());
					
					if (rightSide.lastIndexOf(".", rightSide.length()-1) == -1) {
						inputFunction = inputFunction + ".";
						title.setText(inputFunction);					
					} else {
						title.setText(inputFunction);
					}
				} else {
					if (inputFunction.length() == 0) {
						title.setText("0.");
					} else if (checkDot(inputFunction)) {
						title.setText(inputFunction);
					} else {
						inputFunction = inputFunction + ".";
						title.setText(inputFunction);
					}
		}															
			}						
		});
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//find operand
				String operand = whichOperand(inputFunction);
				
				// isolate left and right hand sides
				double leftHandSide = LHS(inputFunction);
				double rightHandSide = RHS(inputFunction);
				
				//perform operation
				String finalProduct = evaluation(leftHandSide, rightHandSide, operand);
				
				title.setText(finalProduct);
				inputFunction = finalProduct;
				
			}									
		});
			
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((checkOperator(inputFunction)) && (inputFunction.length() >= 0)) {
					title.setText(inputFunction); 
				} else if (inputFunction.length() != 0){
					inputFunction = inputFunction + "+";
					title.setText(inputFunction);		
				}								
			}						
		});
		
		//adding last row
		centerpan.add(btn0);
		centerpan.add(btnPeriod);
		centerpan.add(btnEqual);
		centerpan.add(btnPlus);
		
		centerpan.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		mainPanel.add(centerpan,BorderLayout.CENTER);		
		
		this.add(mainPanel);
		this.setVisible(true);
	}
	
	public static boolean checkOperator(String inputFunction) {
		
		if ((inputFunction.indexOf("+", 0) == -1) && (inputFunction.indexOf("-", 0) == -1) && (inputFunction.indexOf("*", 0) == -1) && (inputFunction.indexOf("/", 0) == -1)) {
			return false;
		} else
			return true;		
	}
	
	public static int positionOfOperator(String inputFunction) {
		
		//give position of operand
		if (inputFunction.lastIndexOf("+", inputFunction.length() - 1) != -1) {
			return inputFunction.lastIndexOf("+", inputFunction.length() - 1);			
		} else if (inputFunction.lastIndexOf("-", inputFunction.length() - 1) != -1) {
			return inputFunction.lastIndexOf("-", inputFunction.length() - 1);			
		} else if (inputFunction.lastIndexOf("*", inputFunction.length() - 1) != -1) {
			return inputFunction.lastIndexOf("*", inputFunction.length() - 1);			
		} else if (inputFunction.lastIndexOf("/", inputFunction.length() - 1) != -1) {
			return inputFunction.lastIndexOf("/", inputFunction.length() - 1);			
		} else 
			return -1;		
	}
	
	public static boolean checkDot(String inputFunction) {
		
		if ((inputFunction.indexOf(".", 0) == -1)) {
			return false;
		} else
			return true;
		
	}
	
	public String whichOperand (String inputFuction) {
		
		//determine which operand is used
		if (inputFunction.indexOf("+") != -1) {
			return "+";
		} else if (inputFunction.indexOf("-") != -1) {
			return "-";
		} else if (inputFunction.indexOf("*") != -1) {
			return "*";
		} else if (inputFunction.indexOf("/") != -1) {
			return "/";
		}
		
		return "";
	}
	
	public double LHS (String inputFunction) {
		
		int operatorPosition = positionOfOperator(inputFunction);
		
		String leftSide = inputFunction.substring(0, operatorPosition);
		
		double leftSideDouble = Double.parseDouble(leftSide);
		
		return leftSideDouble;		
		
	}
	
public double RHS (String inputFunction) {
		
		int operatorPosition = positionOfOperator(inputFunction);
		
		String rightSide = inputFunction.substring(operatorPosition +1, inputFunction.length());
		
		double rightSideDouble = Double.parseDouble(rightSide);
		
		return rightSideDouble;		
		
	}

public String evaluation (double LHS, double RHS, String operand) {
	
	double result;
	String resultReturn;
	
	if (operand.equals("+")) {
		result = LHS + RHS;
		resultReturn = String.valueOf(result);
		return resultReturn;
	} else if (operand.equals("-")) {
		result = LHS - RHS;
		resultReturn = String.valueOf(result);
		return resultReturn;
	} else if (operand.equals("*")) {
		result = LHS * RHS;
		resultReturn = String.valueOf(result);
		return resultReturn;
	} else if (operand.equals("/")) {
		
		try {
			result = LHS / RHS;
			resultReturn = String.valueOf(result);
			return resultReturn;
		} catch (Exception e) {
			result = 0;
			resultReturn = String.valueOf(result);
			return resultReturn;
		}
		
	}
	
	result = 0;
	resultReturn = String.valueOf(result);
	return resultReturn;
	
	
	
	
}
	
		
		
		
	}
