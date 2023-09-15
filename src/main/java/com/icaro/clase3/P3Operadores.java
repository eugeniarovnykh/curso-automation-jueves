package com.icaro.clase3;

public class P3Operadores {

    public static void main(String[] args) {

        // Operadores aritmeticos
        int suma = 10 + 10;
        int resta = 10 - 12;
        int multiplicacion = 10 * 5;
        int division = 10 / 2;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        // Operadores relaciones
        boolean menor = 10 < 20;
        System.out.println(menor);

        boolean menorOIgual = 10 <= 10; // y 10 < 10??
        System.out.println(menorOIgual);

        System.out.println(10 > 20);
        System.out.println(100 >= 50);
        System.out.println(300 == 30);
        System.out.println(300 != 30);

        // Operadores condicionales
        System.out.println((10 < 20) && ('a' == 'b'));
        System.out.println((10 == 2*5) && (100 > 10));
        System.out.println((1 > 0) || (5 != 5));
        System.out.println(!true);
        System.out.println(!false);
    }
}
