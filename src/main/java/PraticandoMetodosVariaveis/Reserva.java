package PraticandoMetodosVariaveis;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Reserva {

    public static void main(String[] args) {

        double valorRav = 40.0;
        double valorTaxaEmb = 29.30;
        double valorTarifa = 120.0;
        double valorRc = 20.0;
        double valorMulta = 150.0;

        double totalReserva = somaTotalReserva(valorRav, valorTaxaEmb, valorTarifa, valorRc);
        double descontoMulta = valorMulta(valorMulta, totalReserva);

        System.out.println(totalReserva );
        System.out.println(descontoMulta);

    }

    public static double somaTotalReserva(double valorRav, double valorTaxaEmb, double valorTarifa, double valorRc) {

        double soma = valorRav + valorTaxaEmb + valorTarifa + valorRc;

        return soma;
    }

    public static double valorMulta(double valorMulta, double totalReserva) {

        double subtracaoMulta = valorMulta - totalReserva;

        return subtracaoMulta;
    }
}
