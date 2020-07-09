package ProgramaDividas;

import java.time.LocalDate;

public class MetodoDivida {

    public static boolean isContaVencida(DescricaoConta statusConta, LocalDate dataVencimento) {
        LocalDate dataPagamento = LocalDate.now();
        if (dataPagamento.isAfter(dataVencimento)) {
            return true;
        }

        return false;
    }

    public static double valorAPagarComtaxas (DescricaoConta statusConta, double valor) {

        double porcentagem = 1.0 /100 * valor; //Aplicação de valor porcentagem encima do valor total quando status estiver como Vencido.

        if (statusConta.descricao.equals("VENCIDA")){
            return valor += porcentagem;
        }

        return valor;
    }
}

