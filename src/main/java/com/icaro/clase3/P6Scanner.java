package com.icaro.clase3;

import java.util.Scanner;

public class P6Scanner {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresar un entero");
        int entero = miScanner.nextInt();
        System.out.println("Ingresar una cadena");
        String cadena = miScanner.next(); // miScanner.nextLine();
        System.out.println("Ingresar un flotante");
        float flotante = miScanner.nextFloat();

        System.out.println("Entero ingresado: " + entero);
        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("Flotante ingresado" + flotante);

        miScanner.close();

    }
}
