package ProgramaEmprestimo;

import java.util.Locale;
import java.util.Scanner;

public class TestaProgramaJuros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de emprestimo: ");
        double valorEmprestimo = entrada.nextDouble();
        System.out.print("Meses: ");
        int quantidadeMeses = entrada.nextInt();

        ServicoJuros juros = new ServicoJurosBrasil(2.0);
        double pagamento = juros.pagamento(valorEmprestimo, quantidadeMeses);

        System.out.println("Pagamento durante: " + quantidadeMeses + "  " + "Meses");
        System.out.println(String.format("%.2f", pagamento));

        entrada.close();
    }
}
