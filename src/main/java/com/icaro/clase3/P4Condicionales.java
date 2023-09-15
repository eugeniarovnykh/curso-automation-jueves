package com.icaro.clase3;

public class P4Condicionales {

    public static void main(String[] args) {


        // IF
        int var1 = 100;
        int var2 = 200;

        if (var1 < var2) {
            System.out.println("Var1 es manor a var2");
        }

        char var3 = 'C';
        char var4 = 'M';

        if (var3 == var4 ) {
            System.out.println("Los caractares son iguales");
        }
        else {
            System.out.println("Los caracteres son distintos");
        }


        long var5 = 1000;

        if (var5 < 10) {
            System.out.println("Valor chico");
        } else if (var5 > 50 && var5 <= 200) {
            System.out.println("Valor mediano");
        } else if (var5 > 500 && var5 < 1000) {
            System.out.println("Valor grande");
        } else {
            System.out.println("Valor muy grande");
        }


        // SWITCH - CASE
        String dia = "Domingo";

        switch (dia) {
            case "Lunes":
                System.out.println("Hoy es lunes");
                break;
            case "Martes":
                System.out.println("Hoy es martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es viernes");
                break;
            default:
                System.out.println("Es fin de semana :) ");
        }
    }
}
