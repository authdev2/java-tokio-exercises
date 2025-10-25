public class Vogais {
        private char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        public Vogais() {
        }


        public int contarVogais(String frase) {
            int countVogais = 0;
            for(int i = 0; i< vogais.length; i++) {
                for(int j = 0; j < frase.length(); j++) {
                    if(vogais[i] == frase.charAt(j)) {
                        countVogais++;
                    }
                }
            }
            return countVogais;
        }
}
