package ProgramaEmprestimo;

import java.security.InvalidParameterException;

public interface ServicoJuros {

    double getTaxaJuros();

    default double pagamento(double valor, int meses) {
        if (meses < 1) {
            throw new InvalidParameterException("meses deve ser maior que zero");
        }
        return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, meses);
    }
}
