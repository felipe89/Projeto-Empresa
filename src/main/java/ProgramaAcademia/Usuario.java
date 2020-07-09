package ProgramaAcademia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {

    protected String nome;
    private String cpf;
    private Date dataNascimento;

    SimpleDateFormat formadoData = new SimpleDateFormat("dd/MM/yyyy");

    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + " " + nome + '\'' +
                ", CPF:" + cpf + '\'' +
                ", Data Nasc: " + formadoData.format(dataNascimento);
    }
}
