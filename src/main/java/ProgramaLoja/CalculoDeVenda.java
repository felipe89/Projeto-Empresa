package ProgramaLoja;

import java.util.ArrayList;
import java.util.List;

public class CalculoDeVenda {

    public double valorProduto(Double valorProduto){

        double taxaEntrega = 20.0;

        List<Double> valorPecas = new ArrayList<>();
        valorPecas.add(100.00);
        valorPecas.add(50.00);
        valorPecas.add(60.00);
        valorPecas.add(80.00);

        for (Double valor : valorPecas) {
            if (valor.equals(valorProduto)){
                return valorProduto + taxaEntrega ;
            }
        }
        return valorProduto;
    }
}
