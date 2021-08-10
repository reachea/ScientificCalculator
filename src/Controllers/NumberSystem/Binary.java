package Controllers.NumberSystem;

/**
 * Binary class for handling all conversions performance from binary
 */
public class Binary extends NumberSystem {


    /**
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
     * @param binary the argument for binary input
     * @return the result from converting binary to hexadecimal
     */
    public String binary2Hex(long binary) {
        String hexa = "0123456789ABCDEF";
        int cnt = getLoopNumber(binary, 10000);

        // Logic for converting binary to hexadecimal
        String ans = "";
        for (int i = 0; i < cnt; i++) {
            ans = hexa.charAt((int) binary2Decimal(binary % 10000)) + ans;

            binary /= 10000;
        }

        return ans;
    }
}
