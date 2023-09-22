package com.icaro.clase5;

import java.util.ArrayList;
import java.util.List;

public class ClaseAbstracta {
    public static void main(String[] args) {
        //    Desde una clase que contenga main, verificar que Figura no se puede instanciar

        Cuadrado cuadrado = new Cuadrado(20.5);
        Rectangulo rectangulo = new Rectangulo(10, 20);
//        Figura figura = new Figura(); NO se puede instanciar una clase abstracta
        Triangulo triangulo = new Triangulo(100, 2.5);


        List<Dibujable> listDibujable = new ArrayList<>();

        listDibujable.add(cuadrado);
        listDibujable.add(rectangulo);
        listDibujable.add(triangulo);
    }
}
