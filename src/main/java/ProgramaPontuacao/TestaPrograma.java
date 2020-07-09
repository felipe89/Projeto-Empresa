package ProgramaPontuacao;

import ProgramaEstoque.DescricaoProduto;

public class TestaPrograma {
    public static void main(String[] args) {

        Ponto ponto = new Ponto("Passagem de Guarda", 2);

        String validaNomePosicao = DescricaoPosicao.definiPosicao(ponto.getNomePosicao());

        int validaPonto = DescricaoPosicao.aplicaPontuacao(ponto.getValorPontuacao());


        System.out.println("Nome da posição aplicada: " +" "+ validaNomePosicao + "\n " + "Pontuação Aplicada: " +"  "+  validaPonto);
    }
}
