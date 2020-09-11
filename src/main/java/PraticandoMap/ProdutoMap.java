package PraticandoMap;

import java.util.Objects;

public class ProdutoMap {

    private String nome;
    private Double preco;

    public ProdutoMap(String nome, Double preco) {
	this.nome = nome;
	this.preco = preco;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Double getPreco() {
	return preco;
    }

    public void setPreco(Double preco) {
	this.preco = preco;
    }

    @Override public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (!(o instanceof ProdutoMap))
	    return false;
	ProdutoMap that = (ProdutoMap)o;
	return getNome().equals(that.getNome()) && getPreco().equals(that.getPreco());
    }

    @Override public int hashCode() {
	return Objects.hash(getNome(), getPreco());
    }
}
