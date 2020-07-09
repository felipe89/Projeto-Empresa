package ProgramaPontuacao;

import java.util.ArrayList;
import java.util.List;

public class DescricaoPosicao {

    public static String definiPosicao(String nome){

        List<String> nomePosicaoList = new ArrayList<>();

        nomePosicaoList.add("Passagem de Guarda");
        nomePosicaoList.add("Raspagem");
        nomePosicaoList.add("Quatro Apoio");
        nomePosicaoList.add("Vantagem");

        for (String posicao : nomePosicaoList) {
            if (nome.equals(posicao));
            return nome;
        }
        return "Nome posição não encontrada";
    }

    public static int aplicaPontuacao(int ponto){

        if (ponto > 0){
            return ponto;
        }
        return ponto;
    }
}
