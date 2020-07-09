package ProgramaContratoParcelado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Insira os dados do contrato: ");
        System.out.print("Numero do Contrato: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = formatarData.parse(sc.next());
        System.out.print("Valor do Contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Informe a quantidade de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ContratoServiço contratoServiço = new ContratoServiço(new PagamentoPayPal());

        contrato = contratoServiço.processoContrato(contrato, numeroParcelas);

        System.out.println("Prestações: ");
        for (Prestacoes x : contrato.getPrestacoes()) {
            System.out.println(x);

            sc.close();
        }
    }
}
