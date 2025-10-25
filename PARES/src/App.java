public class App {
    public static void main(String[] args) throws Exception {
        int limitNumber = 100;

        for(int i = 2; i<=limitNumber; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
