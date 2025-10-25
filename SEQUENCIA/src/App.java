public class App {
    public static void main(String[] args) throws Exception {
        char[] array = { 'O', 'l', 'a', ' ', 'F', 'l', 'a', 'v', 'i', 'o', '!' };
        ArrayCharSequenceTokio charSequence = new ArrayCharSequenceTokio(array);

        System.out.println("Tamanho: " + charSequence.length());
        System.out.println("O caracter no index: " + charSequence.charAt(4));
        CharSequenceTokio subSequence = charSequence.subSequence(4, 10);
        System.out.println("Subsequencia (1 a 4): " + subSequence.toString());
        System.out.println("String original: " + charSequence.toString());
        System.out.println("--------------------------");
        StringCharSequenceTokio stringCharSequence = new StringCharSequenceTokio("Regras");
        System.out.println("Tamanho: " + stringCharSequence.length());
        System.out.println("O caracter no index: " + stringCharSequence.charAt(2));
        CharSequenceTokio subStringSequence = stringCharSequence.subSequence(1, 4);
        System.out.println("Subsequencia (1 a 4): " + subStringSequence.toString());
        System.out.println("String original: " + stringCharSequence.toString());

    }
}
