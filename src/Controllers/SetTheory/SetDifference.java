package Controllers.SetTheory;

/**
 * Class for set difference operation
 */
public class SetDifference implements SetHelper {
    private String result = "";

    @Override
    public String setOperation(String firstSet, String secondSet) {
        int counter = 0;

        for (int i = 0; i < firstSet.length(); i++) {
            for (int j = 0; j < secondSet.length(); j++) {
                if (firstSet.charAt(i) == secondSet.charAt(j)) {
                    counter++;
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
                for (int j = i + 1; j < result.length(); j++) {
                    if (result.charAt(i) == result.charAt(j)) {
                        result = result.substring(0, j) + result.substring(j + 1);

                        i = 0;
                        j = j - 1;
                    }
                }
            }
        }

        // Output

        String display_out = "{ ";

        for (int i = 0; i < result.length(); i++) {
            if (i == result.length() - 1) {
                display_out = display_out + result.charAt(i) + " }";
                break;
            }

            display_out = display_out + result.charAt(i) + ", ";
        }

        return  display_out;
    }
}