package Controllers;
import Controllers.SetTheory.*;
import Models.SetTheoryModel;
import Views.SetTheoryContainer.*;
import Views.SetTheoryView;

import java.util.ArrayList;

public class SetTheoryController {
    private SetTheoryModel setTheoryModel;
    private SetTheoryLeftContainer setTheoryLeftContainer;
    private SetTheoryBottomRightContainer setTheoryBottomRightContainer;

    // Operation and Functionalities
    protected ArrayList<String> sets = new ArrayList<String>();

    private SetUnion setUnion = new SetUnion();
    private SetIntersection setIntersection = new SetIntersection();
    private SetDifference setDifference = new SetDifference();

    public void createSet(String input) {
        sets.add(input);
    };
    public String getSetResult() {
        return setTheoryModel.getSetResult();
    }

    public SetTheoryController(SetTheoryModel _setTheoryModel, SetTheoryView _setTheoryView) {
        setTheoryModel = _setTheoryModel;
        setTheoryLeftContainer = _setTheoryView.setTheoryLeftContainer;
        setTheoryBottomRightContainer = _setTheoryView.setTheoryBottomRightContainer;
    }
}


