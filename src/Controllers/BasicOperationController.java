package Controllers;

import Models.BasicOperationModel;
import Views.BasicOperationLeftContainer;
import Views.BasicOperationView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicOperationController {
    private BasicOperationModel basicOperationModel;
    protected BasicOperationLeftContainer basicOperationLeftContainerView;

    // Operation and functionalities
    private Arithmetic arithmetic = new Arithmetic();
    private Bitwise bitwise = new Bitwise();
    private MoneyExchange moneyExchange = new MoneyExchange();
    private StorageConverter storageConverter = new StorageConverter();
    private Trigonometric trigonometric = new Trigonometric();

    // Answer Holders

    public BasicOperationController(BasicOperationModel _basicOperationModel, BasicOperationView _basicOperationView) {
        basicOperationModel = _basicOperationModel;
        basicOperationLeftContainerView = _basicOperationView.basicOperationLeftContainer;

        basicOperationLeftContainerView.addPlusButtonHandler(new PlusButtonHandler());
        basicOperationLeftContainerView.addMinusBtnHandler(new MinusButtonHandler());
        basicOperationLeftContainerView.addEqualButtonHandler(new EqualButtonHandler());
    }

    class EqualButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
            String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
            String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

            if (basicArithmeticOperation.length() == 0) {
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " =");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                return;
            }

            String operation = basicArithmeticOperation.substring(basicArithmeticOperation.length() - 1);

            String basicArithmeticOperationSubstring = basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 2);

            switch (operation) {
                case "+":
                    basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperation + " " + basicArithmeticResultHolder + " =");
                    basicArithmeticOperation = basicArithmeticOperationSubstring;
                    int sumResult = arithmetic.sum(Integer.parseInt(basicArithmeticOperation), Integer.parseInt(basicArithmeticResultHolder));
                    basicOperationLeftContainerView.setBasicArithmeticResult(Integer.toString(sumResult));
                    basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                    break;
                case "-":
                    basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperation + " " + basicArithmeticResultHolder + " =");
                    basicArithmeticOperation = basicArithmeticOperationSubstring;
                    int minusResult = arithmetic.minus(Integer.parseInt(basicArithmeticOperation), Integer.parseInt(basicArithmeticResultHolder));
                    basicOperationLeftContainerView.setBasicArithmeticResult(Integer.toString(minusResult));
                    basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                    break;
                case "*":
                    break;
                case "/":
                    break;
                default:
                    basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " =");
                    basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            }
        }
    }

    class PlusButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
            String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
            String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

            if (basicArithmeticOperation.length() == 0) {
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResultHolder + " +");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                return;
            }

            if (checkEqualSign(basicArithmeticOperation)) {
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " +");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                return;
            }

            if (basicArithmeticResultHolder.equals("0")) {
                return;
            }

            String result = Integer.toString(arithmetic.sum(Integer.parseInt(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 2)), Integer.parseInt(basicArithmeticResultHolder)));
            basicOperationLeftContainerView.setBasicArithmeticResult(result);
            result = result.concat(" +");
            basicOperationLeftContainerView.setBasicArithmeticOperation(result);

            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");

            System.out.println(basicOperationLeftContainerView.getBasicArithmeticResultHolder());
        }
    }

    class MinusButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
            String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
            String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

            if (basicArithmeticOperation.length() == 0) {
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResultHolder + " -");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                return;
            }

            if (checkEqualSign(basicArithmeticOperation)) {
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " -");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                return;
            }

            if (basicArithmeticResultHolder.equals("0")) {
                return;
            }

            String result = Integer.toString(arithmetic.minus(Integer.parseInt(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 2)), Integer.parseInt(basicArithmeticResultHolder)));
            basicOperationLeftContainerView.setBasicArithmeticResult(result);
            result = result.concat(" -");
            basicOperationLeftContainerView.setBasicArithmeticOperation(result);

            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");

            System.out.println(basicOperationLeftContainerView.getBasicArithmeticResultHolder());
        }
    }

    // check for equal sign
    public boolean checkEqualSign(String input) {
        String sign = input.substring(input.length() - 1);
        return sign.equals("=");
    }
}

/**
 * Arithmetic class for operations
 */
class Arithmetic {

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



/**
 *  Trigonometry class for trigonometric functions
 */
class Trigonometric {

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



/**
 * Class for bitwise operations
 */
class Bitwise {

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



/**
 * StorageConverter class for converting the size of the storage
 */
class StorageConverter {
    /**
     * Discrete Standard Point
     */
    private final int standardStorageDivider = 1024;

    /**
     *
     * @param numByte the argument for byte to kiloByte conversion
     * @return the result from converting Byte to kiloByte
     */
    public long byte2KB (long numByte) { return numByte / standardStorageDivider; }

