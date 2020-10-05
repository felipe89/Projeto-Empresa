package ProgramacaoLambda;

import java.util.Scanner;

public class CalcularDobroNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int valorDobrado;

        System.out.print("Digite qualquer numero: ");
        numero = entrada.nextInt();

        valorDobrado = (2 * numero);

        System.out.println("O dobro do numero informado é de : " + valorDobrado);

        entrada.close();

    }

}


