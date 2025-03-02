public class Operacao {
    private double valor1;
    private double valor2;

    public Operacao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double somar() {
        return valor1 + valor2;
    }

    public double subtrair() {
        return valor1 - valor2;
    }

    public double multiplicar() {
        return valor1 * valor2;
    }

    public double dividir() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            return 0;
        }
    }
    
}
