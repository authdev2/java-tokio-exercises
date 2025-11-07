sealed class Veiculo permits Carro, Moto, Camiao {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    

}


final class Carro extends Veiculo {
    private int numPortas;
    public Carro(String marca, String modelo, int numPortas) {
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }
}

final class Moto extends Veiculo {
    private int cilindrada;
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}

final class Camiao extends Veiculo {
    private int capacidadeCarga;
    public Camiao(String marca, String modelo, int capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
}
