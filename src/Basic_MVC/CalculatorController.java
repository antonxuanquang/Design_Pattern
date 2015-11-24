package Basic_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController (CalculatorModel model, CalculatorView view) {
		this.view = view;
		this.model = model;
		
		view.addCalculatorListener(new CalculatorListener());
	}
	
	class CalculatorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int first = view.getFirstValue();
				int second = view.getSecondValue();
				
				int result = model.add(first, second);
				
				view.setResultValue(result);
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("Please input valid values");
			}

			
		}
	}
	
}
