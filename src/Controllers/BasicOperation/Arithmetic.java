package Controllers.BasicOperation;

/**
 * Arithmetic class for operations
 */
public class Arithmetic {

    /**
     *
     * @param a the first argument for sum operation
     * @param b the second argument for sum operation
     * @return the result from sum operation
     */
    public int sum(int a, int b) {
        return (a+b);
    };

    /**
     *
     * @param a the first argument for minus operation
     * @param b the second argument for minus operation
     * @return the result from minus operation
     */
    public int minus(int a, int b) {
        return (a-b);
    }

    /**
     *
     * @param a the first argument for multiply operation
     * @param b the second argument for multiply operation
     * @return the result from multiply operation
     */
    public int multiply(int a, int b) {
        return (a*b);
    }

    /**
     *
     * @param a the first argument for divide operation
     * @param b the second argument for divide operation
     * @return the result from divide operation
     */
    public double divide(int a, int b) {
        return ((double) a/b);
    }

    /**
     *
     * @param a the first argument for modulo operation
     * @param b the second argument for modulo operation
     * @return the result from modulo operation
     */
    public int modulo(int a, int b) {
        return (a%b);
    }
}