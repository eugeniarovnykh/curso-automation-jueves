package com.icaro.clase5;

public class Cuadrado extends Figura implements Dibujable {

    //    Crear la clase Cuadrado que extienda de Figura. Esta clase tiene el atributo lado

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cudrado");
    }
}
