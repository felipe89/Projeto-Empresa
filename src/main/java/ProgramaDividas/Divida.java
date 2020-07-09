package ProgramaDividas;

import java.time.LocalDate;

public class Divida {

    private double contaAluguem;
    private double contaCarro;
    private LocalDate dataVencimento;

    public Divida(double contaAluguem, double contaCarro, LocalDate dataVencimento) {
        this.contaAluguem = contaAluguem;
        this.contaCarro = contaCarro;
        this.dataVencimento = dataVencimento;
    }

    public double getContaAluguem() {
        return contaAluguem;
    }

    public void setContaAluguem(double contaAluguem) {
        this.contaAluguem = contaAluguem;
    }

    public double getContaCarro() {
        return contaCarro;
    }

    public void setContaCarro(double contaCarro) {
        this.contaCarro = contaCarro;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}