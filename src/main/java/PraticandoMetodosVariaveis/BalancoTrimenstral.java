package PraticandoMetodosVariaveis;

public class BalancoTrimenstral {

    public static void main(String[] args) {

        int gastosJaneiro = 35000;
        int gastosFevereiro = 78000;
        int gastosMarço = 19000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;

        int valorDaMedia = calculoMediaMensal(gastosTrimestre);

        System.out.println(valorDaMedia);


//        System.out.println("Gasto Trimestre: " +gastosTrimestre);
//
//        int mediaMensal = gastosTrimestre / 3;

//        System.out.println("Media Mensal: " +mediaMensal);

//        BigDecimal gastosTrimestre = BigDecimal.ZERO;
//        BigDecimal mediaMensal = BigDecimal.ZERO;
//        BigDecimal gastoJaneiro = new BigDecimal(35000);
//        BigDecimal gastosFevereiro = new BigDecimal(78000);
//        BigDecimal gastosMarço = new BigDecimal(19000);
//        gastosTrimestre = gastosTrimestre .add(gastoJaneiro).add(gastosFevereiro).add(gastosMarço);
//
//        System.out.println("Gasto Trimestre: " + gastosTrimestre.floatValue());
//
//        mediaMensal = mediaMensal.add(gastosTrimestre).divide(BigDecimal.valueOf(3));
//
//        System.out.println("Media Mensal: " + mediaMensal.floatValue());
    }

    public static int calculoMediaMensal(int gastosTrimestre){

        int mediaMensal = gastosTrimestre / 3;

        return mediaMensal;
    }
}
