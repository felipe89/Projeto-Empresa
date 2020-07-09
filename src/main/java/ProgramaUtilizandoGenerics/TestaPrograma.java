package ProgramaUtilizandoGenerics;

import java.util.Scanner;

public class TestaPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ImprimirServico <String> imp = new ImprimirServico<>();

        System.out.print("Quantos Valores: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String valor = sc.next();
            imp.addValor(valor);
        }
        imp.imprime();
        String x = imp.primeiroValor();
        System.out.println("Primeiro Valor: " + imp.primeiroValor());

        sc.close();
    }
}
