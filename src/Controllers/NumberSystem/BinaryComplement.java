package Controllers.NumberSystem;

/**
 * Nested class for binary complement
 */
public class BinaryComplement {

    private final BinaryArithmetic binaryArithmetic;

    public BinaryComplement(BinaryArithmetic binaryArithmetic) {
        this.binaryArithmetic = binaryArithmetic;
    }

    /**
     * @param binary the argument for binary input
     * @return the result after convert binary to first complement
     */
    public long findFirstComplement(long binary) {
        // init complement binary variable
        long co_binary = 0;

        // create binaryArithmetic object
        BinaryArithmetic binaryArithmetic = new BinaryArithmetic();

        // Using recursion logic to get the amount of index
        int cnt = binaryArithmetic.getLoopNumber(binary, 10);

        // Logic to the first complement binary
        long remainder = binary;
        long mod;
        for (int i = 0; i < cnt; i++) {
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
     * @param binary the argument for binary input
     * @return the result from second complement conversion
     */
    public long secondComplement(long binary) {
        // convert binary to first complement
        long firstComplement = findFirstComplement(binary);

        // getting second complement
        long ans = binaryArithmetic.binaryAdd(firstComplement, 1);

        // return second complement number
        return ans;
    }
}
