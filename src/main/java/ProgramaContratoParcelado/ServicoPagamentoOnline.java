package ProgramaContratoParcelado;

public interface ServicoPagamentoOnline {

    double taxaPagamento (double pagamento);
    double taxaJuros (double pagamento, int meses);
}
