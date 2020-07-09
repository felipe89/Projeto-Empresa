package ProgramaCompras;

import java.util.Locale;
import java.util.Scanner;

public class TestaPrograma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o produto desejado:");
        String nomeProduto = entrada.nextLine();
        System.out.print("Informe a quantidade desejada: ");
        int qntProduto = entrada.nextInt();
        System.out.print("Informe o preço unitario: ");
        double precoProduto = entrada.nextDouble();

        Produto produto = new Produto(nomeProduto, precoProduto, qntProduto);

        ControleProduto controleProduto = new ControleProduto();
        boolean produtoDisponivel = controleProduto.isProdutoDisponivel(produto.getNome());

        if (produtoDisponivel) {

            Calculador calculador = new Calculador();

            double valorTotalComDesconto = calculador.calculaDesconto(produto.getQuantidade(), produto.getPreco());
            System.out.println("Valore total: " + produto.toString() + "  " + "Valor total sem desconto: " + produto.getValorTotal() + " ,Valor total com desconto: " + valorTotalComDesconto);
        } else {
            System.out.println("Produto não disponivel");
        }

        entrada.close();
    }
}
