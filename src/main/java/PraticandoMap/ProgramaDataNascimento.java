package PraticandoMap;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class ProgramaDataNascimento {

    public static void main(String[] args) {
        Map<ContasDoMes, Double> contasMes = new HashMap<>();

        ContasDoMes cdm = new ContasDoMes("Luz", 100.0);
        ContasDoMes cdm2 = new ContasDoMes("Telefone", 89.0);
        ContasDoMes cdm3 = new ContasDoMes("Aluguel", 600.0);

        contasMes.put(cdm, 100.0);
        contasMes.put(cdm2, 50.10);
        contasMes.put(cdm3, 10.20);

        ContasDoMes cs = new ContasDoMes("Carro", 500.0);

        out.println("Verifica map: " + contasMes.containsKey(cs));
    }
}
