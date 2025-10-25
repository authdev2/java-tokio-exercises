public class App {
    public static void main(String[] args) throws Exception {
        Tuba tuba = new Tuba();
        Saxofone sax = new Saxofone();
        Violino violino = new Violino();
        Contrabaixo contra = new Contrabaixo();
        Timbale timbale = new Timbale();
        Xilofone xilofone = new Xilofone();

        System.out.println(tuba.tocar("DO"));
        System.out.println(sax.tocar("DO"));
        System.out.println(violino.tocar("DO"));
        System.out.println(xilofone.tocar("DO"));

        Orquestra orquestra = new Orquestra();
        orquestra.adicionarInstrumento(tuba);
        orquestra.adicionarInstrumento(sax);
        orquestra.adicionarInstrumento(violino);
        orquestra.adicionarInstrumento(contra);
        orquestra.adicionarInstrumento(timbale);
        orquestra.adicionarInstrumento(xilofone);

        System.out.println("\nOrquestra:\n");
        System.out.println(orquestra.tocar("DO"));
        System.out.println(orquestra.tocar("Re"));
        System.out.println(orquestra.tocar("Mi"));
        System.out.println(orquestra.tocar("Fa"));
        System.out.println(orquestra.tocar("Sol"));
        System.out.println(orquestra.tocar("La"));
        System.out.println(orquestra.tocar("Si"));
        System.out.println(orquestra.tocar("DO"));
    }
}
