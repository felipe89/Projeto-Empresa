package ProgramaMaiorNumero;

public class MetodoMaiorNumero {

    public static int verificarMaiorNumero(int valor_A, int valor_B) {

        if (valor_A > valor_B) {
            return valor_A;
        }
        else {
            return valor_B;
        }
    }

    public static double somaDeValores(double valor_A, double valor_B){

        double calculaVl = valor_A + valor_B;

        return calculaVl;
    }
}
