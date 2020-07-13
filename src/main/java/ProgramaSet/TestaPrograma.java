    package ProgramaSet;

    import java.util.HashSet;
    import java.util.Set;

    public class TestaPrograma {

        public static void main(String[] args) {

            Set<String> set = new HashSet<>(); //Podemos utilizar além do "HashSet" o "LinkedHashSet" e o "TreeSet"

            set.add("TV");
            set.add("Notebook");
            set.add("Tablet");

            System.out.println(set.contains("Notebook"));

            set.remove("Tablet");
            set.removeIf(x -> x.length() >= 3);
            set.removeIf( x -> x.charAt(0) == 'T');

            for (String p : set) {
                System.out.println(p);
            }
        }
    }
