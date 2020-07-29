package ProgramaListCuringa;

import ProgramaMaiorNumero.Numero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTipoCuringaDelimitada {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        intList.add(8);
        intList.add(10);

        List<? extends Number> list = intList;

        Number x = list.get(0); //Erro ao tentar inserir um elemento na lista
//________________________________________________________________________________________
//        List<Object> myObjs = new ArrayList<>();
//
//        myObjs.add("Maria");
//        myObjs.add("Silva");
//
//        List<? super Number> myNums = myObjs;
//
//        myNums.add(10);
//        myNums.add(1.4);
//
//        Number x = myNums.get(0); //Atribuição não ilegal de inserir em uma lista
//________________________________________________________________________________________

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(1.3, 4.3);
        List<Object> myObj = new ArrayList<>();

        copy(myInts, myObj);
        imprimiList(myObj);
        copy(myDoubles, myObj);
        imprimiList(myObj);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destino) {
        for (Number number : source) {
            destino.add(number);
        }
    }

    public static void imprimiList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
