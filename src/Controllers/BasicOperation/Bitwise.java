package Controllers.BasicOperation;

/**
 * Class for bitwise operations
 */
public class Bitwise {

    /**
     *
     * @param a the first argument for bitwise-and operation
     * @param b the second argument for bitwise-and operation
     * @return the result from bitwise-and operation
     */
    public int AND(int a, int b) {
        return a&b;
    }

    /**
     *
     * @param a the first argument for bitwise-or operation
     * @param b the second argument for bitwise-or operation
     * @return the result from bitwise-or operation
     */
    public int OR(int a, int b) {
        return a|b;
    }

    /**
     *
     * @param a the first argument for bitwise-xor operation
     * @param b the second argument for bitwise-xor operation
     * @return the result from bitwise-xor operation
     */
    public int XOR(int a, int b) {
        return a^b;
    }

    /**
     *
     * @param a the first argument for bit shift
     * @param b the second argument for the number of shift
     * @return the result from left shift
     */
    public int leftShift(int a, int b) {
        return a<<b;
    }

    /**
     *
     * @param a the first argument for bit shift
     * @param b the second argument for the number of shift
     * @return the result from right shift
     */
    public int rightShift(int a, int b) {
        return a>>b;
    }

    /**
     *
     * @param a the argument for bit inversion
     * @return the result from bit inversion
     */
    public int bit_inversion(int a) {
        return ~a;
    }
}