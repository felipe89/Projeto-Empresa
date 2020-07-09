package ProgramaCompras;

public class Calculador implements ServicoCalculaDesconto {

    public double calculaDesconto(int quantidade, double valor) {

        if (quantidade <= 10) {
            return quantidade * valor;
        } else if (quantidade <= 20) {
            double valorTotal = quantidade * valor;
            return desconto(valorTotal, 10);
        } else if (quantidade <= 50) {
            double valorTotal = quantidade * valor;
            return desconto(valorTotal, 20);
        } else {
            double valorTotal = quantidade * valor;
            return desconto(valorTotal, 25);
        }
    }

    @Override
    public double desconto(double valorTotal, int valorDesconto) {
        double valorPorcentagem = valorTotal * valorDesconto / 100;
        return valorTotal - valorPorcentagem;
    }
}
