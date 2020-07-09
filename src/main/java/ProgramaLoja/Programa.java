package ProgramaLoja;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Modelo do produto: ");
        String modelo = entrada.nextLine();
        System.out.print("Tamanho desejado: ");
        String tamanho = entrada.nextLine();
        System.out.print("Cor desejada: ");
        String cor = entrada.nextLine();
        System.out.print("Valor produto: ");
        double valor = entrada.nextDouble();

        Produtos produtos = new Produtos(tamanho,modelo,valor, cor);

        ControleEstoque controleEstoque = new ControleEstoque();

        boolean corDisponivel = controleEstoque.isCoresDisponivel(produtos.getCor());
        boolean tamanhoDisponivel = controleEstoque.isTamanhoDisponivel(produtos.getTamanha());

        if (corDisponivel && tamanhoDisponivel) {
            CalculoDeVenda calculoDeVenda = new CalculoDeVenda();
            double valorvenda = calculoDeVenda.valorProduto(produtos.getValorProduto());
            System.out.println("Valor total da venda é de : " + valorvenda);
        } else {
            System.out.println("Não disponivel em estoque");
        }

        entrada.close();
    }
}