    /**
     *
     * @param numByte the argument for Byte to megaByte conversion
     * @return the result from converting Byte to megaByte
     */
    public long byte2MB (long numByte) { return (long) (numByte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param numByte the argument for Byte to gigaByte conversion
     * @return the result from converting Byte to gigaByte
     */
    public long byte2GB (long numByte) { return (long) (numByte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param numByte the argument for Byte to teraByte conversion
     * @return the result from converting Byte to teraByte
     */
    public long byte2TB (long numByte) { return (long) (numByte / Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param numByte the argument for Byte to petaByte conversion
     * @return the result from converting Byte to petaByte
     */
    public long byte2PB (long numByte) { return (long) (numByte / Math.pow(standardStorageDivider, 5)); }

    /**
     *
     * @param kilobyte the argument for kiloByte to Byte conversion
     * @return the result from converting kiloByte to Byte
     */
    public long kb2Byte (long kilobyte) { return kilobyte * standardStorageDivider; }

    /**
     *
     * @param kilobyte the argument for kiloByte to megaByte conversion
     * @return the result from converting kiloByte to megaByte
     */
    public long kb2MB (long kilobyte) { return kilobyte / standardStorageDivider; }

    /**
     *
     * @param kilobyte the argument for kiloByte to gigaByte conversion
     * @return the result from converting kiloByte to gigaByte
     */
    public long kb2GB (long kilobyte) { return kilobyte / (standardStorageDivider * 2); }

    /**
     *
     * @param kilobyte the argument for kiloByte to teraByte conversion
     * @return the result from converting kiloByte to teraByte
     */
    public long kb2TB (long kilobyte) { return (long) (kilobyte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param kilobyte the argument for kiloByte to petaByte conversion
     * @return the result from converting kiloByte to petaByte
     */
    public long kb2PB (long kilobyte) { return (long) (kilobyte / Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param megabyte the argument for megaByte to Byte conversion
     * @return the result from converting megaByte to Byte
     */
    public long mb2Byte (long megabyte) { return (long) (megabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param megabyte the argument for megaByte to kiloByte conversion
     * @return the result from converting megaByte to kiloByte
     */
    public long mb2KB (long megabyte) { return megabyte * standardStorageDivider; }

    /**
     *
     * @param megabyte the argument for megaByte to gigaByte conversion
     * @return the result from converting megaBye to gigaByte
     */
    public long mb2GB (long megabyte) { return megabyte / standardStorageDivider; }

    /**
     *
     * @param megabyte the argument for megaByte to teraByte conversion
     * @return the result from converting megaByte to teraByte
     */
    public long mb2TB (long megabyte) { return (long) (megabyte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param megabyte the argument for megaByte to petaByte conversion
     * @return the result from converting megaByte to petaByte
     */
    public long mb2PB (long megabyte) { return (long) (megabyte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to Byte conversion
     * @return the result from converting gigaByte to Byte
     */
    public long gb2Byte (long gigabyte) { return (long) (gigabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to kiloByte conversion
     * @return the result from converting gigaByte to kiloByte
     */
    public long gb2KB (long gigabyte) { return (long) (gigabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to megaByte conversion
     * @return the result from converting gigaByte to megaByte
     */
    public long gb2MB (long gigabyte) { return gigabyte * standardStorageDivider; }

    /**
     *
     * @param gigabyte the argument for gigaByte to teraByte conversion
     * @return the result from converting gigaByte to teraByte
     */
    public long gb2TB (long gigabyte) { return gigabyte / standardStorageDivider; }

    /**
     *
     * @param gigabyte the argument for gigaByte to petaByte conversion
     * @return the result from converting gigaByte to petaByte
     */
    public long gb2PB (long gigabyte) { return (long) (gigabyte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param terabyte the argument for teraByte to Byte conversion
     * @return the result from converting teraByte to Byte
     */
    public long tb2Byte (long terabyte) { return (long) (terabyte * Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param terabyte the argument for teraByte to kiloByte
     * @return the result from converting teraByte to kiloByte
     */
    public long tb2KB (long terabyte) { return (long) (terabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param terabyte the argument for teraByte to megaByte
     * @return the result from converting teraByte to megaByte
     */
    public long tb2MB (long terabyte) { return (long) (terabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param terabyte the argument for teraByte to gigaByte
     * @return the result from converting teraByte to gigaByte
     */
    public long tb2GB (long terabyte) { return terabyte * standardStorageDivider; }

    /**
     *
     * @param terabyte the argument for teraByte to petaByte
     * @return the result from converting teraByte to petaByte
     */
    public long tb2PB (long terabyte) { return terabyte / standardStorageDivider; }

    /**
     *
     * @param petabyte the argument for petaByte to Byte
     * @return the result from converting petaByte to Byte
     */
    public long pb2Byte (long petabyte) { return (long) (petabyte * Math.pow(standardStorageDivider, 5)); }

    /**
     *
     * @param petabyte the argument for petaByte to kiloByte
     * @return the result from converting petaByte to kiloByte
     */
    public long pb2KB (long petabyte) { return (long) (petabyte * Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param petabyte the argument for petaByte to megaByte
     * @return the result from converting petaByte to megaByte
     */
    public long pb2MB (long petabyte) { return (long) (petabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param petabyte the argument for petaByte to gigaByte
     * @return the result from converting petaByte to gigaByte
     */
    public long pb2GB (long petabyte) { return (long) (petabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param petabyte the argument for petaByte to teraByte
     * @return the result from converting petaByte to teraByte
     */
    public long pb2TB (long petabyte) { return petabyte * standardStorageDivider; }

}



/**
 * Class for Money Exchange
 */
class MoneyExchange {
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