package ProgramaSet;

import ProgramaCompras.Produto;

import java.util.Set;
import java.util.TreeSet;

public class TestaProdutoTreeSet {
    public static void main(String[] args) {

        Set<ProdutoTreeSet> set = new TreeSet<>();

        set.add(new ProdutoTreeSet("TV", 900.0));
        set.add(new ProdutoTreeSet("Notebook", 1200.0));
        set.add(new ProdutoTreeSet("Tablet", 400.0));

        for (ProdutoTreeSet p : set) {
            System.out.println(p);
        }
    }
}
