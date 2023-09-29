package com.icaro.clase5;

public class P3Durmiente {

    public void dormir() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Falló sleep");
            e.printStackTrace();
        }
    }
}
