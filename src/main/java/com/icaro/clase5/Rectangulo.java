package com.icaro.clase5;

public class Rectangulo extends Figura implements Dibujable {
//    Crear la clase Rectangulo que extienda de Figura. Esta clase tiene los atributos base y altura

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo");
    }
}
