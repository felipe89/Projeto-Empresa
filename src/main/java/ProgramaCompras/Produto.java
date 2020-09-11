package ProgramaCompras;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotal;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String tv, double v) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return this.valorTotal = preco * quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Preço: " + preco +
                ", Quantidade: " + quantidade + ", ";


    }
}
