package mv.fi.muni.labak.msg;

/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'KeyMsg'
 * message type.
 */

public class KeyMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 20;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 139;

    /** Create a new KeyMsg of size 20. */
    public KeyMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new KeyMsg of the given data_length. */
    public KeyMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg with the given data_length
     * and base offset.
     */
    public KeyMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg using the given byte array
     * as backing store.
     */
    public KeyMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public KeyMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public KeyMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg embedded in the given message
     * at the given base offset.
     */
    public KeyMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new KeyMsg embedded in the given message
     * at the given base offset and length.
     */
    public KeyMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <KeyMsg> \n";
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [keyValue=";
        for (int i = 0; i < 16; i++) {
          s += "0x"+Long.toHexString(getElement_keyValue(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: long, unsigned
    //   Offset (bits): 0
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 0;
    }

    /**
     * Return the value (as a long) of the field 'counter'
     */
    public long get_counter() {
        return (long)getUIntBEElement(offsetBits_counter(), 32);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(long value) {
        setUIntBEElement(offsetBits_counter(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: keyValue
    //   Field type: short[], unsigned
    //   Offset (bits): 32
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'keyValue' is signed (false).
     */
    public static boolean isSigned_keyValue() {
        return false;
    }

    /**
     * Return whether the field 'keyValue' is an array (true).
     */
    public static boolean isArray_keyValue() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'keyValue'
     */
    public static int offset_keyValue(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 16) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'keyValue'
     */
    public static int offsetBits_keyValue(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 16) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'keyValue' as a short[]
     */
    public short[] get_keyValue() {
        short[] tmp = new short[16];
        for (int index0 = 0; index0 < numElements_keyValue(0); index0++) {
            tmp[index0] = getElement_keyValue(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'keyValue' from the given short[]
     */
    public void set_keyValue(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_keyValue(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'keyValue'
     */
    public short getElement_keyValue(int index1) {
        return (short)getUIntBEElement(offsetBits_keyValue(index1), 8);
    }

    /**
     * Set an element of the array 'keyValue'
     */
    public void setElement_keyValue(int index1, short value) {
        setUIntBEElement(offsetBits_keyValue(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'keyValue'
     */
    public static int totalSize_keyValue() {
        return (128 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'keyValue'
     */
    public static int totalSizeBits_keyValue() {
        return 128;
    }

    /**
     * Return the size, in bytes, of each element of the array 'keyValue'
     */
    public static int elementSize_keyValue() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'keyValue'
     */
    public static int elementSizeBits_keyValue() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'keyValue'
     */
    public static int numDimensions_keyValue() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'keyValue'
     */
    public static int numElements_keyValue() {
        return 16;
    }

    /**
     * Return the number of elements in the array 'keyValue'
     * for the given dimension.
     */
    public static int numElements_keyValue(int dimension) {
      int array_dims[] = { 16,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'keyValue' with a String
     */
    public void setString_keyValue(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_keyValue(i, (short)s.charAt(i));
         }
         setElement_keyValue(i, (short)0); //null terminate
    }

    /**
     * Read the array 'keyValue' as a String
     */
    public String getString_keyValue() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,16)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_keyValue(i) == (char)0) break;
             carr[i] = (char)getElement_keyValue(i);
         }
         return new String(carr,0,i);
    }

}
