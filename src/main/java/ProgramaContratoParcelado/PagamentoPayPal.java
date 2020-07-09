package ProgramaContratoParcelado;

public class PagamentoPayPal implements ServicoPagamentoOnline {

    private static final double PERCENTUAL_TAXA = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public double taxaPagamento(double pagamento) {
        return pagamento * PERCENTUAL_TAXA;
    }
    @Override
    public double taxaJuros(double pagamento, int meses) {
        return pagamento * JUROS_MENSAIS * meses;
    }
}
