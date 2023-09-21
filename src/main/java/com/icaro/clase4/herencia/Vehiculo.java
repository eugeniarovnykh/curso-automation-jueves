package com.icaro.clase4.herencia;

public class Vehiculo {

//    Crea una clase llamada Vehiculo con las siguientes propiedades privadas:
//    marca (tipo: String)
//    modelo (tipo: String)
//    año (tipo: int)
//    La clase Vehiculo debe tener los siguientes métodos:
//    Un constructor que reciba los valores para la marca, modelo y año, y los asigne a las propiedades correspondientes.
//    Métodos get para obtener los valores de las propiedades marca, modelo y año.
//    Métodos acelerar() y frenar() que simplemente impriman un mensaje indicando la acción.

    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void acelerar() {
        System.out.println("Vehiculo acelerando");
    }

    public void frenar() {
        System.out.println("Vehiculo frenando");
    }
}
