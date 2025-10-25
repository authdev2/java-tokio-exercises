public class App {
    public static void main(String[] args) throws Exception {
        int array[] = {5, 4, 3, 2, 1};

        // 5, 4, 3, 2, 1
        // 4, 3, 2, 1, 5
        // 3, 2, 1, 4, 5
        // 2, 1, 3, 4, 5
        // 1, 2, 3, 4, 5

        for(int i = 0; i < array.length; i++) {

            for(int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int numAnterior = array[i];
                    array[i] = array[j]; 
                    array[j] = numAnterior; 
                }
            }
        }

        System.out.print("Array final: ");
        for (int v : array) System.out.print(v + " ");


    }
}
