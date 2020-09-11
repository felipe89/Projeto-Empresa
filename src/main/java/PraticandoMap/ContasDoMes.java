package PraticandoMap;

import java.util.Objects;

public class ContasDoMes {

    private String nomeConta;
    private Double valorConta;

    public ContasDoMes(String nomeConta, Double valorConta) {
	this.nomeConta = nomeConta;
	this.valorConta = valorConta;
    }

    public String getNomeConta() {
	return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
	this.nomeConta = nomeConta;
    }

    public Double getValorConta() {
	return valorConta;
    }

    public void setValorConta(Double valorConta) {
	this.valorConta = valorConta;
    }

    @Override public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof ContasDoMes))
	    return false;
	ContasDoMes that = (ContasDoMes)o;
	return getNomeConta().equals(that.getNomeConta()) && getValorConta().equals(that.getValorConta());
    }

    @Override public int hashCode() {
	return Objects.hash(getNomeConta(), getValorConta());
    }
}
