package Controllers;

import Controllers.BasicArithmeticButtons.*;
import Controllers.BasicOperation.*;
import Models.BasicOperationModel;
import Views.BasicOperationContainer.*;
import Views.BasicOperationView;

public class BasicOperationController {
    private BasicOperationModel basicOperationModel;
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected BasicOperationBottomRightContainer basicOperationBottomRightContainer;

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
        basicOperationBottomRightContainer = _basicOperationView.basicOperationBottomRightContainer;

        basicOperationLeftContainerView.addPlusButtonHandler(new PlusButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addMinusBtnHandler(new MinusButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addMultipleButtonHandler(new MultipleButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addDivideButtonHandler(new DivideButtonHandler(basicOperationLeftContainerView, arithmetic));
        basicOperationLeftContainerView.addEqualButtonHandler(new EqualButtonHandler(basicOperationLeftContainerView, arithmetic));

    }
}