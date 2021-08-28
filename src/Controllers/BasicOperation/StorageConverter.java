package Controllers.BasicOperation;

/**
 * StorageConverter class for converting the size of the storage
 */
public class StorageConverter {
    /**
     * Discrete Standard Point
     */
    private final int standardStorageDivider = 1024;

    /**
     *
     * @param numByte the argument for byte to kiloByte conversion
     * @return the result from converting Byte to kiloByte
     */
    public double byte2KB (double numByte) { return numByte / standardStorageDivider; }

    /**
     *
     * @param numByte the argument for Byte to megaByte conversion
     * @return the result from converting Byte to megaByte
     */
    public double byte2MB (double numByte) { return (numByte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param numByte the argument for Byte to gigaByte conversion
     * @return the result from converting Byte to gigaByte
     */
    public double byte2GB (double numByte) { return (numByte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param numByte the argument for Byte to teraByte conversion
     * @return the result from converting Byte to teraByte
     */
    public double byte2TB (double numByte) { return (numByte / Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param numByte the argument for Byte to petaByte conversion
     * @return the result from converting Byte to petaByte
     */
    public double byte2PB (double numByte) { return (numByte / Math.pow(standardStorageDivider, 5)); }

    /**
     *
     * @param kilobyte the argument for kiloByte to Byte conversion
     * @return the result from converting kiloByte to Byte
     */
    public double kb2Byte (double kilobyte) { return kilobyte * standardStorageDivider; }

    /**
     *
     * @param kilobyte the argument for kiloByte to megaByte conversion
     * @return the result from converting kiloByte to megaByte
     */
    public double kb2MB (double kilobyte) { return kilobyte / standardStorageDivider; }

    /**
     *
     * @param kilobyte the argument for kiloByte to gigaByte conversion
     * @return the result from converting kiloByte to gigaByte
     */
    public double kb2GB (double kilobyte) { return kilobyte / (standardStorageDivider * 2); }

    /**
     *
     * @param kilobyte the argument for kiloByte to teraByte conversion
     * @return the result from converting kiloByte to teraByte
     */
    public double kb2TB (double kilobyte) { return (kilobyte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param kilobyte the argument for kiloByte to petaByte conversion
     * @return the result from converting kiloByte to petaByte
     */
    public double kb2PB (double kilobyte) { return (kilobyte / Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param megabyte the argument for megaByte to Byte conversion
     * @return the result from converting megaByte to Byte
     */
    public double mb2Byte (double megabyte) { return (megabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param megabyte the argument for megaByte to kiloByte conversion
     * @return the result from converting megaByte to kiloByte
     */
    public double mb2KB (double megabyte) { return megabyte * standardStorageDivider; }

    /**
     *
     * @param megabyte the argument for megaByte to gigaByte conversion
     * @return the result from converting megaBye to gigaByte
     */
    public double mb2GB (double megabyte) { return megabyte / standardStorageDivider; }

    /**
     *
     * @param megabyte the argument for megaByte to teraByte conversion
     * @return the result from converting megaByte to teraByte
     */
    public double mb2TB (double megabyte) { return (megabyte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param megabyte the argument for megaByte to petaByte conversion
     * @return the result from converting megaByte to petaByte
     */
    public double mb2PB (double megabyte) { return (megabyte / Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to Byte conversion
     * @return the result from converting gigaByte to Byte
     */
    public double gb2Byte (double gigabyte) { return (gigabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to kiloByte conversion
     * @return the result from converting gigaByte to kiloByte
     */
    public double gb2KB (double gigabyte) { return (gigabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param gigabyte the argument for gigaByte to megaByte conversion
     * @return the result from converting gigaByte to megaByte
     */
    public double gb2MB (double gigabyte) { return gigabyte * standardStorageDivider; }

    /**
     *
     * @param gigabyte the argument for gigaByte to teraByte conversion
     * @return the result from converting gigaByte to teraByte
     */
    public double gb2TB (double gigabyte) { return gigabyte / standardStorageDivider; }

    /**
     *
     * @param gigabyte the argument for gigaByte to petaByte conversion
     * @return the result from converting gigaByte to petaByte
     */
    public double gb2PB (double gigabyte) { return (gigabyte / Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param terabyte the argument for teraByte to Byte conversion
     * @return the result from converting teraByte to Byte
     */
    public double tb2Byte (double terabyte) { return (terabyte * Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param terabyte the argument for teraByte to kiloByte
     * @return the result from converting teraByte to kiloByte
     */
    public double tb2KB (double terabyte) { return (terabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param terabyte the argument for teraByte to megaByte
     * @return the result from converting teraByte to megaByte
     */
    public double tb2MB (double terabyte) { return (terabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param terabyte the argument for teraByte to gigaByte
     * @return the result from converting teraByte to gigaByte
     */
    public double tb2GB (double terabyte) { return terabyte * standardStorageDivider; }

    /**
     *
     * @param terabyte the argument for teraByte to petaByte
     * @return the result from converting teraByte to petaByte
     */
    public double tb2PB (double terabyte) { return terabyte / standardStorageDivider; }

    /**
     *
     * @param petabyte the argument for petaByte to Byte
     * @return the result from converting petaByte to Byte
     */
    public double pb2Byte (double petabyte) { return (petabyte * Math.pow(standardStorageDivider, 5)); }

    /**
     *
     * @param petabyte the argument for petaByte to kiloByte
     * @return the result from converting petaByte to kiloByte
     */
    public double pb2KB (double petabyte) { return (petabyte * Math.pow(standardStorageDivider, 4)); }

    /**
     *
     * @param petabyte the argument for petaByte to megaByte
     * @return the result from converting petaByte to megaByte
     */
    public double pb2MB (double petabyte) { return (petabyte * Math.pow(standardStorageDivider, 3)); }

    /**
     *
     * @param petabyte the argument for petaByte to gigaByte
     * @return the result from converting petaByte to gigaByte
     */
    public double pb2GB (double petabyte) { return (petabyte * Math.pow(standardStorageDivider, 2)); }

    /**
     *
     * @param petabyte the argument for petaByte to teraByte
     * @return the result from converting petaByte to teraByte
     */
    public double pb2TB (double petabyte) { return petabyte * standardStorageDivider; }

}