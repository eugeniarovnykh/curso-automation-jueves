package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;

public class P2Colecciones {

    public static void main(String[] args) {

        // ARRAYS
        int[] arrayDeEnteros = new int[3];

        arrayDeEnteros[0] = 20;
        arrayDeEnteros[1] = 1000;
        arrayDeEnteros[2] = 500;

        System.out.println("Posicion 0: " + arrayDeEnteros[0]);
        System.out.println("Posicion 1: " + arrayDeEnteros[1]);
        System.out.println("Posicion 2: " + arrayDeEnteros[2]);

        //System.out.println("Posicion 3:" + arrayDeEnteros[3]);


        // LISTAS
        List<String> listaDeStrings = new ArrayList<>();

        listaDeStrings.add("Hola");
        listaDeStrings.add("soy");
        listaDeStrings.add("Cesar");

        System.out.println("Posicion 0: " + listaDeStrings.get(0));
        System.out.println("Posicion 1: " + listaDeStrings.get(1));
        System.out.println("Posicion 2: " + listaDeStrings.get(2));

        System.out.println(listaDeStrings);

        //System.out.println("Posicion 3:" + listaDeStrings.get(3));

        listaDeStrings.remove(1);
        System.out.println(listaDeStrings);
    }
}
