package Controllers.BasicArithmeticButtons;

import Controllers.BasicOperation.Arithmetic;
import Views.BasicOperationContainer.BasicOperationLeftContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleButtonHandler implements ActionListener {
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected Arithmetic arithmetic;

    public MultipleButtonHandler(BasicOperationLeftContainer _basicOperationLeftContainerView, Arithmetic _arithmetic) {
        basicOperationLeftContainerView = _basicOperationLeftContainerView;
        arithmetic = _arithmetic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
        String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
        String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

        if (basicArithmeticOperation.length() == 0) {
            basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResultHolder + " *" + " ...");
            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            return;
        }

        if (checkEqualSign(basicArithmeticOperation)) {
            basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " *" + " ...");
            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            return;
        }

        if (basicArithmeticResultHolder.equals("0")) {
            return;
        }

        String result = Double.toString(arithmetic.multiply(Double.parseDouble(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 6)), Double.parseDouble(basicArithmeticResultHolder)));
        basicOperationLeftContainerView.setBasicArithmeticResult(result);
        result = result.concat(" *");
        basicOperationLeftContainerView.setBasicArithmeticOperation(result + " ...");

        basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
    }

    // check for equal sign
    public boolean checkEqualSign(String input) {
        String sign = input.substring(input.length() - 1);
        return sign.equals("=");
    }
}
