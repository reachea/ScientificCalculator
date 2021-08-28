package Controllers.BasicArithmeticHandlers;

import Controllers.BasicOperation.Trigonometric;
import Views.BasicOperationContainer.BasicOperationLeftContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrigonometricFunctionHandler implements ActionListener {
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected Trigonometric trigonometric;

    public TrigonometricFunctionHandler(BasicOperationLeftContainer _basicOperationLeftContainerView, Trigonometric _trigonometric) {
        basicOperationLeftContainerView = _basicOperationLeftContainerView;
        trigonometric = _trigonometric;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) basicOperationLeftContainerView.trigonometryFunction.getSelectedItem();
        String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
        String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

        String result = "";

        switch (selected) {
            case "sin":
                result = Double.toString(trigonometric.sin(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
            case "sind":
                result = Double.toString(trigonometric.sind(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
            case "cos":
                result = Double.toString(trigonometric.cos(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
            case "cosd":
                result = Double.toString(trigonometric.cosd(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
            case "tan":
                result = Double.toString(trigonometric.tan(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
            case "tand":
                result = Double.toString(trigonometric.tand(Double.parseDouble(basicArithmeticResult)));
                basicOperationLeftContainerView.setBasicArithmeticResult(result);
                basicOperationLeftContainerView.setBasicArithmeticResultHolder(result);
                break;
        }
    }
}
