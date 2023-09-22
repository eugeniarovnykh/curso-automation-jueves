package com.icaro.clase5;

public class Triangulo extends Figura implements Dibujable {
//    Crear la clase Triangulo que extienda de Figura. Esta clase tiene los atributos base y altura

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }
}
