public class App {
    public static void main(String[] args) throws Exception {
        int number = 10;

        int result = number;

        while(result != 1){
            if (result % 2 == 0) {
                result = result / 2;
            }else{
                result = 3 * result + 1;
            }
        }

        System.out.println("Numero final: " + result);

    }
}
