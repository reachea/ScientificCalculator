package Controllers;
import Controllers.SetTheory.*;
import Controllers.SetTheoryHandlers.SetRunHandler;
import Models.SetTheoryModel;
import Views.SetTheoryContainer.*;
import Views.SetTheoryView;

import java.util.ArrayList;

public class SetTheoryController {
    private SetTheoryModel setTheoryModel;
    private SetTheoryLeftContainer setTheoryLeftContainer;
    private SetTheoryBottomRightContainer setTheoryBottomRightContainer;

    // Operation and Functionalities

    private SetUnion setUnion = new SetUnion();
    private SetIntersection setIntersection = new SetIntersection();
    private SetDifference setDifference = new SetDifference();

    public SetTheoryController(SetTheoryModel _setTheoryModel, SetTheoryView _setTheoryView) {
        setTheoryModel = _setTheoryModel;
        setTheoryLeftContainer = _setTheoryView.setTheoryLeftContainer;
        setTheoryBottomRightContainer = _setTheoryView.setTheoryBottomRightContainer;

        setTheoryLeftContainer.addSetRunHandler(new SetRunHandler(setTheoryLeftContainer, setTheoryBottomRightContainer, setUnion, setIntersection, setDifference));
    }
}


