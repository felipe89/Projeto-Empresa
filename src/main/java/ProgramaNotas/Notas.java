package ProgramaNotas;

public class Notas {

    public static void main(String[] args) {

        NotaAno nota = new NotaAno(10.0, 7.3, 5.0);

        double calculoDeNotas = MetodosNotas.calculoNotas(nota.getNotaA(),nota.getNotaB(), nota.getNotaC());
        double mediaTotal = MetodosNotas.mediaNota(calculoDeNotas);

        System.out.println("Soma das notas: " + calculoDeNotas);
        System.out.println("Media das notas:" + mediaTotal);

    }
}
