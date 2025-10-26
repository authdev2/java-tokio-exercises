public class Polymers {
    private String polymerName;
    private char[] salvos;
    public Polymers(String polymerName) {
        this.polymerName = polymerName;
    }

    public void printPolymer() {
        for(int i = 0; i< polymerName.length(); i++) {
            System.out.println(polymerName.charAt(i));
        }
    }
}