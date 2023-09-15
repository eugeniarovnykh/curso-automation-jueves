package com.icaro.clase4;

public class P2InstanciaEstudiante {

    public static void main(String[] args) {
        P1Estudiante p1Estudiante = new P1Estudiante(123, "Icaro", "Automation", 10.4f);

        System.out.println(p1Estudiante.getId());
        System.out.println(p1Estudiante.getNombre());
        System.out.println(p1Estudiante.getApellido());
        System.out.println(p1Estudiante.getPromedio());
    }
}
