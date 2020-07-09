package ProgramaAcademia;

import java.util.Date;

public class Funcionario extends Usuario {

    private int codigoFuncionario;

    public Funcionario(String nome, String cpf, Date dataNascimento, int codigoFuncionario) {
        super(nome, cpf, dataNascimento);
        this.codigoFuncionario = codigoFuncionario;

    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    @Override
    public String toString() {
        return "Nome: " + " " + super.nome + '\'' +              //Exemplo de uso do protected
                ", CPF:" + super.getCpf() + '\'' +
                ", Data Nasc: " + formadoData.format(super.getDataNascimento()) + '\''+
                ", Código Funcionario: " + codigoFuncionario;
    }
}

