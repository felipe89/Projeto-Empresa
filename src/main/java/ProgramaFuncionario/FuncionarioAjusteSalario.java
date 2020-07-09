package ProgramaFuncionario;

import java.time.LocalDate;

public class FuncionarioAjusteSalario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Felipe", "Analista", 600.0, LocalDate.of(2020, 07, 01));

        funcionario.getNome();
        funcionario.getCargo();
        funcionario.getSalario();
        funcionario.getPeriodoAdmissao();

        String funcionario1 = MetodoFuncionario.peridoAdmissão(funcionario.getPeriodoAdmissao());
        double ajusteSalarial = MetodoFuncionario.ajusteSalarial(funcionario.getSalario());

        System.out.println("Dados Funcionario: " + funcionario1);
        System.out.println("Salario Funcionario: " + ajusteSalarial);

    }
}
