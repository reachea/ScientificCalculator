package Controllers;

import Models.NumberSystemModel;

public class NumberSystemController {
    private Binary binary = new Binary();
    private Octal octal = new Octal();
    private Decimal decimal = new Decimal();
    private Hexadecimal hexadecimal = new Hexadecimal();

    private BinaryArithmetic binaryArithmetic = new BinaryArithmetic();

    private NumberSystemModel numberSystemModel = new NumberSystemModel();

}


class NumberSystem {

    /**
     *
     * @param binary the argument for binary input
     * @return the result from analyze the input
     */
    public boolean isValidBinary (String binary) {
        String valid_binary = "01";

        for (int i = 0; i < binary.length(); i++) {
            if (valid_binary.indexOf(binary.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     *
     * @param octal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidOctal (String octal) {
        String valid_octal = "01234567";

        for (int i = 0; i < octal.length(); i++) {
            if (valid_octal.indexOf(octal.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     *
     * @param decimal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidDecimal (String decimal) {
        String valid_decimal = "0123456789";

        for (int i = 0; i < decimal.length(); i++) {
            if (valid_decimal.indexOf(decimal.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }


    /**
     *
     * @param hexadecimal the argument for octal input
     * @return the result from analyze the input
     */
    public boolean isValidHex (String hexadecimal) {
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
     *
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
     *
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


/**
 * Binary class for handling all conversions performance from binary
 */
class Binary extends NumberSystem {


    /**
     *
     * @param binary the argument for binary input
     * @return the result from converting binary to decimal
     */
    public long binary2Decimal(long binary) {
        int cnt = super.getLoopNumber(binary, 10);


        // Logic for converting binary to decimal
        long ans = 0;
        for (int i = 0; i < cnt; i++) {
            if (binary % 10 == 1) {
                ans += pow(2, i);
            }

            binary /= 10;
        }

        return ans;
    }


    /**
     *
     * @param binary the argument for binary input
     * @return the result from converting binary to octal
     */
    public long binary2Octal(long binary) {
        int cnt = getLoopNumber(binary, 1000);

        // Logic for converting binary to octal
        long ans = 0;
        for (int i = 0; i < cnt; i++) {
            ans = ans + (binary2Decimal(binary % 1000) * pow(10, i));

            binary /= 1000;
        }

        return ans;
    }


    /**
     *
     * @param binary the argument for binary input
     * @return the result from converting binary to hexadecimal
     */
    public String binary2Hex(long binary) {
        String hexa = "0123456789ABCDEF";
        int cnt = getLoopNumber(binary, 10000);

        // Logic for converting binary to hexadecimal
        String ans = "";
        for (int i = 0; i< cnt; i ++) {
            ans = hexa.charAt((int) binary2Decimal(binary % 10000)) + ans;

            binary /= 10000;
        }

        return ans;
    }
}


/**
 * Octal class for handling all conversions performance from octal
 */
class Octal extends NumberSystem {


    /**
     *
     * @param octal the argument for octal input
     * @return the result from converting octal to decimal
     */
    public long octal2Decimal(long octal) {
        int cnt = getLoopNumber(octal, 10);

        // Logic for converting octal to decimal
        long ans = 0;
        for (int i = 0; i < cnt; i ++) {
            ans = ans + ((octal % 10) * pow(8, i));

            octal /= 10;
        }

        return ans;
    }


    /**
     *
     * @param octal the argument for octal input
     * @return the result from converting octal to binary
     */
    public long octal2Binary(long octal) {
        int cnt = getLoopNumber(octal, 10);

        // Logic for converting octal to binary
        long ans = 0;
        long secondary = 0;
        for (int i = 0; i < cnt; i ++) {
            long hold = octal % 10;
            int cn = getLoopNumber(hold, 2);
            for (int j = 0; j < cn; j++ ) {
                if (hold % 2 == 1) {
                    secondary += pow(10, j);
                }

                hold /= 2;
            }

            ans += secondary * pow(1000, i);
            secondary = 0;
            octal /= 10;
        }

        return  ans;
    }


    /**
     *
     * @param octal the argument for octal input
     * @return the result from converting octal to hexadecimal
     */
    public String octal2Hex(long octal) {
        long bin = octal2Binary(octal);

        Binary binary = new Binary();

        return binary.binary2Hex(bin);
    }
}


/**
 * Decimal class for handling all conversions performance from decimal
 */
class Decimal extends NumberSystem {


    /**
     *
     * @param decimal the argument for decimal input
     * @return the result from converting decimal to binary
     */
    public long decimal2Binary(long decimal) {
        long ans = 0;
        int cnt = getLoopNumber(decimal, 2);

        for (int i = 0; i < cnt; i++) {
            if (decimal % 2 == 1) {
                ans += pow(10, i);
            }

            decimal /= 2;
        }

        return ans;
    }


    /**
     *
     * @param decimal the argument for decimal input
     * @return the result from converting decimal to octal
     */
    public long decimal2Octal(long decimal) {
        long ans = 0;
        int cnt = getLoopNumber(decimal, 8);

        for (int i = 0; i < cnt; i++) {
            ans += (decimal % 8) * pow(10, i);

            decimal /= 8;
        }

        return ans;
    }


    /**
     *
     * @param decimal the argument for decimal input
     * @return the result from converting decimal to hexadecimal
     */
    public String decimal2Hex(long decimal) {
        String hex = "0123456789ABCDEF";
        String ans = "";

        while (decimal > 0) {
            ans = hex.charAt((int )decimal % 16) + ans;

            decimal /= 16;
        }

        return ans;
    }
}


/**
 * Hexadecimal class for handling all conversions performance from hexadecimal
 */
class Hexadecimal extends NumberSystem {


    /**
     *
     * @param hex the argument for hexadecimal input
     * @return the result from converting hexadecimal to decimal
     */
    public long hex2Decimal (String hex) {
        String hexa = "0123456789ABCDEF";
        int cnt = hex.length() - 1;
        hex = hex.toUpperCase();
        long ans = 0;

        for (int i = 0; i < hex.length(); i++) {
            ans += ((long) (hexa.indexOf(hex.charAt(i))) * pow(16, cnt));

            cnt--;
        }

        return ans;
    }


    /**
     *
     * @param hex the argument for hexadecimal input
     * @return the result from converting hexadecimal to binary
     */
    public long hex2Binary (String hex) {
        // converting hex to decimal
        long decimal = hex2Decimal(hex);

        // converting decimal to binary
        long ans = 0;
        int cnt = getLoopNumber(decimal, 2);
        for (int i = 0; i < cnt; i++) {
            if (decimal % 2 == 1) {
                ans += pow(10, i);
            }

            decimal /= 2;
        }

        return ans;
    }


    /**
     *
     * @param hex the arugment for hexadecimal input
     * @return the result from converting hexadecimal to octal
     */
    public long hex2Octal (String hex) {
        // converting hex to decimal
        long decimal = hex2Decimal(hex);

        // converting decimal to octal
        long ans = 0;
        int cnt = getLoopNumber(decimal, 8);
        for (int i = 0; i < cnt; i++) {
            ans += (decimal % 8) * pow(10, i);

            decimal /= 8;
        }

        return ans;
    }
}


/**
 * Binary Arithmetic Class that consist of wide ranges of methods to perform binary arithmetic operation.
 */
class BinaryArithmetic extends NumberSystem {


    /**
     * Nested class for binary complement
     */
    public class BinaryComplement {

        /**
         *
         * @param binary the argument for binary input
         * @return the result after convert binary to first complement
         */
        public long findFirstComplement (long binary) {
            // init complement binary variable
            long co_binary = 0;

            // create binaryArithmetic object
            BinaryArithmetic binaryArithmetic = new BinaryArithmetic();

            // Using recursion logic to get the amount of index
            int cnt = binaryArithmetic.getLoopNumber(binary, 0);

            // Logic to the first complement binary
            long remainder = binary;
            long mod;
            for (int i = 0; i < cnt; i ++) {
                mod = remainder % 10;
                remainder = remainder / 10;

                if (mod == 0) {
                    co_binary = co_binary + binaryArithmetic.pow(10, i);
                }
            }

            // Return first complement binary
            return co_binary;
        }


        /**
         *
         * @param binary the argument for binary input
         * @return the result from second complement conversion
         */
        public long secondComplement (long binary) {
            // convert binary to first complement
            long firstComplement = findFirstComplement(binary);

            // getting second complement
            long ans = binaryAdd(firstComplement, 1);

            // return second complement number
            return ans;
        }
    }


    /**
     *
     * @param first_binary the argument for the first binary input
     * @param second_binary the argument for the second binary input
     * @return the result from adding both binary input
     */
    public long binaryAdd(long first_binary, long second_binary) {
        // init answer variable
        long ans = 0;

        // Using recursion logic to get the amount of index in both binary input
        int cnt1 = getLoopNumber(first_binary, 0);
        int cnt2 = getLoopNumber(second_binary, 0);

        // init necessary variables
        long remainder1 = first_binary;
        long remainder2 = second_binary;
        int counter = 0;
        long mod_1;
        long mod_2;

        // Checking where the first input is bigger than the second input
        if (cnt1 > cnt2) {
            for (int i=0; i <= cnt1; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for further process
                if ((mod_1 + mod_2 + counter) == 3) {
                    ans = ans + pow(10, i);
                    counter = 1;
                }
                else if ((mod_1 + mod_2 + counter) == 2) {
                    counter = 1;
                }
                else {
                    ans = ans + ((mod_1 + mod_2 + counter) * pow(10, i));
                    counter = 0;
                }
            }
        }
        // Run when the second input is bigger than the first input
        else {
            for (int i=0; i <= cnt2; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for further process
                if ((mod_1 + mod_2 + counter) == 3) {
                    ans = ans + pow(10, i);
                    counter = 1;
                }
                else if ((mod_1 + mod_2 + counter) == 2) {
                    counter = 1;
                }
                else {
                    ans = ans + ((mod_1 + mod_2 + counter) * pow(10, i));
                    counter = 0;
                }
            }
        }

        // Return added number
        return ans;
    }


    /**
     *
     * @param first_binary the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from addition of first binary input and second binary input
     */
    public String addWith2ndComplement (long first_binary, long second_binary) {
        long added_binary = binaryAdd(first_binary, second_binary);


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ans = "00000000000000000000000000000000" + added_binary;

        int subStringStart = ans.length() - 32;

        return ans.substring(subStringStart);
    }


    /**
     *
     * @param first_binary the first argument for first binary input
     * @param second_binary the second argument for second binary input
     * @return the result from subtraction of first binary input and second binary input
     */
    public String subtractWith2ndComplement (long first_binary, long second_binary) {
        BinaryComplement binaryComplement = new BinaryComplement();

        long second_combinary = binaryComplement.secondComplement(second_binary);


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ansPos = "00000000000000000000000000000000";


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ansNeg = "11111111111111111111111111111111";

        long cnt1 = getLoopNumber(first_binary, 0);
        long cnt2 = getLoopNumber(second_binary, 0);

        if (cnt1 > cnt2) {

            for (long i = cnt2; i < cnt1; i++) {
                second_combinary = second_combinary + pow(10, (int) i);
            }
        }

        long ans = binaryAdd(first_binary, second_combinary);

        if (first_binary < second_binary) {
            ansNeg = ansNeg + ans;

            return ansNeg.substring(ansNeg.length() - 32);
        }

        ans = ans % pow(10, (int) cnt1);

        ansPos = ansPos + ans;

        return ansPos.substring(ansPos.length() - 32);
    }


    /**
     *
     * @param first_binary the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from subtract both binary input
     */
    public long binarySubtraction(long first_binary, long second_binary) {
        // init answer variable
        long ans = 0;

        // Using recursion logic to get amount of index in both binary input
        int cnt1 = getLoopNumber(first_binary, 0);
        int cnt2 = getLoopNumber(second_binary, 0);

        // init necessary variable
        long remainder1 = first_binary;
        long remainder2 = second_binary;
        int counter = 0;
        long mod_1;
        long mod_2;

        // check whether the first input is bigger than the second
        if (cnt1 > cnt2) {
            for (int i=0; i <= cnt1; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for subtraction process
                if ((mod_1 + counter) == mod_2) {
                    counter = 0;
                }
                else if ((mod_1 + counter) == 1 && mod_2 == 0) {
                    counter = 0;
                    ans = ans + pow(10, i);
                }
                else if ((mod_1 + counter) == 0 && mod_2 == 1) {
                    counter = -1;
                    ans = ans + pow(10, i);
                }
                else if ((mod_1 + counter) == -1 && mod_2 == 1) {
                    counter = -1;
                }
                else {
                    counter = -1;
                    ans = ans + pow(10,i);
                }
            }
        }
        // run when the second variable is bigger
        else {

            // Answer using normal operation
            for (int i=0; i < cnt2; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for subtraction process
                if ((mod_1 + counter) == mod_2) {
                    counter = 0;
                }
                else if ((mod_1 + counter) == 1 && mod_2 == 0) {
                    counter = 0;
                    ans = ans + pow(10, i);
                }
                else if ((mod_1 + counter) == 0 && mod_2 == 1) {
                    counter = -1;
                    if (first_binary <= pow(10, i)) {
                        System.out.println("Index " + (i + 1) + " is negative represent as: (-1) or (1)");
                        counter = 0;
                    }

                    ans = ans + pow(10, i);
                }
                else if ((mod_1 + counter) == -1 && mod_2 == 0) {
                    counter = -1;
                    if (first_binary <= pow(10, i)) {
                        System.out.println("Index " + (i + 1) + " is negative represent as: (-1) or (1)");
                        counter = 0;
                    }

                    ans = ans + pow(10, i);
                }
                else if ((mod_1 + counter) == -1 && mod_2 == 1) {
                    counter = -1;
                    if (first_binary <= pow(10, i)) {
                        System.out.println("Index " + (i + 1) + " is negative represent as: (-1) or (1)");
                        counter = 0;
                    }
                    ans = ans + pow(10, i);
                }
            }
        }

        // Return subtracted binary answer
        return ans;
    }


    /**
     *
     * @param first_binary the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from binary multiplication
     */
    public long binaryMultiple (long first_binary, long second_binary) {
        int cnt = 0;
        long cnt1 = getLoopNumber(first_binary, 0);
        long cnt2 = getLoopNumber(second_binary, 0);

        long remainder1;
        long remainder2 = second_binary;
        long holder1;
        long holder2;
        long tempt = 0;
        long ans = 0;

        for (int i = 0; i < cnt2; i++) {
            holder2 = remainder2 % 10;
            remainder2 = remainder2 / 10;

            remainder1 = first_binary;


            for (int j = 0; j < cnt1; j++) {
                holder1 = remainder1 % 10;
                remainder1 = remainder1 / 10;

                if (!(holder1 == 0 || holder2 == 0)) {
                    ans = (ans + pow(10, j));
                }



            }

            ans = ans * pow(10, cnt);
            tempt = binaryAdd(tempt, ans);

            ans = 0;
            cnt++;
        }

        return tempt;
    }


    /**
     *
     * @param first_binary the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from binary division
     */
    public long binaryDivision (long first_binary, long second_binary) {

        long quotient = 0;
        long remainder = 0;
        long temp;
        int cnt = getLoopNumber(first_binary, 0);
        int loop = cnt - 1;

        if (second_binary > first_binary) {
            return 0;
        }

        for (int i = 0; i < cnt; i++) {

            temp = (first_binary / pow(10, loop)) % pow(10, 1);

            if (temp == 0) {
                remainder = remainder * 10;
            } else {
                remainder = (remainder * 10) + temp;
            }

            if (remainder >= second_binary) {
                quotient = (quotient * 10) + 1;

                remainder = binarySubtraction(remainder, second_binary);
            } else {
                quotient = quotient * 10;
            }

            loop--;
        }

        return quotient;
    }

}