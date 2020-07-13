package ProgramaSet;

import java.util.Objects;

public class ProdutoTreeSet implements Comparable <ProdutoTreeSet>{

    private String nome;
    private Double preco;

    public ProdutoTreeSet(String nome, Double preco) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoTreeSet)) return false;
        ProdutoTreeSet produto = (ProdutoTreeSet) o;
        return Objects.equals(getNome(), produto.getNome()) &&
                Objects.equals(getPreco(), produto.getPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco());
    }

    @Override
    public String toString() {
        return "ProdutoTreeSet{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
    @Override
    public int compareTo(ProdutoTreeSet other) {
        return nome.toUpperCase().compareTo(other.getNome().toUpperCase());
    }
}
