public class Metodos1 {
    public static void main(String[] args) throws Exception {

        /*Pontos a observar:
        * Qual o objetivo do método?(questionamento muito importante)
        * Qual tipo de retorno?(questionamento muito importante para o método)
        * Quais parametros?
        * Quais exceções o método pode apresentar?
        * Qual visibilidade do método?
        * Métodos devem ser nomeados com verbos;
        *seguindo boas práticas métodos devem ter uma única responsabilidade;        
        */

        double valor1 = 12;
        double valor2 = 0;
        Operacao somar = new Operacao(valor1, valor2);
        System.out.println("O valor da soma é: " + somar.somar());

        Operacao subtrair = new Operacao(valor1, valor2);
        System.out.println("O valor da subtração é: " + subtrair.subtrair());

        Operacao multplicar = new Operacao(valor1, valor2);
        System.out.println("O valor da multiplicação é: " + multplicar.multiplicar());

        Operacao dividir = new Operacao(valor1, valor2);
        if (valor2 == 0) {
            System.out.println("Impossível dividir por zero!");
        } else if (valor2 != 0) {
            System.out.println("O valor da divisão é: " + dividir.dividir());
        }
    }
    
}
