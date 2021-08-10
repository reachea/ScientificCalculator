package Controllers.NumberSystem;

public class NumberSystem {

    /**
     * @param binary the argument for binary input
     * @return the result from analyze the input
     */
    public boolean isValidBinary(String binary) {
        String valid_binary = "01";

        for (int i = 0; i < binary.length(); i++) {
            if (valid_binary.indexOf(binary.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * @param octal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidOctal(String octal) {
        String valid_octal = "01234567";

        for (int i = 0; i < octal.length(); i++) {
            if (valid_octal.indexOf(octal.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * @param decimal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidDecimal(String decimal) {
        String valid_decimal = "0123456789";

        for (int i = 0; i < decimal.length(); i++) {
            if (valid_decimal.indexOf(decimal.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * @param hexadecimal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidHex(String hexadecimal) {
        String valid_decimal = "0123456789ABCDEF";

        hexadecimal = hexadecimal.toUpperCase();

        for (int i = 0; i < hexadecimal.length(); i++) {
            if (valid_decimal.indexOf(hexadecimal.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * @param number the argument for input number
     * @return the result for the number of digit
     */
    protected int getLoopNumber(long number, int divisor) {
        int cnt = 0;

        while (number != 0) {
            cnt += 1;
            number /= divisor;
        }

        return cnt;
    }


    /**
     * @param base_number the argument for base number
     * @param exponential the argumant for exponential
     * @return the result from power operation
     */
    protected int pow(int base_number, int exponential) {
        int holder = base_number;

        if (exponential == 0) {
            return 1;
        }

        while (exponential != 1) {
            base_number *= holder;
            exponential -= 1;
        }

        return base_number;
    }
}
