package Basic_MVC;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Theme.QButton;
import Theme.QLabel;
import Theme.QTextField;

public class CalculatorView extends JFrame{
	
	private QTextField first, second, result;
	private QLabel plus;
	private QButton calculate;
	private JPanel panel;
	
	public CalculatorView () {
		 setUpViews();
	}

	private void setUpViews() {
		panel = new JPanel ();
		
		first = new QTextField(10);
		second = new QTextField(10);
		result = new QTextField(10);
		
		plus = new QLabel("+");
		
		calculate = new QButton ("Calculate");
		
		panel.add(first);
		panel.add(plus);
		panel.add(second);
		panel.add(calculate);
		panel.add(result);
		
		add(panel);
		setBounds(100, 100, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	int getFirstValue() {
		return Integer.parseInt(first.getText());
	}
	
	int getSecondValue() {
		return Integer.parseInt(second.getText());
	}
	
	void setResultValue(int value) {
		result.setText("" + value);
	}
	
	void addCalculatorListener(ActionListener listener) {
		calculate.addActionListener(listener);
	}
	
	void displayErrorMessage(String error) {
		JOptionPane.showMessageDialog(this, error);
	}
}
