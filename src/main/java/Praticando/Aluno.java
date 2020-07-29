package Praticando;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Materia> materias;

    public Aluno(Materia materia) {
        this.materias = new ArrayList<>();
        this.materias.add(materia);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    public void adicionaMateria(Materia materia){

        this.materias.add(materia);
    }
}

