public class Carro {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidadeMaxima;
    private Chassis chassis;
    private Rodas[] rodas;

    public Carro(String matricula, String marca, String modelo, int potencia, int velocidadeMaxima, Chassis chassis, Rodas[] rodas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.chassis = chassis;
        this.rodas = rodas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Rodas[] getRodas() {
        return rodas;
    }

    public static class Chassis {
        private String material;
        private int peso;

        public Chassis(String material, int peso) {
            this.material = material;
            this.peso = peso;
        }

        public String getMaterial() {
            return material;
        }

        public int getPeso() {
            return peso;
        }
    }

    public static class Rodas {
        private int medida;
        private String tipo;
        private String marca;
        private String modelo;
        
        public Rodas(int medida, String tipo, String marca, String modelo) {
            this.medida = medida;
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        public int getMedida() {
            return medida;
        }

        public String getTipo() {
            return tipo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
    }
}
