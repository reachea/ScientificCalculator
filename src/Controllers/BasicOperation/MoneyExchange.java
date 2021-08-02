package Controllers.BasicOperation;

/**
 * Class for Money Exchange
 */
public class MoneyExchange {
    private final int dollar = 4050;
    private final int euro = 5500;
    private final int franc = 4500;
    private final int pound = 6000;
    private final int baht = 100;

    /**
     *
     * @param a the argument for amount of Riel
     * @return the result from Riel to Dollar conversion
     */
    public double rielToDollar(int a) {
        return (double) a/dollar;
    }

    /**
     *
     * @param a the argument for amount of Riel
     * @return the result from Riel to Euro conversion
     */
    public double rielToEuro(int a) {
        return (double) a/euro;
    }

    /**
     *
     * @param a the argument for amount of Riel
     * @return the result from Riel to Franc conversion
     */
    public double rielToFranc(int a) {
        return (double) a/franc;
    }

    /**
     *
     * @param a the argument for amount of Riel
     * @return the result from Riel to Pound conversion
     */
    public double rielToPound(int a) {
        return (double) a/pound;
    }

    /**
     *
     * @param a the argument for amount of Riel
     * @return the result from Riel to Baht conversion
     */
    public double rielToBaht(int a) {
        return (double) a/baht;
    }

    /**
     *
     * @param a the argument for amount of Dollar
     * @return the result from Dollar to Riel conversion
     */
    public double dollarToRiel(int a) {
        return a*dollar;
    }

    /**
     *
     * @param a the argument for amount of Euro
     * @return the result from Euro to Riel conversion
     */
    public double euroToRiel(int a) {
        return a*euro;
    }

    /**
     *
     * @param a the argument for amount of Franc
     * @return the result from Franc to Riel conversion
     */
    public double francToRiel(int a) {
        return a*franc;
    };

    /**
     *
     * @param a the argument for amount of Pound
     * @return the result from Pound to Riel conversion
     */
    public double poundToRiel(int a) {
        return a*pound;
    }

    /**
     *
     * @param a the argument for amount of Baht
     * @return the result from Baht to Riel conversion
     */
    public double bahtToRiel(int a) {
        return a*baht;
    }
}