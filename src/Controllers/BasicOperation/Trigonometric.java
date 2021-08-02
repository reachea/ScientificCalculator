package Controllers.BasicOperation;

/**
 *  Trigonometry class for trigonometric functions
 */
public class Trigonometric {

    /**
     *
     * @param radian the argument for sin function
     * @return the result from sin function
     */
    public double sin(float radian) {
        return Math.sin(radian);
    }

    /**
     *
     * @param degree the argument for sin function
     * @return the result from sin function
     */
    public double sind(int degree) {
        double b = Math.toRadians(degree);
        return Math.sin(b);
    }

    /**
     *
     * @param radian the argument for cos function
     * @return the result from cos function
     */
    public double cos(float radian) {
        return Math.cos(radian);
    }

    /**
     *
     * @param degree the argument for cos function
     * @return the result from cos function
     */
    public double cosd(int degree) {
        double b = Math.toRadians(degree);
        return Math.cos(b);
    }

    /**
     *
     * @param radian the argument for tan function
     * @return the result from tan function
     */
    public double tan(float radian) {
        return Math.tan(radian);
    }

    /**
     *
     * @param degree the argument for tan function
     * @return the result from tan function
     */
    public double tand(int degree) {
        double b = Math.toRadians(degree);
        return Math.tan(b);
    }

    /**
     *
     * @param x the argument for power of 2
     * @return the result from x power of 2
     */
    public long square2(long x) {
        return x*x;
    }

    /**
     *
     * @param x the argument for power of 2
     * @return the result from x power of 2
     */
    public double square2(double x) {
        return x*x;
    }

    /**
     *
     * @param x the argument for power of 3
     * @return the result from x power of 3
     */
    public long square3(long x) {
        return x*x*x;
    }

    /**
     *
     * @param x the argument for power of 3
     * @return the result from x power of 3
     */
    public double square3(double x) {
        return x*x*x;
    }

    /**
     *
     * @param x the argument for converting to radian
     * @return the result from converting to radian
     */
    public double degree2Radian(double x) {
        return Math.toRadians(x);
    }
}