package com.icaro.clase5;

public class ManejoException {

    public static void main(String[] args) {
        P3Durmiente durmiente = new P3Durmiente();

        System.out.println("Antes de dormir");
        durmiente.dormir();
        System.out.println("Despues de dormir");
    }
}
