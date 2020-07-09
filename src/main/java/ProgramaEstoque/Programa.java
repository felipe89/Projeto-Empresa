package ProgramaEstoque;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o produto: ");
        String nomeProduto = entrada.nextLine();
        System.out.print("Informe o código do produto: ");
        int codProduto = entrada.nextInt();
        System.out.print("Quantidade em estoque: ");
        int quantidadeProduto = entrada.nextInt();

        Produtos produtos = new Produtos(nomeProduto, codProduto, quantidadeProduto);

        ControleEstoque controleEstoque = new ControleEstoque();

        String qntEstoque = controleEstoque.quantidadeProduto(produtos.getQuantidadeProduto());
        System.out.println(qntEstoque);

        String codigoDisponivel = CodigoProduto.codigoCadastroProduto(produtos.getCodigoProduto());
        System.out.println(codigoDisponivel);

        String informacoesProduto = DescricaoProduto.descricaoProduto(produtos.getNomeProduto());
        System.out.println(informacoesProduto);

        entrada.close();
    }
}
