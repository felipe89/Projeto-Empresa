package ProgramacaoLambda;

import java.util.Arrays;

public class Programa {

    public static int globalValue = 3;

    public static void main(String[] args) {

        int [] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    private static void changeOddValues(int[] numero) {
        for (int i = 0; i < numero.length; i++){
            if (numero[i] %2 !=0){
                numero[i] += globalValue;
            }
        }
    }

}
