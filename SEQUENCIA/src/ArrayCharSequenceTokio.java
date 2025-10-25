public class ArrayCharSequenceTokio implements CharSequenceTokio {
    private final char[] array;
    public ArrayCharSequenceTokio(char[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public char charAt(int index) {
        return array[index];
    }

    public CharSequenceTokio subSequence(int start, int end) {
        char[] subArray = new char[end - start];
        System.arraycopy(array, start, subArray, 0, end - start);
        return new ArrayCharSequenceTokio(subArray);
    }

    public String toString() {
        return new String(array);
    }
}
