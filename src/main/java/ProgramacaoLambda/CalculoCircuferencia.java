package ProgramacaoLambda;

import java.util.Scanner;

public class CalculoCircuferencia {

    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        int raio;

        float circunferencia;
        float area;
        double pi = 3.14;

        System.out.print("Informe o valor do raio: ");
        raio = entrada.nextInt();

        circunferencia = (float)(2*pi*raio);
        System.out.printf("\n Comprimento da Circunferência: %.2f", circunferencia);

        area = (float)(pi*raio*raio);
        System.out.printf("\n Área da Circuferência: %.2f", area);

        entrada.close();
    }

}
