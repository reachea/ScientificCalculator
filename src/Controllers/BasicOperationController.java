package Controllers;

import Controllers.BasicArithmeticButtons.*;
import Controllers.BasicOperation.*;
import Models.BasicOperationModel;
import Views.BasicOperationLeftContainer;
import Views.BasicOperationView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicOperationController {
    private BasicOperationModel basicOperationModel;
    protected BasicOperationLeftContainer basicOperationLeftContainerView;

    // Operation and functionalities
    private Arithmetic arithmetic = new Arithmetic();
    private Bitwise bitwise = new Bitwise();
    private MoneyExchange moneyExchange = new MoneyExchange();
    private StorageConverter storageConverter = new StorageConverter();
    private Trigonometric trigonometric = new Trigonometric();

    // Answer Holders

    public BasicOperationController(BasicOperationModel _basicOperationModel, BasicOperationView _basicOperationView) {
        basicOperationModel = _basicOperationModel;
        basicOperationLeftContainerView = _basicOperationView.basicOperationLeftContainer;

        basicOperationLeftContainerView.addPlusButtonHandler(new PlusButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addMinusBtnHandler(new MinusButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addEqualButtonHandler(new EqualButtonHandler(basicOperationLeftContainerView, arithmetic));
    }
}