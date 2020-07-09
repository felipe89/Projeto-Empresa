package ProgramaFuncionario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MetodoFuncionario {

    public static String peridoAdmissão(LocalDate dataAdimissao) {

        LocalDate periodoAdmissao = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(dataAdimissao, periodoAdmissao);

        if (dias == 45) {
            return "Periodo de experiencia prorrogado";
        }
        else if (dias >= 90) {
            return "Contratação efetuada";
        }

        return "Periodo de experiencia não prorrogado";
    }

    public static double ajusteSalarial(double valor) {

        double valorFuncionario = 1.5 / 100 * valor;
        double valorGerente = 2.5 /100 * valor;

        if (valor <= 0) {
            return 0;
        }
        if (valor <= 1500.0) {
            return valor += valorFuncionario;
        }
        if (valor >= 2000.0) {
            return valor += valorGerente;
        }
        return valor;
    }
}

