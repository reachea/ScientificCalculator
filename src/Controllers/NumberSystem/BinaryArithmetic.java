package Controllers.NumberSystem;

/**
 * Binary Arithmetic Class that consist of wide ranges of methods to perform binary arithmetic operation.
 */
public class BinaryArithmetic extends NumberSystem {


    /**
     * @param first_binary  the argument for the first binary input
     * @param second_binary the argument for the second binary input
     * @return the result from adding both binary input
     */
    public long binaryAdd(long first_binary, long second_binary) {
        // init answer variable
        long ans = 0;

        // Using recursion logic to get the amount of index in both binary input
        int cnt1 = getLoopNumber(first_binary, 10);
        int cnt2 = getLoopNumber(second_binary, 10);

        // init necessary variables
        long remainder1 = first_binary;
        long remainder2 = second_binary;
        int counter = 0;
        long mod_1;
        long mod_2;

        // Checking where the first input is bigger than the second input
        if (cnt1 > cnt2) {
            for (int i = 0; i <= cnt1; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for further process
                if ((mod_1 + mod_2 + counter) == 3) {
                    ans = ans + pow(10, i);
                    counter = 1;
                } else if ((mod_1 + mod_2 + counter) == 2) {
                    counter = 1;
                } else {
                    ans = ans + ((mod_1 + mod_2 + counter) * pow(10, i));
                    counter = 0;
                }
            }
        }
        // Run when the second input is bigger than the first input
        else {
            for (int i = 0; i <= cnt2; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for further process
                if ((mod_1 + mod_2 + counter) == 3) {
                    ans = ans + pow(10, i);
                    counter = 1;
                } else if ((mod_1 + mod_2 + counter) == 2) {
                    counter = 1;
                } else {
                    ans = ans + ((mod_1 + mod_2 + counter) * pow(10, i));
                    counter = 0;
                }
            }
        }

        // Return added number
        return ans;
    }


    /**
     * @param first_binary  the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from addition of first binary input and second binary input
     */
    public String addWith2ndComplement(long first_binary, long second_binary) {
        long added_binary = binaryAdd(first_binary, second_binary);


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ans = "00000000000000000000000000000000" + added_binary;

        int subStringStart = ans.length() - 32;

        return ans.substring(subStringStart);
    }


    /**
     * @param first_binary  the first argument for first binary input
     * @param second_binary the second argument for second binary input
     * @return the result from subtraction of first binary input and second binary input
     */
    public String subtractWith2ndComplement(long first_binary, long second_binary) {
        BinaryComplement binaryComplement = new BinaryComplement(this);

        long second_combinary = binaryComplement.secondComplement(second_binary);


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ansPos = "00000000000000000000000000000000";


        // Since Long doesn't support 32digits of length we are going to use string as replacement
        String ansNeg = "11111111111111111111111111111111";

        long cnt1 = getLoopNumber(first_binary, 10);
        long cnt2 = getLoopNumber(second_binary, 10);

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
     * @param first_binary  the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from subtract both binary input
     */
    public long binarySubtraction(long first_binary, long second_binary) {
        // init answer variable
        long ans = 0;

        // Using recursion logic to get amount of index in both binary input
        int cnt1 = getLoopNumber(first_binary, 10);
        int cnt2 = getLoopNumber(second_binary, 10);

        // init necessary variable
        long remainder1 = first_binary;
        long remainder2 = second_binary;
        int counter = 0;
        long mod_1;
        long mod_2;

        // check whether the first input is bigger than the second
        if (cnt1 > cnt2) {
            for (int i = 0; i <= cnt1; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for subtraction process
                if ((mod_1 + counter) == mod_2) {
                    counter = 0;
                } else if ((mod_1 + counter) == 1 && mod_2 == 0) {
                    counter = 0;
                    ans = ans + pow(10, i);
                } else if ((mod_1 + counter) == 0 && mod_2 == 1) {
                    counter = -1;
                    ans = ans + pow(10, i);
                } else if ((mod_1 + counter) == -1 && mod_2 == 1) {
                    counter = -1;
                } else {
                    counter = -1;
                    ans = ans + pow(10, i);
                }
            }
        }
        // run when the second variable is bigger
        else {

            // Answer using normal operation
            for (int i = 0; i < cnt2; i++) {
                // init variables for holder
                mod_1 = remainder1 % 10;
                mod_2 = remainder2 % 10;
                remainder1 = remainder1 / 10;
                remainder2 = remainder2 / 10;

                // Checking condition for subtraction process
                if ((mod_1 + counter) == mod_2) {
                    counter = 0;
                } else if ((mod_1 + counter) == 1 && mod_2 == 0) {
                    counter = 0;
                    ans = ans + pow(10, i);
                } else if ((mod_1 + counter) == 0 && mod_2 == 1) {
                    counter = -1;
                    if (first_binary <= pow(10, i)) {
                        System.out.println("Index " + (i + 1) + " is negative represent as: (-1) or (1)");
                        counter = 0;
                    }

                    ans = ans + pow(10, i);
                } else if ((mod_1 + counter) == -1 && mod_2 == 0) {
                    counter = -1;
                    if (first_binary <= pow(10, i)) {
                        System.out.println("Index " + (i + 1) + " is negative represent as: (-1) or (1)");
                        counter = 0;
                    }

                    ans = ans + pow(10, i);
                } else if ((mod_1 + counter) == -1 && mod_2 == 1) {
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
     * @param first_binary  the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from binary multiplication
     */
    public long binaryMultiple(long first_binary, long second_binary) {
        int cnt = 0;
        long cnt1 = getLoopNumber(first_binary, 10);
        long cnt2 = getLoopNumber(second_binary, 10);

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
     * @param first_binary  the argument for first binary input
     * @param second_binary the argument for second binary input
     * @return the result from binary division
     */
    public long binaryDivision(long first_binary, long second_binary) {

        long quotient = 0;
        long remainder = 0;
        long temp;
        int cnt = getLoopNumber(first_binary, 10);
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
