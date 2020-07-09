package ProgramaNotas;

public class MetodosNotas {

    public static double calculoNotas(double notaA, double notaB, double notaC) {

        double somaNota = notaA + notaB + notaC;

        if (somaNota > 25) {
            System.out.println("Aprovado Direto");
        }
        else if (somaNota < 25) {
            System.out.println("Analise de Aprovação: " + somaNota);
        }

        return somaNota;
    }

    public static double mediaNota(double somaNota) {

        double mediaTotal = somaNota / 3;

        if (mediaTotal > 7) {
            System.out.println("Aprovado");
        }
        else if (mediaTotal >= 5) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
        return mediaTotal;
    }
}
