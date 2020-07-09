package ProgramaEstoque;

import java.util.ArrayList;
import java.util.List;

public class CodigoProduto {

    public static String codigoCadastroProduto(Integer codProduto) {

        List<Integer> numeroProdutoList = new ArrayList<>();
        numeroProdutoList.add(1234);
        numeroProdutoList.add(4321);
        numeroProdutoList.add(9876);

        for (Integer produto : numeroProdutoList) {
            if (codProduto.equals(produto)) {
                return "Código de produto em estoque";
            }
        }
        return "Produto não existente em estoque";
    }
}

