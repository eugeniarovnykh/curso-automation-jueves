package com.icaro.clase5;

public interface Dibujable {

    void dibujar();

    default void borrar() {
        System.out.println("Borrando figura");
    }
}
