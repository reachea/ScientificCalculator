package Controllers.NumberSystem;

/**
 * Octal class for handling all conversions performance from octal
 */
public class Octal extends NumberSystem {


    /**
     * @param octal the argument for octal input
     * @return the result from converting octal to decimal
     */
    public long octal2Decimal(long octal) {
        int cnt = getLoopNumber(octal, 10);

        // Logic for converting octal to decimal
        long ans = 0;
        for (int i = 0; i < cnt; i++) {
            ans = ans + ((octal % 10) * pow(8, i));

            octal /= 10;
        }

        return ans;
    }


    /**
     * @param octal the argument for octal input
     * @return the result from converting octal to binary
     */
    public long octal2Binary(long octal) {
        int cnt = getLoopNumber(octal, 10);

        // Logic for converting octal to binary
        long ans = 0;
        long secondary = 0;
        for (int i = 0; i < cnt; i++) {
            long hold = octal % 10;
            int cn = getLoopNumber(hold, 2);
            for (int j = 0; j < cn; j++) {
                if (hold % 2 == 1) {
                    secondary += pow(10, j);
                }

                hold /= 2;
            }

            ans += secondary * pow(1000, i);
            secondary = 0;
            octal /= 10;
        }

        return ans;
    }


    /**
     * @param octal the argument for octal input
     * @return the result from converting octal to hexadecimal
     */
    public String octal2Hex(long octal) {
        long bin = octal2Binary(octal);

        Binary binary = new Binary();

        return binary.binary2Hex(bin);
    }
}
