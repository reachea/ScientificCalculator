package Controllers;
import Models.SetTheoryModel;

import java.util.ArrayList;

public class SetTheoryController {
    protected ArrayList<String> sets = new ArrayList<String>();

    private SetUnion setUnion = new SetUnion();
    private SetIntersection setIntersection = new SetIntersection();
    private SetDifference setDifference = new SetDifference();
    private SetTheoryModel setTheoryModel = new SetTheoryModel();

    public void createSet(String input) {
        sets.add(input);
    };
    public String getSetResult() {
        return setTheoryModel.getSetResult();
    }

}

interface SetHelper {
    String setOperation(String firstSet, String secondSet);
}


/**
 * Class for set union operation
 */
class SetUnion implements SetHelper {
    private String result;

    @Override
    public String setOperation(String firstSet, String secondSet) {
        for (int i = 0; i < firstSet.length(); i++) {
            for (int j = 0; j < secondSet.length(); j++) {
                result = result + firstSet.charAt(i);

                if (firstSet.charAt(i) != secondSet.charAt(j)) {
                    result = result + secondSet.charAt(j);
                }
            }
        }


        // filter duplication
        if (result.length() > 0) {
            for (int i = 0; i < result.length(); i++) {
                for (int j = i+1; j < result.length(); j++) {
                    if (result.charAt(i) == result.charAt(j)) {
                        result = result.substring(0, j) + result.substring(j + 1);

                        i = 0;
                        j = j - 1;
                    }
                }
            }
        }

        return  this.result;
    }
}


/**
 * Class for set intersection operation
 */
class SetIntersection implements SetHelper {
    private String result;

    @Override
    public String setOperation(String firstSet, String secondSet) {
        for (int i = 0; i < firstSet.length(); i++) {
            for (int j = 0; j < secondSet.length(); j++) {
                if (firstSet.charAt(i) == secondSet.charAt(j)) {
                    result = result + firstSet.charAt(i);
                }
            }
        }


        // filter duplication
        if (result.length() > 0) {
            for (int i = 0; i < result.length(); i++) {
                for (int j = i+1; j < result.length(); j++) {
                    if (result.charAt(i) == result.charAt(j)) {
                        result = result.substring(0, j) + result.substring(j + 1);

                        i = 0;
                        j = j - 1;
                    }
                }
            }
        }

        return this.result;
    }
}


/**
 * Class for set difference operation
 */
class SetDifference implements SetHelper {
    private String result;

    @Override
    public String setOperation(String firstSet, String secondSet) {
        int counter = 0;

        for (int i = 0; i < firstSet.length(); i++) {
            for (int j = 0; j < secondSet.length(); j++) {
                if (firstSet.charAt(i) == secondSet.charAt(j)) {
                    counter ++;
                }
            }

            if (counter == 0) {
                result = result + firstSet.charAt(i);
            }

            counter = 0;
        }

        // filter duplication
        if (result.length() > 0) {
            for (int i = 0; i < result.length(); i++) {
                for (int j = i+1; j < result.length(); j++) {
                    if (result.charAt(i) == result.charAt(j)) {
                        result = result.substring(0, j) + result.substring(j + 1);

                        i = 0;
                        j = j - 1;
                    }
                }
            }
        }

        return this.result;
    }
}