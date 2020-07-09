package ProgramaEstoque;

public class Produtos {

    private String nomeProduto;
    private Integer codigoProduto;
    private Integer quantidadeProduto;

    public Produtos(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
