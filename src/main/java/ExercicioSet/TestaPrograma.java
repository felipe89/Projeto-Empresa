package ExercicioSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestaPrograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String path = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<EntradaLog> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(" ");
                String usuario = fields[0];
                Date momento = (Date) Date.from(Instant.parse(fields[1]));

                set.add(new EntradaLog(usuario, momento));

                line = br.readLine();
            }
            System.out.println("Total de usuario: " + set.size());

        }catch (IOException e){
            System.out.println("Erro:" + e.getMessage());
        }
        entrada.close();
    }
}
