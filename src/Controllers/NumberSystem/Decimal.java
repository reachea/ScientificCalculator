package Controllers.NumberSystem;

/**
 * Decimal class for handling all conversions performance from decimal
 */
public class Decimal extends NumberSystem {


    /**
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
     * @param decimal the argument for decimal input
     * @return the result from converting decimal to hexadecimal
     */
    public String decimal2Hex(long decimal) {
        String hex = "0123456789ABCDEF";
        String ans = "";

        while (decimal > 0) {
            ans = hex.charAt((int) decimal % 16) + ans;

            decimal /= 16;
        }

        return ans;
    }
}
