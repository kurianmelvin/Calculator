package Calculators;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	JFrame frame;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;


	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.setBounds(100, 100, 472, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// -------------------- text box -----------------
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(15, 16, 430, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// -------------------- text box end-----------------

		// -------------------- Row One -----------------

		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				if (textField.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backSpace = strB.toString();
					textField.setText(backSpace);
					
					
				}
				
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBackspace.setBounds(20, 84, 80, 80);
		frame.getContentPane().add(btnBackspace);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(120, 84, 80, 80);
		frame.getContentPane().add(btnClear);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPercent.setBounds(220, 84, 80, 80);
		frame.getContentPane().add(btnPercent);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.setBounds(350, 84, 80, 80);
		frame.getContentPane().add(btnPlus);

		// -------------------- Row One end-----------------

		// -------------------- Row Two -----------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(20, 180, 80, 80);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(120, 180, 80, 80);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(220, 180, 80, 80);
		frame.getContentPane().add(btn9);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMinus.setBounds(350, 180, 80, 80);
		frame.getContentPane().add(btnMinus);

		// -------------------- Row Two end -----------------

		// -------------------- Row three -----------------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(20, 276, 80, 80);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(120, 276, 80, 80);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(220, 276, 80, 80);
		frame.getContentPane().add(btn6);

		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMult.setBounds(350, 276, 80, 80);
		frame.getContentPane().add(btnMult);

		// -------------------- Row three end -----------------

		// -------------------- Row four -----------------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(20, 372, 80, 80);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(120, 372, 80, 80);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(220, 372, 80, 80);
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(350, 372, 80, 80);
		frame.getContentPane().add(btnDiv);

		// -------------------- Row four end -----------------

		// -------------------- Row five -----------------

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(20, 468, 80, 80);
		frame.getContentPane().add(btn0);

		JButton btnDec = new JButton(".");
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDec.setBounds(120, 468, 80, 80);
		frame.getContentPane().add(btnDec);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				String answer;
				
				secondNumber = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if (operations == "-")
				{
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if (operations == "*")
				{
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if (operations == "/")
				{
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if (operations == "%")
				{
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(350, 468, 80, 80);
		frame.getContentPane().add(btnEqual);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
				
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlusMinus.setBounds(220, 468, 80, 80);
		frame.getContentPane().add(btnPlusMinus);

		// -------------------- Row Five -----------------
	}
}
