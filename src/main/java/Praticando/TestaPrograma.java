package Praticando;

import java.util.Locale;

public class TestaPrograma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Materia portugues = new Materia("Português");
        portugues.adicionaNota(5.4);
        portugues.adicionaNota(5.5);
        portugues.adicionaNota(6.7);
        double notaCalculada = portugues.calculaNota();

        Materia matematica = new Materia("Matematica");
        matematica.adicionaNota(5.5);
        matematica.adicionaNota(3.4);
        matematica.adicionaNota(1.0);
        double notaCalculada1 = matematica.calculaNota();

        Materia edFisica = new Materia("Ed.fisica");
        edFisica.adicionaNota(6.9);
        edFisica.adicionaNota(9.0);
        edFisica.adicionaNota(8.5);
        double notaCalculada2 = edFisica.calculaNota();

        Aluno aluno = new Aluno(portugues);
        aluno.adicionaMateria(matematica);
        aluno.adicionaMateria(edFisica);

        for (Materia materia : aluno.getMaterias()) {
            double somaDasNotas = materia.calculaNota();
            System.out.println(materia.calculaMedia(somaDasNotas) + " - " + materia.getNomeMateria());
        }
        System.out.println("_________________________________________________");
        double totalNotal = notaCalculada + notaCalculada1 + notaCalculada2;
        System.out.println("Soma das notas: " + totalNotal);
    }
}
