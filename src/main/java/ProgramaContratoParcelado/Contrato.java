package ProgramaContratoParcelado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;
    private Date dataContrato;
    private Double valorTotal;

    private List<Prestacoes> prestacoes = new ArrayList<>();

    public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prestacoes> getPrestacoes() {
        return prestacoes;
    }

    public void setPrestacoes(List<Prestacoes> prestacoes) {
        this.prestacoes = prestacoes;
    }

    public void addPrestacoes(Prestacoes prestacoes) {
        this.prestacoes.add(prestacoes);
    }
    public void removePrestacoes(Prestacoes prestacoes){
        this.prestacoes.remove(prestacoes);
    }
}







