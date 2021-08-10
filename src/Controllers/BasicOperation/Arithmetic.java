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
    public double sum(double a, double b) {
        return (a+b);
    };

    /**
     *
     * @param a the first argument for minus operation
     * @param b the second argument for minus operation
     * @return the result from minus operation
     */
    public double minus(double a, double b) {
        return (a-b);
    }

    /**
     *
     * @param a the first argument for multiply operation
     * @param b the second argument for multiply operation
     * @return the result from multiply operation
     */
    public double multiply(double a, double b) {
        return (a*b);
    }

    /**
     *
     * @param a the first argument for divide operation
     * @param b the second argument for divide operation
     * @return the result from divide operation
     */
    public double divide(double a, double b) {
        return ((double) a/b);
    }

    /**
     *
     * @param a the first argument for modulo operation
     * @param b the second argument for modulo operation
     * @return the result from modulo operation
     */
    public double modulo(double a, double b) {
        return (a%b);
    }
}