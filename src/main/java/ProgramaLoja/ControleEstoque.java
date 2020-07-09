package ProgramaLoja;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoque {

    public boolean isTamanhoDisponivel(String tamanhoProduto) {

        List<String> tamanhoProdutoList = new ArrayList<>();
        tamanhoProdutoList.add("P");
        tamanhoProdutoList.add("M");
        tamanhoProdutoList.add("G");
        tamanhoProdutoList.add("GG");

        for (String tamanho : tamanhoProdutoList) {
            if (tamanhoProduto.equals(tamanho)) {
                return true;
            }
        }
        return false;
    }

    public boolean isCoresDisponivel(String corProduto) {

        List<String> coresList = new ArrayList<>();
        coresList.add("Preto");
        coresList.add("Branco");
        coresList.add("Azul");
        coresList.add("Rosa");

        for (String cor : coresList) {
            if (corProduto.equals(cor)) {
                return true;
            }
        }
        return false;
    }
}
