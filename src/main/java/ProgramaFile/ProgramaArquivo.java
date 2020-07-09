package ProgramaFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaArquivo {

    public static void main(String[] args) {

        File file = new File("/home/gilmar/Área de Trabalho/Arq.Importantes/tst_java.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
