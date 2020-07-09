package ProgramaUtilizandoGenerics;

import java.util.ArrayList;
import java.util.List;

public class ImprimirServico <T> {

    private List<T> list = new ArrayList<>();

    public void addValor(T valor) {
        list.add(valor);
    }

    public T primeiroValor() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista esta vazia");
        }
        return list.get(0);
    }

    public void imprime() {
        System.out.print(" [");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.print("] ");
    }
}
