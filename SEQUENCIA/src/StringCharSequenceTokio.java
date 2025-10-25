public class StringCharSequenceTokio implements CharSequenceTokio {
    private final String str;
    public StringCharSequenceTokio(String str) {
        this.str = str;
    }

    public int length() {
        return str.length();
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public CharSequenceTokio subSequence(int start, int end) {
        return new StringCharSequenceTokio(str.substring(start, end));
    }

    public String toString() {
        return str;
    }
}
