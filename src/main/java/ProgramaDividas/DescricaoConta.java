package ProgramaDividas;

public enum DescricaoConta {

    CONTA_A("PAGO"),
    CONTA_B("VENCIDA");
    public String descricao;

    DescricaoConta(String statusConta){
        descricao = statusConta;

    }
}
