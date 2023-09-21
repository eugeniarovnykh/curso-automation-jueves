package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7EjercicioIntegrador {

    public static void main(String[] args) {
//        Ingresar por consola un número mientras sea menor o igual a 500
//        y almacenar el número en una lista.
//
//        Al finalizar el ingreso mostrar los datos
//        y la cantidad ingresada por pantalla.
//         También, sí hubo menos de 10 ingresos mostrar “Se ingresaron pocos números”
//        de los contrario mostrar “Se excedió la cantidad de ingresos”

        Scanner scanner = new Scanner(System.in);

        Integer numero;
//        int cantidad = 0;

        List<Integer> miLista = new ArrayList<>();

        System.out.println("El ingreso finaliza con un numero mayor a 500");
        do {
            System.out.println("Ingresar un numero");
            numero = scanner.nextInt();

            miLista.add(numero);
//            cantidad++;
        } while (numero <= 500);

        System.out.println("Cantidad ingresa: " + miLista.size());

        if (miLista.size() < 10) {
            System.out.println("Se ingresaron pocos numeros");
        } else {
            System.out.println("Se excedió la cantidad de ingresos");
        }
    }
}
