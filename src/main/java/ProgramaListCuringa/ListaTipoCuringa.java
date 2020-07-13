package ProgramaListCuringa;

import java.util.Arrays;
import java.util.List;

public class ListaTipoCuringa {
    public static void main(String[] args) {

        List<Integer> minhaLista = Arrays.asList(2, 5, 9);
        printList(minhaLista);

        List<String> minhaListaII = Arrays.asList("Maria", "Jose", "Aparecida");
        printList(minhaListaII);

    }
    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
