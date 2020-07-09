package ProgramaContratoParcelado;

import java.util.Date;
import java.util.Calendar;

public class ContratoServiço {

    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ContratoServiço(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public Contrato processoContrato(Contrato contrato, int meses) {
        double cotaBasica = contrato.getValorTotal() / meses;
        for (int contador = 1; contador <= meses; contador++) {
            Date data = addMeses(contrato.getDataContrato(), contador);
            double cotaAtualizada = cotaBasica + servicoPagamentoOnline.taxaJuros(cotaBasica, contador);
            double cotaTotal = cotaAtualizada + servicoPagamentoOnline.taxaPagamento(cotaAtualizada);
            contrato.addPrestacoes(new Prestacoes( data, cotaTotal));
        }
        return contrato;
    }

    private Date addMeses(Date data, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();

    }
}

