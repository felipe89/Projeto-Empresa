package Praticando;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nomeMateria;
    private List<Double> notas;

    public Materia(String nomeMateria) {
        this.nomeMateria = nomeMateria;
        this.notas = new ArrayList<>();
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public double calculaNota() {

        double somaNotas = 0.0;

        for (double nota : this.notas) {
            somaNotas += nota;
        }
        return somaNotas;
    }

    public double calculaMedia(double media) {

        double calculaMedia = media / notas.size();

        if (calculaMedia > 7) {
            System.out.println("Aprovado");
        } else if (calculaMedia >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        return calculaMedia;
    }
    public void adicionaNota(double nota){

        this.notas.add(nota);
    }
}
