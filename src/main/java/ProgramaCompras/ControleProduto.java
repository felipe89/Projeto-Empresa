package ProgramaCompras;

import java.util.ArrayList;
import java.util.List;

public class ControleProduto {

    public boolean isProdutoDisponivel(String nomeProduto) {

        List<String> descricaoProdutoList = new ArrayList<>();
        descricaoProdutoList.add("Camisetas");
        descricaoProdutoList.add("Calças");
        descricaoProdutoList.add("Meias");
        descricaoProdutoList.add("Cuecas");

        for (String produto : descricaoProdutoList) {
            if (nomeProduto.equals(produto)) {
                return true;
            }
        }
        return false;
    }
}
