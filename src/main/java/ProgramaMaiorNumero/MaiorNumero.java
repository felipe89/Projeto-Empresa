package ProgramaMaiorNumero;

public class MaiorNumero {

    public static void main(String[] args) {

        Numero num = new Numero(100, 200);

        int comparaValoresInteiros = MetodoMaiorNumero.verificarMaiorNumero(num.getValor_A(), num.getValor_B());
        System.out.println("Compara valores Inteiro: " + comparaValoresInteiros);

        double somaValoresInteiros = MetodoMaiorNumero.somaDeValores(num.getValor_A(), num.getValor_B());
        System.out.println("Soma dos Inteiros: " +somaValoresInteiros);
    }
}

