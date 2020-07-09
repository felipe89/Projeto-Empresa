package ProgramaFile;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.font.FontRenderContext;
import java.io.File;
import java.util.Scanner;

public class ProgramaManipulandoPastasArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o diretório: "); ///home/gilmar/Área de Trabalho/Arq.Importantes
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES");
        for (File file : files) {
            System.out.println(files);
        }
        boolean arqCriado = new File(strPath + "\\criApasta").mkdir();
        System.out.println("Diretorio criado com sucesso " + arqCriado);

        sc.close();
    }
}
