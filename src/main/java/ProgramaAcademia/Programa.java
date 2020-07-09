package ProgramaAcademia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formadoData = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe seu CPF: ");
        String cpf = entrada.nextLine();
        System.out.print("Data de nascimento(dd/MM/yyyy): ");
        Date data = formadoData.parse(entrada.next());

        System.out.print("É funcionario (S/N)? : ");
        char resposta = entrada.next().charAt(0);
        if (resposta == 'S'){
            System.out.print("Insira seu código de funcionario: ");
            int codigo = entrada.nextInt();
            Funcionario funcionario = new Funcionario(nome, cpf, data, codigo);
            System.out.println("Dados Funcionario " + funcionario.toString());
        }else {
            Usuario usuario = new Usuario(nome, cpf, data);
            System.out.println("Dados Usuario " + usuario.toString());
        }

        entrada.close();
    }
}
