package Controllers;

import Controllers.NumberSystem.*;
import Models.NumberSystemModel;
import Views.NumberSystemContainer.*;
import Views.NumberSystemView;

public class NumberSystemController {
    private NumberSystemModel numberSystemModel;
    private NumberSystemLeftContainer numberSystemLeftContainer;
    private NumberSystemBottomRightContainer numberSystemBottomRightContainer;

    // Operation and functionalities
    private Binary binary = new Binary();
    private Octal octal = new Octal();
    private Decimal decimal = new Decimal();
    private Hexadecimal hexadecimal = new Hexadecimal();
    private BinaryArithmetic binaryArithmetic = new BinaryArithmetic();

    public NumberSystemController(NumberSystemModel _numberSystemModel, NumberSystemView _numberSystemView) {
        numberSystemModel = _numberSystemModel;
        numberSystemLeftContainer = _numberSystemView.numberSystemLeftContainer;
        numberSystemBottomRightContainer = _numberSystemView.numberSystemBottomRightContainer;
    }
}


