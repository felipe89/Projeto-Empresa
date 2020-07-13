package ProgramaHashCodeEquals;

public class TestaPrograma {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jady ", "gfelipe.trindade@gmail.com");
        Cliente cliente1 = new Cliente("Jady", "gfelipe.trindade@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(cliente.hashCode());
        System.out.println(cliente1.hashCode());
        System.out.println(cliente.equals(cliente1)); //Compara Igualdade de objeto usar equals
        System.out.println(cliente == cliente1); // Compara as referencias de objetos utilizar ==
        System.out.println(s1 == s2);
    }
}
