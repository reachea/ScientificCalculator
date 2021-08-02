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