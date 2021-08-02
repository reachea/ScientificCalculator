package Controllers.BasicArithmeticButtons;

import Controllers.BasicOperation.Arithmetic;
import Views.BasicOperationLeftContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusButtonHandler implements ActionListener {
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected Arithmetic arithmetic;

    public PlusButtonHandler(BasicOperationLeftContainer _basicOperationLeftContainerView, Arithmetic _arithmetic) {
        basicOperationLeftContainerView = _basicOperationLeftContainerView;
        arithmetic = _arithmetic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
        String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
        String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

        if (basicArithmeticOperation.length() == 0) {
            basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResultHolder + " +" + " ...");
            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            return;
        }

        if (checkEqualSign(basicArithmeticOperation)) {
            basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " +" + " ...");
            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            return;
        }

        if (basicArithmeticResultHolder.equals("0")) {
            return;
        }

        String result = Integer.toString(arithmetic.sum(Integer.parseInt(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 6)), Integer.parseInt(basicArithmeticResultHolder)));
        basicOperationLeftContainerView.setBasicArithmeticResult(result);
        result = result.concat(" +");
        basicOperationLeftContainerView.setBasicArithmeticOperation(result + " ...");

        basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
    }

    // check for equal sign
    public boolean checkEqualSign(String input) {
        String sign = input.substring(input.length() - 1);
        return sign.equals("=");
    }
}