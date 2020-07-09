package ProgramaBanco;

public class TestaPrograma {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.setTitular("Felipe");
        conta.setNumero(1234);
        conta.setSaldo(1000.0);

        conta.deposita(100.0);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.saca(10.0);
        System.out.println("Saca: " + conta.getSaldo());
        System.out.println("Saldo atual: " + conta.atualizaSaldo(conta.getSaldo()));
    }
}
