package ProgramaPontuacao;

public class Ponto {

    private String nomePosicao;
    private Integer valorPontuacao;

    public Ponto(String nomePosicao, Integer valorPontuacao) {
        this.nomePosicao = nomePosicao;
        this.valorPontuacao = valorPontuacao;
    }

    public String getNomePosicao() {
        return nomePosicao;
    }

    public void setNomePosicao(String nomePosicao) {
        this.nomePosicao = nomePosicao;
    }

    public Integer getValorPontuacao() {
        return valorPontuacao;
    }

    public void setValorPontuacao(Integer valorPontuacao) {
        this.valorPontuacao = valorPontuacao;
    }
}
