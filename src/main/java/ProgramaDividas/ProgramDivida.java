package ProgramaDividas;

import java.time.LocalDate;

public class ProgramDivida {

    public static void main(String[] args) {
        double valorTotalComTaxas = 0;

        Divida divida = new Divida(600.0, 500.0, LocalDate.of(2020, 05, 30));

        divida.getContaAluguem();
        divida.getContaCarro();
        divida.getDataVencimento();

        boolean isContaVencida = MetodoDivida.isContaVencida(DescricaoConta.CONTA_A, divida.getDataVencimento());

        if (isContaVencida){
            valorTotalComTaxas = MetodoDivida.valorAPagarComtaxas(DescricaoConta.CONTA_B, divida.getContaAluguem());
        }

        System.out.println("A conta encontra-se vencida?: " + isContaVencida);

        if (isContaVencida) {
            System.out.println("Valor adicionado na conta vencida " + valorTotalComTaxas);
        }
        else {
            System.out.println("Valor a pagar: " + divida.getContaAluguem());
        }

    }

}
