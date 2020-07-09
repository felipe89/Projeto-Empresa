package PraticandoMetodosVariaveis;

public class CalculoConta {

    public static void main(String[] args) {

        int contaLuz = 100;
        int contaInternet = 104;

        int somaTotal = valorTotalConta(contaLuz, contaInternet);

        System.out.println(somaTotal);

    }

    public static int valorTotalConta(int contaLuz, int contaInternet) {

        int valorSomado = contaLuz + contaInternet;

        return valorSomado;

    }
}
