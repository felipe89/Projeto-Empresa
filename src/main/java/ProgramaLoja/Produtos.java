package ProgramaLoja;

public class Produtos {

    private String tamanha;
    private String modelo;
    private Double valorProduto;
    private String cor;

    public Produtos(String tamanha, String modelo, Double valorProduto, String cor) {
        this.tamanha = tamanha;
        this.modelo = modelo;
        this.valorProduto = valorProduto;
        this.cor =  cor;
    }

    public String getTamanha() {
        return tamanha;
    }

    public void setTamanha(String tamanha) {
        this.tamanha = tamanha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  tamanha + " "
                + modelo + " "
                + valorProduto + " "
                + cor;
    }
}
