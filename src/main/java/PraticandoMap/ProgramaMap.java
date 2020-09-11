package PraticandoMap;

import java.util.Map;
import java.util.TreeMap;

public class ProgramaMap {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("nome", "Gilmar");
        cookies.put("email", "gfelipe.trindade@gmail.com");
        cookies.put("Telefone", "11950440323");

        cookies.remove("email");
        cookies.put("Telefone", "11950440322");

        System.out.println("Contains 'Telefone' key: " + cookies.containsKey("Telefone"));
        System.out.println("Numero telefone: " + cookies.get("Telefone"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("Informe os cookies: ");
        for (String key : cookies.keySet()){
	    System.out.println(key + ": " + cookies.get(key));
        }
    }
}
