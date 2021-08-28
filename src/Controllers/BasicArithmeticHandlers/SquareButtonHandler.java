package Controllers.BasicArithmeticHandlers;
import Controllers.BasicOperation.Trigonometric;
import Views.BasicOperationContainer.BasicOperationLeftContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareButtonHandler implements ActionListener {
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected Trigonometric trigonometric;

    public SquareButtonHandler(BasicOperationLeftContainer _basicOperationLeftContainerView, Trigonometric _trigonometric) {
        basicOperationLeftContainerView = _basicOperationLeftContainerView;
        trigonometric = _trigonometric;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();

        String result = Double.toString(trigonometric.square2(Double.parseDouble(basicArithmeticResult)));
        basicOperationLeftContainerView.setBasicArithmeticResult(result);
        basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
    }
}
