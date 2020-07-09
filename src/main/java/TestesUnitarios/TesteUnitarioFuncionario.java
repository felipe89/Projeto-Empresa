package TestesUnitarios;

import ProgramaFuncionario.Funcionario;
import ProgramaFuncionario.MetodoFuncionario;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TesteUnitarioFuncionario {

    @Test
    public void testFuncionarioExperienciaProrrogada(){

        String statusFuncionario = MetodoFuncionario.peridoAdmissão(LocalDate.of(2020, 05, 4));

        assertEquals("Periodo de experiencia prorrogado", statusFuncionario);
    }

    @Test
    public  void  testFuncionarioAdmitido(){

        String statusFuncionario = MetodoFuncionario.peridoAdmissão(LocalDate.of(2020, 02, 4));

        assertEquals("Contrato efetuada", statusFuncionario);
    }
    @Test
    public void testFuncionarioNaoPassouPeriodoExperiencia(){

        String statusFuncionario = MetodoFuncionario.peridoAdmissão(LocalDate.of(2020, 06, 4));

        assertEquals("Não houve aprovação", statusFuncionario);
    }
    @Test
    public void testAjustaSalarioFuncionario(){

        Funcionario funcionario = new Funcionario("Felipe", "Analista", 0, LocalDate.of(2019,12,10));

        double salarialAjustado = MetodoFuncionario.ajusteSalarial(funcionario.getSalario());

        Assert.assertEquals (0, salarialAjustado);

    }
}
