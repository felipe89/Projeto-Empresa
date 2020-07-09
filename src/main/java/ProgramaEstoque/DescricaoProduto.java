package ProgramaEstoque;

import java.util.ArrayList;
import java.util.List;

public class DescricaoProduto {

    public static String descricaoProduto(String nomeProduto) {

        List<String> nomeProdutoList = new ArrayList<>();
        nomeProdutoList.add("VASSOURA");
        nomeProdutoList.add("PANO");
        nomeProdutoList.add("RODO");

        for (String nome : nomeProdutoList) {
            if (nomeProduto.equals(nome)) {
                return nome;
            }
        }
        return "Não Existe o produto em estoque";
    }
}
