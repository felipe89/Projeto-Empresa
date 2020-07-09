package ProgramaFile;

import java.io.File;
import java.util.Scanner;

public class ProgramaIndentificaNomeCaminhoArquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre no o caminho da pasta: ");

        String strString = sc.nextLine();
        File path = new File(strString);

        System.out.println("getPath: " + path.getPath()); //Informa o diretório e o arquivo relacionado
        System.out.println("getParent: " + path.getParent()); // Informa apenas o diretório
        System.out.println("getName: " + path.getName()); // Informa apenas o arquivo.

        sc.close();
    }
}
