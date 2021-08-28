package Controllers;

import Controllers.NumberSystem.*;
import Controllers.NumberSystemHandlers.*;
import Models.NumberSystemModel;
import Views.NumberSystemContainer.*;
import Views.NumberSystemView;

public class NumberSystemController {
    private NumberSystemModel numberSystemModel;
    private NumberSystemLeftContainer numberSystemLeftContainer;
    private NumberSystemBottomRightContainer numberSystemBottomRightContainer;

    // Operation and functionalities
    private NumberSystem numberSystem = new NumberSystem();
    private Binary binary = new Binary();
    private Octal octal = new Octal();
    private Decimal decimal = new Decimal();
    private Hexadecimal hexadecimal = new Hexadecimal();
    private BinaryArithmetic binaryArithmetic = new BinaryArithmetic();
    private BinaryComplement binaryComplement = new BinaryComplement(binaryArithmetic);

    public NumberSystemController(NumberSystemModel _numberSystemModel, NumberSystemView _numberSystemView) {
        numberSystemModel = _numberSystemModel;
        numberSystemLeftContainer = _numberSystemView.numberSystemLeftContainer;
        numberSystemBottomRightContainer = _numberSystemView.numberSystemBottomRightContainer;

        numberSystemLeftContainer.addNumberSystemConverterHandler(new NumberSystemConverterHandler(numberSystemLeftContainer, numberSystem, binary, octal, decimal, hexadecimal));

        // Bottom Right Container
        numberSystemBottomRightContainer.addBinaryArithmeticSumHandler(new BinaryArithmeticSumHandler(numberSystemBottomRightContainer, numberSystem, binaryArithmetic));
        numberSystemBottomRightContainer.addBinaryArithmeticMinusHandler(new BinaryArithmeticMinusHandler(numberSystemBottomRightContainer, numberSystem, binaryArithmetic));
        numberSystemBottomRightContainer.addBinaryArithmeticMultipleHandler(new BinaryArithmeticMultipleHandler(numberSystemBottomRightContainer, numberSystem, binaryArithmetic));
        numberSystemBottomRightContainer.addBinaryArithmeticDivisionHandler(new BinaryArithmeticDivisionHandler(numberSystemBottomRightContainer, numberSystem, binaryArithmetic));
        numberSystemBottomRightContainer.addBinaryArithmeticComplementHandler(new BinaryArithmeticComplementHandler(numberSystemBottomRightContainer, numberSystem, binaryComplement));
    }
}


