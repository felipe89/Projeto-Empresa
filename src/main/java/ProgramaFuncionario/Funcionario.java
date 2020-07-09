package ProgramaFuncionario;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private LocalDate periodoAdmissao;

    public Funcionario(String nome, String cargo, double salario, LocalDate periodoAdmissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.periodoAdmissao = periodoAdmissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public LocalDate getPeriodoAdmissao() {
        return periodoAdmissao;
    }
    public void setPeriodoAdmissao(LocalDate periodoAdmissao) {
        this.periodoAdmissao = periodoAdmissao;
    }
}
