public class App {
    public static void main(String[] args) throws Exception {
        Carro.Chassis chassis1 = new Carro.Chassis("Alumínio", 1200);
        Carro.Rodas[] rodas1 = new Carro.Rodas[4];
        rodas1[0] = new Carro.Rodas(16, "seco", "Michelin", "Primacy 4");
        rodas1[1] = new Carro.Rodas(16, "seco", "Michelin", "Primacy 4");
        rodas1[2] = new Carro.Rodas(16, "seco", "Michelin", "Primacy 4");
        rodas1[3] = new Carro.Rodas(16, "seco", "Michelin", "Primacy 4");
        
        Carro carro1 = new Carro("1234-ABC", "Toyota", "Corolla", 150, 180, chassis1, rodas1);
        
        Carro.Chassis chassis2 = new Carro.Chassis("Aço", 1400);
        Carro.Rodas[] rodas2 = new Carro.Rodas[4];
        rodas2[0] = new Carro.Rodas(18, "chuva", "Bridgestone", "Potenza RE050A");
        rodas2[1] = new Carro.Rodas(18, "chuva", "Bridgestone", "Potenza RE050A");
        rodas2[2] = new Carro.Rodas(18, "chuva", "Bridgestone", "Potenza RE050A");
        rodas2[3] = new Carro.Rodas(18, "chuva", "Bridgestone", "Potenza RE050A");
        
        Carro carro2 = new Carro("5678-DEF", "BMW", "X5", 300, 250, chassis2, rodas2);
        
        System.out.println("=== CARRO 1 ===");
        System.out.println("Detalhes do Carro:");
        System.out.println("Matrícula: " + carro1.getMatricula());
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Potência: " + carro1.getPotencia() + " CV");
        System.out.println("Velocidade Máxima: " + carro1.getVelocidadeMaxima() + " km/h");
    
        System.out.println("\nDetalhes do Chassis:");
        System.out.println("Material: " + carro1.getChassis().getMaterial());
        System.out.println("Peso: " + carro1.getChassis().getPeso() + " kg");

        System.out.println("\nDetalhes das Rodas:");
        for (int i = 0; i < carro1.getRodas().length; i++) {
            System.out.println("Roda " + (i + 1) + ":");
            System.out.println("  Medida: " + carro1.getRodas()[i].getMedida());
            System.out.println("  Tipo: " + carro1.getRodas()[i].getTipo());
            System.out.println("  Marca: " + carro1.getRodas()[i].getMarca());
            System.out.println("  Modelo: " + carro1.getRodas()[i].getModelo());
        }
        
        System.out.println("\n=== CARRO 2 ===");
        System.out.println("Detalhes do Carro:");
        System.out.println("Matrícula: " + carro2.getMatricula());
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Potência: " + carro2.getPotencia() + " CV");
        System.out.println("Velocidade Máxima: " + carro2.getVelocidadeMaxima() + " km/h");
    
        System.out.println("\nDetalhes do Chassis:");
        System.out.println("Material: " + carro2.getChassis().getMaterial());
        System.out.println("Peso: " + carro2.getChassis().getPeso() + " kg");

        System.out.println("\nDetalhes das Rodas:");
        for (int i = 0; i < carro2.getRodas().length; i++) {
            System.out.println("Roda " + (i + 1) + ":");
            System.out.println("  Medida: " + carro2.getRodas()[i].getMedida());
            System.out.println("  Tipo: " + carro2.getRodas()[i].getTipo());
            System.out.println("  Marca: " + carro2.getRodas()[i].getMarca());
            System.out.println("  Modelo: " + carro2.getRodas()[i].getModelo());
        }
    }
}
