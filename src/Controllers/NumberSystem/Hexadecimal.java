package Controllers.NumberSystem;

/**
 * Hexadecimal class for handling all conversions performance from hexadecimal
 */
public class Hexadecimal extends NumberSystem {


    /**
     * @param hex the argument for hexadecimal input
     * @return the result from converting hexadecimal to decimal
     */
    public long hex2Decimal(String hex) {
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
     * @param hex the argument for hexadecimal input
     * @return the result from converting hexadecimal to binary
     */
    public long hex2Binary(String hex) {
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
     * @param hex the arugment for hexadecimal input
     * @return the result from converting hexadecimal to octal
     */
    public long hex2Octal(String hex) {
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
