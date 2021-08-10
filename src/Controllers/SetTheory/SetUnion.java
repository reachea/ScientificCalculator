package Controllers.SetTheory;

/**
 * Class for set union operation
 */
public class SetUnion implements SetHelper {
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
                for (int j = i + 1; j < result.length(); j++) {
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
