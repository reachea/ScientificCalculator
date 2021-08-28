package Controllers.SetTheoryHandlers;

import Controllers.SetTheory.SetDifference;
import Controllers.SetTheory.SetIntersection;
import Controllers.SetTheory.SetUnion;
import Views.SetTheoryContainer.SetTheoryBottomRightContainer;
import Views.SetTheoryContainer.SetTheoryLeftContainer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetRunHandler implements ActionListener {
    // Frequently used Color
    protected Color displayColor = new Color(67, 82, 109);
    protected Color warningColor = new Color(255, 127, 127);

    // Components
    SetTheoryLeftContainer setTheoryLeftContainer;
    SetTheoryBottomRightContainer setTheoryBottomRightContainer;
    SetUnion setUnion;
    SetIntersection setIntersection;
    SetDifference setDifference;

    public SetRunHandler(SetTheoryLeftContainer _setTheoryLeftContainer, SetTheoryBottomRightContainer _setTheoryBottomRightContainer, SetUnion _setUnion, SetIntersection _setIntersection, SetDifference _setDifference) {
        setTheoryLeftContainer = _setTheoryLeftContainer;
        setTheoryBottomRightContainer = _setTheoryBottomRightContainer;
        setUnion = _setUnion;
        setIntersection = _setIntersection;
        setDifference = _setDifference;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = setTheoryLeftContainer.chooseTheory.getSelectedItem().toString();

        String firstInput = setTheoryLeftContainer.firstInput.getText();
        String secondInput = setTheoryLeftContainer.secondInput.getText();

        if (choice.equals("union")) {
            setTheoryBottomRightContainer.setTheoryOutput.setText(setUnion.setOperation(firstInput, secondInput));
        } else if (choice.equals("intersection")) {
            setTheoryBottomRightContainer.setTheoryOutput.setText(setIntersection.setOperation(firstInput, secondInput));
        } else if (choice.equals("difference")) {
            setTheoryBottomRightContainer.setTheoryOutput.setText(setDifference.setOperation(firstInput, secondInput));
        }
    }
}
