package com.icaro.clase4.herencia;

public class HerenciaMain {

//    En el método main, crea una instancia de la clase Vehiculo
//    con los valores "Toyota", "Corolla" y 2020. Luego,
//    crea una instancia de la clase Coche con los valores "Ford", "Mustang", 2021 y 5000.
//
//    Imprime los detalles del vehículo y del coche utilizando los métodos get,
//    y luego llama al método acelerar() correspondiente para cada objeto.

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);

        Coche coche = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println("Marca vehiculo: " + vehiculo.getMarca());
        System.out.println("Modelo vehiculo: " + vehiculo.getModelo());
        System.out.println("Anio vehiculo: " + vehiculo.getAnio());

        System.out.println("Marca coche: " + coche.getMarca());
        System.out.println("Modelo coche: " + coche.getModelo());
        System.out.println("Anio coche: " + coche.getAnio());
        System.out.println("Cilindrada coche: " + coche.getCilindrada());

        vehiculo.acelerar();
        coche.acelerar();
    }
}
