package com.icaro.clase4.herencia;

public class Coche extends Vehiculo {
//    Crea una clase llamada Coche que herede de la clase Vehiculo.
//    La clase Coche debe tener una propiedad adicional privada:
//
//    cilindrada (tipo: int)
//    La clase Coche debe tener los siguientes métodos:
//
//    Un constructor que reciba los valores para la marca, modelo, año y
//    cilindrada, y los asigne a las propiedades correspondientes.
//    Métodos get y set para la propiedad cilindrada.
//    Un método acelerar() que imprima un mensaje indicando que el coche está acelerando.
//    Este método debe sobrescribir al método acelerar() de la clase Vehiculo.

    private int cilindrada;

    public Coche(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("Coche acelerando");
    }
}
