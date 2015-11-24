package Basic_MVC;

public class CalculatorMVC {
	
	public static void main (String[] args) {
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController control = new CalculatorController(model, view);
		
		view.setVisible(true);
	}
}
