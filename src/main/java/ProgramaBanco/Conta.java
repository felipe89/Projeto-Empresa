package ProgramaBanco;

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    public Conta() {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double deposita(double depositaValor){
        return saldo += depositaValor;
    }
    public double saca(double sacaValor){
        if (sacaValor > saldo){
            System.out.println("Valor acima do limite disponivel");
        }
        return saldo -= sacaValor;
    }
    public double atualizaSaldo(double saldoAtual){
        return saldo - saca(saldoAtual);
    }
}
