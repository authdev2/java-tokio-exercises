public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;

        if (denominador == 0){
            throw new IllegalArgumentException("Denominador não pode ser 0");
        }
    }

    public void soma(Racional outrosValores){
        this.numerador = this.numerador * outrosValores.denominador + this.denominador * outrosValores.numerador;
        this.denominador = this.denominador * outrosValores.denominador;
    }

    public void subtracao(Racional outrosValores){
        this.numerador = this.numerador * outrosValores.denominador - this.denominador * outrosValores.numerador;
        this.denominador = this.denominador * outrosValores.denominador;
    }

    public void multiplicacao(Racional outrosValores){
        this.numerador = this.numerador * outrosValores.numerador;
        this.denominador = this.denominador * outrosValores.denominador;
    }

    public void divisao(Racional outrosValores){
        if (outrosValores.numerador == 0){
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        this.numerador = this.numerador * outrosValores.denominador;
        this.denominador = this.denominador * outrosValores.numerador;

    }

    public String toString(){
        return this.numerador + "/" + this.denominador;
    }
}
