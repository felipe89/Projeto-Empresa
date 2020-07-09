package ProgramaContratoParcelado;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Prestacoes<toString> {

    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataVencimento;
    private Double valor;


    public Prestacoes(Date dataVencimento, Double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return formatoData.format(dataVencimento) + " - " + valor;
    }


}
