package PraticandoMap;

import java.util.HashMap;
import java.util.Map;

public class ProgramaMapII {

    public static void main(String[] args) {
        Map<ProdutoMap, Double> estoque = new HashMap<>();

        ProdutoMap p1 = new ProdutoMap("TV", 900.0);
        ProdutoMap p2 = new ProdutoMap("NoteBook", 1200.0);
        ProdutoMap p3 = new ProdutoMap("Tablet", 400.0);

        estoque.put(p1, 1000.0);
        estoque.put(p2, 2000.0);
        estoque.put(p3, 1500.0);

        ProdutoMap ps = new ProdutoMap("TV", 900.0);

        System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));
    }
}