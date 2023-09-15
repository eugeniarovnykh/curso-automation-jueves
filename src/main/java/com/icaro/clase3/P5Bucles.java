package com.icaro.clase3;

public class P5Bucles {

    public static void main(String[] args) {

        // WHILE
        int contadorWhile = 0;

        while(contadorWhile < 5) {
            System.out.println("Hola Mundo");
            contadorWhile = contadorWhile + 1; // contadorWhile++ // contadorWhile += 1
        }

        System.out.println();

        // DO-WHILE
        int contadorDoWhile = 0;

        do {
            System.out.println("Hola Mundo");
            contadorDoWhile = contadorDoWhile + 1;
        } while (contadorDoWhile < 5);

        System.out.println();

        // FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo");
        }
    }
}
